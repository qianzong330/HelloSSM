/*此JS文件条件选择区的区域下的全国城市面板*/

//城市切换模块，切换 按城市和按省份搜索
$("#selCityProvince").click(function (e) {
	$(this).addClass("sel-city-btnl-sel").next().removeClass("sel-city-btnl-sel");
    $(".map_popup .province").show();
    $(".map_popup .city").hide();
    e.stopPropagation();
});

$("#selCityCity").click(function (e) {
   $(this).addClass("sel-city-btnl-sel").prev().removeClass("sel-city-btnl-sel");
   $(".map_popup .city").show();
   $(".map_popup .province").hide();
   e.stopPropagation();
});
//使用enter键进行快捷搜索
$("#selCity").keypress(function (event) {
    if (event.keyCode == 13 || event.which == 13) {
        cityChangeSearch();
    }
});
//输入查询条件时，阻止冒泡
$('#selCity').click(function (e) {
	 e.stopPropagation();
});
$("#selCitySubmit").click(function () {
    cityChangeSearch();
});

//获得省份列表
$.ajax({
    type: "post",
    url: getRootPath() + "dgagis/HomePage/js/config/quyuData.json",
    dataType: 'json',
    async: false,
    success: function (data) {
//    	console.log(data);
        $("#province").empty();
        $("#provices").empty();    
        var provinceArr=[]; var arr1=[];
        var htmlDiv = '';     
        data.mapList.forEach(function(item,index){
        	
        	provinceArr.push(item.FIRSTCHAR);
        	
        	var cityArr=item.CHILDRENS.split(',');
        	var htmlStr='';
        	cityArr.forEach(function(items){
        		var cityNameArr=items.split(':');
        		htmlStr+='<a code="' + cityNameArr[0] + '" >'+cityNameArr[1]+'</a>'
        	});
        	
        	htmlDiv += '<tr>'+
        		'<td class="sel-city-td-letter"><div id="p' + item.FIRSTCHAR + '" >' + item.FIRSTCHAR + '</div></td>'+
        	    '<td class="sel-city-td-sf"><a code="'+ item.DISTRICTCODE + '" style="width:45px;">'+ item.DISTRICTNAME + '</a></td><td>'+htmlStr+'</td></tr>';	 
    
        });
        $("#provices").append(htmlDiv);
        htmlDiv='';
        //获得26个英文字母
        for(var i=0,l=provinceArr.length;i<l;i++){
            if(arr1.indexOf(provinceArr[i])==-1){
            	arr1.push(provinceArr[i]);
            	htmlDiv += '<a id=p1"' + provinceArr[i] + '" class="pAleph">' + provinceArr[i] + "</a>";
            }
        }
    	$("#province").append(htmlDiv);
        //快速搜索字母表的省份
        $(".pAleph").click(function (e) {
        	 document.getElementById('p' + $(e.target).text()).scrollIntoView();
        	 e.stopPropagation();
        });
        
        $("#provices a").click(function (event) {
        	getAreaLatLng( $(this).attr('code'));
        	$('.map_popup').hide();
        });
    }
});
//获得城市列表
$.ajax({
    type: "post",
    url: getRootPath() +"dgagis/HomePage/js/config/quyu1Data.json",
    dataType: 'json',
    async: false,
    success: function (data) {
//    	console.log(data);
        $("#city").empty();
        $("#cities").empty();
        var htmlDiv='';
        if(data.status){
        	data.mapList.forEach(function(item){
        		  var html = '<a id=c1"' + item.FIRSTCHAR + '" class="cAleph">' + item.FIRSTCHAR + "</a>";
                  $("#city").append(html);
                  
        		var cityArr=item.DISTRICTS.split(',');
            	var htmlStr='';
            	cityArr.forEach(function(items){
            		var cityNameArr=items.split(':');
            		htmlStr+='<a code="' + cityNameArr[0] + '">'+cityNameArr[1]+'</a>'
            	});
            	
            	htmlDiv += '<tr>'+
            		'<td class="sel-city-td-letter"><div id="c' + item.FIRSTCHAR + '">' + item.FIRSTCHAR + '</div></td>'+
            	    '<td>'+htmlStr+'</td></tr>';
        	});
        	 $("#cities").append(htmlDiv);
        }
        
    
        $(".cAleph").click(function (e) {
            document.getElementById('c' + $(e.target).text()).scrollIntoView();
            e.stopPropagation();
        });
        $("#cities a").click(function (event) {
        	getAreaLatLng( $(this).attr('code'));
        	$('.map_popup').hide();
        });
    }
});

