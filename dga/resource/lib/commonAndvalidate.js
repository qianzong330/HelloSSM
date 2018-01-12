/**
 * js验证
 */
var Wi = [7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2, 1];    // 加权因子
var ValideCode = [1, 0, 10, 9, 8, 7, 6, 5, 4, 3, 2];            // 身份证验证位值.10代表X
function IdCardValidate(idCard) {
    idCard = trim(idCard.replace(/ /g, ""));               //去掉字符串头尾空格                     
    if (idCard.length == 15) {
        return isValidityBrithBy15IdCard(idCard);       //进行15位身份证的验证    
    } else if (idCard.length == 18) {
        var a_idCard = idCard.split("");                // 得到身份证数组   
        if (isValidityBrithBy18IdCard(idCard) && isTrueValidateCodeBy18IdCard(a_idCard)) {   //进行18位身份证的基本验证和第18位的验证
            return true;
        } else {
            return false;
        }
    } else {
        return false;
    }
}
/**
 * 判断身份证号码为18位时最后的验证位是否正确
 * @param a_idCard 身份证号码数组
 * @return
 */
function isTrueValidateCodeBy18IdCard(a_idCard) {
    var sum = 0;                             // 声明加权求和变量   
    if (a_idCard[17].toLowerCase() == 'x') {
        a_idCard[17] = 10;                    // 将最后位为x的验证码替换为10方便后续操作   
    }
    for (var i = 0; i < 17; i++) {
        sum += Wi[i] * a_idCard[i];            // 加权求和   
    }
    valCodePosition = sum % 11;                // 得到验证码所位置   
    if (a_idCard[17] == ValideCode[valCodePosition]) {
        return true;
    } else {
        return false;
    }
}
/**
 * 验证18位数身份证号码中的生日是否是有效生日
 * @param idCard 18位书身份证字符串
 * @return
 */
function isValidityBrithBy18IdCard(idCard18) {
    var year = idCard18.substring(6, 10);
    var month = idCard18.substring(10, 12);
    var day = idCard18.substring(12, 14);
    var temp_date = new Date(year, parseFloat(month) - 1, parseFloat(day));
    // 这里用getFullYear()获取年份，避免千年虫问题   
    if (temp_date.getFullYear() != parseFloat(year)
        || temp_date.getMonth() != parseFloat(month) - 1
        || temp_date.getDate() != parseFloat(day)) {
        return false;
    } else {
        return true;
    }
}

/**
 * 验证15位数身份证号码中的生日是否是有效生日
 * @param idCard15 15位书身份证字符串
 * @return
 */
function isValidityBrithBy15IdCard(idCard15) {
    var year = idCard15.substring(6, 8);
    var month = idCard15.substring(8, 10);
    var day = idCard15.substring(10, 12);
    var temp_date = new Date(year, parseFloat(month) - 1, parseFloat(day));
    // 对于老身份证中的你年龄则不需考虑千年虫问题而使用getYear()方法
    if (temp_date.getYear() != parseFloat(year)
        || temp_date.getMonth() != parseFloat(month) - 1
        || temp_date.getDate() != parseFloat(day)) {
        return false;
    } else {
        return true;
    }
}
//去掉字符串头尾空格   
function trim(str) {
    return str.replace(/(^\s*)|(\s*$)/g, "");
}
/**
 * 验证手机号
 * @param phone
 * @returns {Boolean}
 */
function validatePhone(phone) {
    var myreg = /^0?1[3|4|5|8|7][0-9]\d{8}$/;
    if (!myreg.test(phone)) {
        return false;
    }
    return true;
}
/**
 * 验证邮箱
 * @param email
 * @returns {Boolean}
 */
function validateMail(email) {
    var email_reg = /^[\w-]+(\.[\w-]+)*@([\w-]+\.)+[a-zA-Z]+$/;
    if (email == "" || !email_reg.test(email)) {
        return false;
    }
    return true;
}

/**
 * 检验是否为数字
 * @param chars
 * @returns {boolean}
 */
function isDecimal(num) {
    var reg = /^\d*\.?\d*$/;
    if (num.match(reg) == null)
        return false;
    else
        return true;
}

/**
 * 获取当前请求的上下文路径
 * @returns {String}
 */
