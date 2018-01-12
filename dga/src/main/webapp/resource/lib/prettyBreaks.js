/**
 * yxs,20170920,inspired by netsa-python
 */

var PrettyBreaks = {
	
	nice_intervals:[0.1, 0.2, 0.5, 1.0, 2.0, 2.5, 3.0, 5.0, 10.0],
	base:10.0,
	
	nice_ceil:function (x) {
		if (x == 0) {
			return 0;
		} else if (x < 0) {
			return this.nice_floor(x * (-1)) * (-1);
		} else {
			z = Math.pow(this.base, Math.floor(Math.log(x)/Math.log(this.base)));
			for (var i = 0; i < this.nice_intervals.length; i++) {
				result = this.nice_intervals[i] * z;
				if (x <= result) {
					return result;
				}
			}
			return this.nice_intervals[this.nice_intervals.length-1] * z;
		}
	},
	nice_floor :function (x) {
		if (x == 0) {
			return 0;
		} else if (x < 0) {
			return this.nice_ceil(x * (-1)) * (-1);
		} else {
			z = Math.pow(this.base, (Math.ceil(Math.log(x)/Math.log(this.base)) - 1.0));
			r = x / z;
			for (var i = this.nice_intervals.length - 1; i >= 1; i--) {
				result = this.nice_intervals[i] * z;
				if (x >= result) {
					return result;
				}
			}
			return this.nice_intervals[0] * z;
		}
	},
	nice_round:function (x) {
		if (x == 0) {
			return 0;
		}
		z = Math.pow(this.base, Math.ceil(Math.log(x)/Math.log(this.base)) - 1.0);            
		for (var i = 0; i < this.nice_intervals.length; i++) {
			result = this.nice_intervals[i] * z;
			cutoff = (result + this.nice_intervals[i + 1] * z) / 2.0;
			if (x <= cutoff) {
				return result;
			}
		}
		return this.nice_intervals[this.nice_intervals.length-1] * z;
	},
	nice_range:function (lo, hi, ticks, inside) {
		if (lo > hi) {
			throw "minnum must not bigger than maxnum.";
		}

		delta_x = hi - lo;
		if (delta_x == 0) {
			lo = this.nice_floor(lo);
			hi = this.nice_ceil(hi);
			delta_x = hi - lo;
			if (delta_x == 0) {
				lo = lo - 0.5;
				hi = hi + 0.5;
				delta_x = hi - lo;
			}
		}
		
		delta_t = this.nice_round(delta_x / (ticks - 1));
		if (inside) {
			lo_t = Math.ceil(lo / delta_t) * delta_t;
			hi_t = Math.floor(hi / delta_t) * delta_t;
		} else {
			lo_t = Math.floor(lo / delta_t) * delta_t;
			hi_t = Math.ceil(hi / delta_t) * delta_t;
		}
					
		return [lo_t, hi_t];
	},
	getBreaks:function (min, max, ticks) {
		var result = new Array(ticks);
		var roundRange = this.nice_range(min, max, ticks, false);
		var roundMin = roundRange[0];
		var roundMax = roundRange[1];
		var interval = (roundMax - roundMin) / ticks;
		result[0] = roundMin;
		for (var i = 1; i <= ticks ; i++) {
			result[i] = roundMin + interval * i;
		}
		return result;
	},
	getMin:function(list){
		if(list instanceof Array){
			var min=list[0];
			for(var i=0;i<list.length;i++){
				if(list[i]<min){
					min=list[i];
				}		
			}
			return min;
		}else{
			return 0;
		}
	},
	getMax:function(list){
		if(list instanceof Array){
			var max=list[0];
			for(var i=0;i<list.length;i++){
				if(max<list[i]){
					max=list[i];
				}		
			}
			return max;
		}else{
			return 0;			
		}
	}	
};