//>>built
(function(c,a){"object"===typeof exports&&"undefined"!==typeof module&&"function"===typeof require?a(require("../moment")):"function"===typeof define&&define.amd?define("moment/locale/zh-cn",["../moment"],a):a(c.moment)})(this,function(c){return c.defineLocale("zh-cn",{months:"\u4e00\u6708 \u4e8c\u6708 \u4e09\u6708 \u56db\u6708 \u4e94\u6708 \u516d\u6708 \u4e03\u6708 \u516b\u6708 \u4e5d\u6708 \u5341\u6708 \u5341\u4e00\u6708 \u5341\u4e8c\u6708".split(" "),monthsShort:"1\u6708 2\u6708 3\u6708 4\u6708 5\u6708 6\u6708 7\u6708 8\u6708 9\u6708 10\u6708 11\u6708 12\u6708".split(" "),
weekdays:"\u661f\u671f\u65e5 \u661f\u671f\u4e00 \u661f\u671f\u4e8c \u661f\u671f\u4e09 \u661f\u671f\u56db \u661f\u671f\u4e94 \u661f\u671f\u516d".split(" "),weekdaysShort:"\u5468\u65e5 \u5468\u4e00 \u5468\u4e8c \u5468\u4e09 \u5468\u56db \u5468\u4e94 \u5468\u516d".split(" "),weekdaysMin:"\u65e5\u4e00\u4e8c\u4e09\u56db\u4e94\u516d".split(""),longDateFormat:{LT:"Ah\u70b9mm\u5206",LTS:"Ah\u70b9m\u5206s\u79d2",L:"YYYY-MM-DD",LL:"YYYY\u5e74MMMD\u65e5",LLL:"YYYY\u5e74MMMD\u65e5Ah\u70b9mm\u5206",LLLL:"YYYY\u5e74MMMD\u65e5ddddAh\u70b9mm\u5206",
l:"YYYY-MM-DD",ll:"YYYY\u5e74MMMD\u65e5",lll:"YYYY\u5e74MMMD\u65e5Ah\u70b9mm\u5206",llll:"YYYY\u5e74MMMD\u65e5ddddAh\u70b9mm\u5206"},meridiemParse:/\u51cc\u6668|\u65e9\u4e0a|\u4e0a\u5348|\u4e2d\u5348|\u4e0b\u5348|\u665a\u4e0a/,meridiemHour:function(a,b){12===a&&(a=0);return"\u51cc\u6668"===b||"\u65e9\u4e0a"===b||"\u4e0a\u5348"===b?a:"\u4e0b\u5348"===b||"\u665a\u4e0a"===b?a+12:11<=a?a:a+12},meridiem:function(a,b,c){a=100*a+b;return 600>a?"\u51cc\u6668":900>a?"\u65e9\u4e0a":1130>a?"\u4e0a\u5348":1230>
a?"\u4e2d\u5348":1800>a?"\u4e0b\u5348":"\u665a\u4e0a"},calendar:{sameDay:function(){return 0===this.minutes()?"[\u4eca\u5929]Ah[\u70b9\u6574]":"[\u4eca\u5929]LT"},nextDay:function(){return 0===this.minutes()?"[\u660e\u5929]Ah[\u70b9\u6574]":"[\u660e\u5929]LT"},lastDay:function(){return 0===this.minutes()?"[\u6628\u5929]Ah[\u70b9\u6574]":"[\u6628\u5929]LT"},nextWeek:function(){var a;a=c().startOf("week");a=604800<=this.unix()-a.unix()?"[\u4e0b]":"[\u672c]";return 0===this.minutes()?a+"dddAh\u70b9\u6574":
a+"dddAh\u70b9mm"},lastWeek:function(){var a;a=c().startOf("week");a=this.unix()<a.unix()?"[\u4e0a]":"[\u672c]";return 0===this.minutes()?a+"dddAh\u70b9\u6574":a+"dddAh\u70b9mm"},sameElse:"LL"},ordinalParse:/\d{1,2}(\u65e5|\u6708|\u5468)/,ordinal:function(a,b){switch(b){case "d":case "D":case "DDD":return a+"\u65e5";case "M":return a+"\u6708";case "w":case "W":return a+"\u5468";default:return a}},relativeTime:{future:"%s\u5185",past:"%s\u524d",s:"\u51e0\u79d2",m:"1 \u5206\u949f",mm:"%d \u5206\u949f",
h:"1 \u5c0f\u65f6",hh:"%d \u5c0f\u65f6",d:"1 \u5929",dd:"%d \u5929",M:"1 \u4e2a\u6708",MM:"%d \u4e2a\u6708",y:"1 \u5e74",yy:"%d \u5e74"},week:{dow:1,doy:4}})});