function getRootPath() {
    //获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
    var curWwwPath = window.document.location.href;
    //获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
    var pathName = window.document.location.pathname;
    var pos = curWwwPath.indexOf(pathName);
    //获取主机地址，如： http://localhost:8083
    var localhostPaht = curWwwPath.substring(0, pos);
    //获取带"/"的项目名，如：/uimcardprj
    var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
    if (projectName == '/page' || projectName == '/server') {
        projectName = '';
    }

    return (localhostPaht + projectName) + "/";
}

function getHost() {
    //获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
    var curWwwPath = window.document.location.href;
    //获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
    var pathName = window.document.location.pathname;
    var pos = curWwwPath.indexOf(pathName);
    //获取主机地址，如： http://localhost:8083
    var localhostPaht = curWwwPath.substring(0, pos);

    return (localhostPaht) + "/";
}
/**
 * 删除当前访问路径的Cookie信息
 * @param name
 */
function delCookie(name) {
    //获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
    var pathName = window.document.location.pathname;
    var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1) + "/";
    if (projectName == '/page' || projectName == '/post') {
        projectName = '/';
    }
    var date = new Date();
    date.setTime(date.getTime() - 10000);
    document.cookie = name + "=; expire=" + date.toGMTString() + "; path=" + projectName;
}

function getCookie(name) {
    var arr, reg = new RegExp("(^| )" + name + "=([^;]*)(;|$)");
    if (arr = document.cookie.match(reg))
        return arr[2];
    else
        return null;
}

function setSessionCookie(name, value, cookiePath) {
    var isIE = !-[1,];//判断是否是ie核心浏览器
    if (isIE) {
        if (value) {
            var expire = "; expires=At the end of the Session";
            var path = "";
            if (cookiePath != null) {
                path = "; path=" + cookiePath;
            }
            document.cookie = name + "=" + encodeURI(value) + expire + path;
        }
    } else {
        if (value) {
            var expire = "; expires=Session";
            var path = "";
            if (cookiePath != null) {
                path = "; path=" + cookiePath;
            }
            document.cookie = name + "=" + encodeURI(value) + expire + path;
        }
    }
}

/**
 * 提取url中的参数
 * @param url
 * @returns {Object}
 */
function handleUrl(url) {
    if (!url) {
        url = location.search.substring(1);
    } else {
        url = url.substr(url.indexOf('?') + 1);
    }
    var args = new Object();
    var query = decodeURI(url);
    var pairs = query.split("&");
    for (var i = 0; i < pairs.length; i++) {
        var pos = pairs[i].indexOf('=');
        if (pos == -1) continue;
        var argname = pairs[i].substring(0, pos);
        var value = pairs[i].substring(pos + 1);
        args[argname] = decodeURI(value);
    }
    return args;
}

function ajax(json) {
    $.ajax({
        url: json.url,
        data: json.data ? json.data : null,
        type: json.type,
        dataType: json.dataType,
        contentType: json.contentType ? json.contentType : "application/x-www-form-urlencoded",
        async: json.async != undefined ? json.async : true,
        success: function (data) {
            if (data.status == "400") {
                goLogin();
            } else if (data.status == "401") {
                alert(data.msg);
            } else {
                json.success(data);
            }
        },
        error: function () {
            layer.msg("服务器繁忙，请稍后重试！", {icon: 2, time: 2000});
        }
    });
}

function isInclude(name) {
    var js = /js$/i.test(name);
    var es = document.getElementsByTagName(js ? 'script' : 'link');
    for (var i = 0; i < es.length; i++)
        if (es[i][js ? 'src' : 'href'].indexOf(name) != -1)return true;
    return false;
}

function loadJS(name) {
    var oHead = document.getElementsByTagName('HEAD').item(0);
    var oScript = document.createElement("script");
    oScript.type = "text/javascript";
    oScript.src = name;
    oHead.appendChild(oScript);
}

function goLogin() {
    if (self != top) {
        //不是顶层页面
        top.location.href = getHost() + "sso-server/login.html"
    } else {
        parent.location.href = getHost() + "sso-server/login.html"
    }
}