function cityChangeSearch() {

    var value = $.trim($("#selCity").val());
//    if ((!value) || value.length < 2 || value.length > 10) {
//    	App.dialog.show('提示信息','请输入正确的查询条件');
////        $("#selCityNote").css("display", "block");
//        return;
//    }
    $.ajax({
        type: "post",
        url: getRootPath() +"dgagis/HomePage/js/config/quyuData.json",
        data: { "districtName": value },
        dataType: 'json',
        async: false,
        success: function (data) {
        	console.log(data);
        	if(data.status){//暂时还没有对查询到的结果进行处理
        		$(".map_popup").css("display", "none");
//        		 map.centerAndZoom(new esri.geometry.Point(latlon.split(",")[0], latlon.split(",")[1]), 8);

        	}
        	else{
        		App.dialog.show('提示信息','暂无信息');
        	}
        }
    });
}


function getAreaLatLng(code){
	if(code.indexOf("41") < 0){
		return;//当前只支持定位查询河南省市
	}
	//通过点击当前城市code获得当前城市的经纬度
	$.ajax({
	    type: "post",
	    url: getRootPath() + "resource/config/HNClickData.json",
	    data:{
	    	districtCode:code
	    },
	    dataType: 'json',
	    async: false,
	    success: function (data) {
	    	var data1 = [];
    		for(var i = 0; i < data.data.length; i++){
    			if(code == data.data[i]["DISTRICTCODE"]){
    				data1.push(data.data[i]);
    				break;
    			}
    		}
	    	//var data1 = data.data;
//	    	console.log(data1);
	    	if(data.status){
	    		if(data1.length > 0){
	    			var cityName = '全国';
	    			if(data1[0].DISTRICTLEVEL=='0'){ //0代表全国
	    				$('#'+getDivisionID).attr('code','');//赋值此城市的区域code
	            		$('#'+getDivisionID).attr('parentCode','"",全国');//赋值此城市的省份的区域code	
	            		$('#'+getDivisionID).attr('level','0');//赋值此城市的level等级	
	            		
	            		UI.fullMap();
	    			    return;
	    			}
	    			else if(data1[0].DISTRICTLEVEL=='1'){//根据等级判断是否为省份
	    				App.map.centerAndZoom(new esri.geometry.Point(data1[0].X, data1[0].Y), 5);	
	    			}
	    			else{
	    				App.map.centerAndZoom(new esri.geometry.Point(data1[0].X, data1[0].Y),6);
	    				cityName=data1[0].ADDRESS.substr(0,2);
	    				if(cityName=='黑龙' || cityName=='内蒙'){cityName=data1[0].ADDRESS.substr(0,3);}
	    			}
//	    			console.log(cityName);
	    			if($('#'+getDivisionID)){
	            		if($('#'+getDivisionID).val()){
	            		    $('#'+getDivisionID).val(data1[0].DISTRICTNAME);
	            		}else{
	            			$('#'+getDivisionID).text(data1[0].DISTRICTNAME);
	            		}
	            		$('#'+getDivisionID).attr('code',data1[0].DISTRICTCODE);//赋值此城市的区域code	
	            	    $('#'+getDivisionID).attr('parentCode',data1[0].PARENTCODE + ',' + cityName);//赋值此城市的省份区域code	
	            		$('#'+getDivisionID).attr('level',data1[0].DISTRICTLEVEL);//赋值此城市的level等级	
		            	
	    			}
//	    			 $('.btnOK').trigger("click");//经营风险的查询按钮点击事件
//	    			 $("#btn_query").trigger("click");//业务分布的查询按钮点击事件
	    		}else{
    				$('#'+getDivisionID).attr('code','');//赋值此城市的区域code
            		$('#'+getDivisionID).attr('parentCode','"",全国');//赋值此城市的区域code	
            		$('#'+getDivisionID).attr('level','0');//赋值此城市的区域code	
            		
            		UI.fullMap();    
	    		}
	    	}
	    },
	    error:function(status){
	    	console.log(status.response);
	    }
	});	
}