//解析树
function parseTree(sNodes, pid) {
    var i, l,
        key = "id",
        parentKey = pid,
        childKey = "children";
    var r = [];
    var tmpMap = [];
    for (i = 0, l = sNodes.length; i < l; i++) {
        tmpMap[sNodes[i][key]] = sNodes[i];
    }
    for (i = 0, l = sNodes.length; i < l; i++) {
        if (tmpMap[sNodes[i][parentKey]] && (sNodes[i][key] != sNodes[i][parentKey])) {
            if (!tmpMap[sNodes[i][parentKey]][childKey]) {
                tmpMap[sNodes[i][parentKey]]['state'] = "closed";
                tmpMap[sNodes[i][parentKey]][childKey] = [];
            }
            tmpMap[sNodes[i][parentKey]][childKey].push(sNodes[i]);
        } else {
            r.push(sNodes[i]);
        }
    }
    return r;
}

//拖拽
function Drag(target) {
    var _this = this;
    this.disX = 0;
    this.disY = 0;
    this.oDiv = document.getElementById(target);
    this.oDiv.style.cursor = "move";
    this.oDiv.onmousedown = function (ev) {
        _this.doDown(ev);
    }
}

Drag.prototype.doDown = function (ev) {
    var _this = this;
    var oEvent = ev || event;
    this.disX = oEvent.clientX - this.oDiv.offsetLeft;
    this.disY = oEvent.clientY - this.oDiv.offsetTop;
    document.onmousemove = function (ev) {
        _this.doMove(ev);
    };

    document.onmouseup = function () {
        _this.doUp();
    };
};

Drag.prototype.doMove = function (ev) {
    var oEvent = ev || event;
    if (oEvent.preventDefault) {
        oEvent.preventDefault();//IE以外
    } else {
        oEvent.returnValue = false;//IE
    }
    var left = oEvent.clientX - this.disX;
    var top = oEvent.clientY - this.disY;
    var clientWidth = document.documentElement.clientWidth || document.body.clientWidth;
    var clientHeight = document.documentElement.clientHeight || document.body.clientHeight;
    if (left < 0) {
        left = 0;
    } else if (left > clientWidth - this.oDiv.offsetWidth) {
        left = clientWidth - this.oDiv.offsetWidth;
    }

    if (top < 0) {
        top = 0;
    } else if (top > clientHeight - this.oDiv.offsetHeight) {
        top = clientHeight - this.oDiv.offsetHeight
    }

    //一定要加上px，用于处理兼容性问题
    this.oDiv.style.left = left + "px";
    this.oDiv.style.top = top + "px";
};

Drag.prototype.doUp = function () {
    document.onmousemove = null;
    document.onmouseup = null;
};

Array.prototype.indexOf = function (val) {
    for (var i = 0; i < this.length; i++) {
        if (this[i] == val) {
            return i;
        }
    }
    return -1;
};
Array.prototype.remove = function (val) {
    var index = this.indexOf(val);
    if (index > -1) {
        this.splice(index, 1);
    }
};


function Map() {
    this.keys = new Array();
    this.data = new Object();

    this.put = function (key, value) {
        if (this.data[key] == null) {
            this.keys.push(key);
        }
        this.data[key] = value;
    };

    this.containsKey = function (key) {
        for (var i = 0; i < this.keys.length; i++) {
            if (this.keys[i] == key) {
                return true;
            }
        }
        return false;
    };

    this.get = function (key) {
        return this.data[key];
    };

    this.remove = function (key) {
        this.keys.remove(key);
        this.data[key] = null;
    };

    this.each = function (fn) {
        if (typeof fn != 'function') {
            return;
        }
        var len = this.keys.length;
        for (var i = 0; i < len; i++) {
            var k = this.keys[i];
            fn(k, this.data[k], i);
        }
    };

    this.entrys = function () {
        var len = this.keys.length;
        var entrys = new Array(len);
        for (var i = 0; i < len; i++) {
            var tmp = this.keys[i];
            entrys[i] = {
                key: tmp,
                value: this.data[tmp]
            };
        }
        return entrys;
    };

    this.isEmpty = function () {
        return this.keys.length == 0;
    };

    this.size = function () {
        return this.keys.length;
    };

    this.toString = function () {
        var s = "{";
        for (var i = 0; i < this.keys.length; i++, s += ',') {
            var k = this.keys[i];
            s += k + "=" + this.data[k];
        }
        s += "}";
        return s;
    };
}

//个人中心获取用户信息
function getUserInfo(url) {
    ajax({
        url: url,
        dataType: 'json',
        type: 'post',
        async: false,
        success: function (result) {
            var datas = result.data;
            if (datas != undefined) {
                //修改用户名
                $(".header .userName").text(datas.nickname);
                if (datas.headImg != undefined && datas.headImg != "" && datas.headImg != null) {
                    $(".header .userImg").attr("src", datas.headImg);
                }
            }
        }, error: function () {
            alert("系统繁忙");
        }
    });
}
//图片下载操作,指定图片类型
/**
 * 打印图片和下载
 * @param type 图片是什么类型的 png,jpg等
 * @param canvas
 */
function download(type, canvas) {
    //设置保存图片的类型
    var imgdata = canvas.toDataURL(type);
    //将mime-type改为image/octet-stream,强制让浏览器下载
    var fixtype = function (type) {
        type = type.toLocaleLowerCase().replace(/jpg/i, 'jpeg');
        var r = type.match(/png|jpeg|bmp|gif/)[0];
        return 'image/' + r;
    };
    imgdata = imgdata.replace(fixtype(type), 'image/octet-stream');
    //将图片保存到本地
    var saveFile = function (data, filename) {
        //console.log(data);
        var link = document.createElement('a');
        link.href = data;
        link.download = filename;
        var event = document.createEvent('MouseEvents');
        event.initMouseEvent('click', true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);
        link.dispatchEvent(event);
    };
    var filename = new Date().toLocaleDateString() + '.' + type;
    saveFile(imgdata, filename);
}


//获取地址栏参数
function getUrlPara(paraName) {
    var sUrl = location.href;
    var sReg = "(?:\\?|&){1}" + paraName + "=([^&]*)";
    var re = new RegExp(sReg, "gi");
    if (re.test(sUrl)) {
        re.exec(sUrl);
        return RegExp.$1;
    } else {
        return null;
    }
}

//获取min至max的随机数
function getRandom(min, max) {
    return Math.random() * max + min;
}

//获取min至max的随机整数
function getRandomInt(min, max) {
    return parseInt(getRandom(min, max));
}

//获取min至max的随机浮点数
function getRandomFloat(min, max) {
    return parseFloat(getRandom(min, max));
}

//导出地图
function exportMap() {
    var imgsrc = null;
    var omap = map.getMap();
    omap.once('postcompose', function (event) {
        var ca = event.context.canvas;
        var canvas = scaleCanvas(ca, ca.width, ca.height);
        imgsrc = canvas.toDataURL('image/png');
    });
    omap.renderSync();
    return imgsrc;
}


function scaleCanvas(canvas, width, height) {
    var w = canvas.width,
        h = canvas.height;
    //var n = w / width;
    if (width == undefined) {
        width = w;
    }
    if (height == undefined) {
        height = h;
    }
    var retCanvas = document.createElement('canvas');
    retCanvas.crossOrigin = "*";
    var retCtx = retCanvas.getContext('2d');
    retCtx.crossOrigin = "*";
    retCanvas.width = width;
    retCanvas.height = height;
    //retCtx.drawImage(canvas, 0, 0, w, h,0,(height-h/n)/2, width, h/n);
    retCtx.drawImage(canvas, (w - width) / 2, (h - height) / 2, width, height, 0, 0, width, height);
    return retCanvas;
}

//打印地图
function printMap() {
    var imgsrc = null;
    map.once('postcompose', function (event) {
        var canvas = event.context.canvas;
        imgsrc = canvas.toDataURL('image/png');
    });
    map.renderSync();
    if (null != imgsrc) {
        //var obj = document.getElementById("map");
        var newWindow = window.open("", "_blank");
        newWindow.document.write("<img src='" + imgsrc + "'></img>");
        newWindow.document.close();
        newWindow.print();
        newWindow.close();
    }
}

//对地图进行分享
function sharemap() {

    if (mapid) {
        var url = window.location.href.replace("#", "");
        $("#shareinput").val(url);
        var sharetextarea = '<iframe width=480 height=300 src="' + url + '" frameborder=0></iframe>';
        $("#sharetextarea").text(sharetextarea);
        $("#shareimg").attr("src", getRootPath() + "server/map/qrcode?content=" + url);
    } else {
        layer.msg("请先保存地图才能进行分享", {icon: 8, time: 2000});
        return false;
    }
}

/**
 * 倒序排列
 * @param arr
 * @param key
 */
function sortByKey(arr,key){
    return arr.sort(function (a,b){
        var x = parseFloat(a[key]),y = parseFloat(b[key]);
        return x > y ? 1 : (x < y ? -1 : 0);
    });
}