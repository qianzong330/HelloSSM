var LayerControl = {
    init: function () {

        //this.loadHTML();
        this.layerEvent();
    },
    changeLayer: function (keyparent) {
        var year = $("#sliderbar").slider("getValue");

        $("#tr_" + LayerControl.layerTreeConfig.Info_layer_ID).find(".Layer_box").attr("url", LayerControl.layerTreeConfig[keyparent][year].url);
        $("#tr_" + LayerControl.layerTreeConfig.Info_layer_ID).find(".td_BS1").text(LayerControl.layerTreeConfig[keyparent][year].name);
        this.setUrl(LayerControl.layerTreeConfig[keyparent][year].url, LayerControl.layerTreeConfig.Info_layer_ID);
    },
    Isload: false,
    openControl: function () {

        if (!this.Isload) {
            this.loadHTML();
            this.Isload = true;
        }
        $(".tb_layerControl_panel1").toggle();
    },
    loadHTML: function () {

        //详细图层
        var year = "2009";
        var key = "xzydgm";
        //console.log(App.map);
        //动态图层
        var layer_DT = App.map.layerIds;
        var index = 1;
        for (var i = 1; i < layer_DT.length; i++) {
            var layer = App.map.getLayer(layer_DT[i]);
            var label;
            if(layer.layerName){
            	label=layer.layerName;
            }
            else label="地块图";
            //修改方法获取图层原来的透明度
            var layerOpacity=parseFloat(layer.opacity)*100;
            
            var trstr = "<tr Condition='' id='tr_" + layer_DT[i] + "'><td>" + index + "</td><td class='td_BS1 '>"+label+"</td><td style='display:none'><img onclick='LayerControl.sort(this)' src='img/layerControl/layer_09.png' /></td><td><span class='layerControl_panel1_span_des'>透明度</span></td>";
            trstr += "<td><div layerID='" + layer_DT[i] + "' url='" + layer.url + "' class='Layer_box' left='"+layerOpacity+"'><div  class='Layer_bg'><div class='Layer_bgcolor ' style='width:"+layerOpacity+"px;'></div></div><div  class='Layer_bt' style='left:"+layerOpacity+"px;'></div></div></td><td style='width:30px;'><span class='span_percent'>"+layerOpacity+"%</span></td>";
            trstr += "<td style='width:40px;'><img onclick='LayerControl.openOrCloseLayer(this)' src='img/layerControl/layer_01.png' /></td></tr>";
            $(".tb_layerControl_layerInfo").append(trstr);
            index = index + 1;
        }

        //featruelayer
        var layerIds = App.map.graphicsLayerIds;
        for (var i = 0; i < layerIds.length; i++) {
          if(layerIds[i]!="labelLayer"){
            var layer = App.map.getLayer(layerIds[i]);
            var label;
            if(layer.layerName){
            	label=layer.layerName;
            }
            else label="地块图";
            if (layer.graphics.length != 0) {
            	//修改方法获取图层原来的透明度
            	var layerOpacity=parseFloat(layer.opacity)*100;
            	
                var trstr = "<tr Condition='' id='tr_" + layerIds[i] + "'><td>" + index + "</td><td class='td_BS1 '>"+label+"</td><td style='display:none'><img onclick='LayerControl.sort(this)' src='img/layerControl/layer_09.png' /></td><td><span class='layerControl_panel1_span_des'>透明度</span></td>";
                trstr += "<td><div layerID='" + layerIds[i] + "' url='" + layer.url + "' class='Layer_box' left='"+layerOpacity+"'><div  class='Layer_bg'><div class='Layer_bgcolor ' style='width:"+layerOpacity+"px;'></div></div><div  class='Layer_bt' style='left:"+layerOpacity+"px;'></div></div></td><td style='width:30px;'><span class='span_percent'>"+layerOpacity+"%</span></td>";
                trstr += "<td style='width:40px;'><img onclick='LayerControl.openOrCloseLayer(this)' src='img/layerControl/layer_01.png' /></td></tr>";
                $(".tb_layerControl_layerInfo").append(trstr);
                index = index + 1;
            }
          }
        }
        //自己加的div图层
        if ($("#chart_div").length != 0) {
        	var chartDivOpacity=100;
        	if(typeof($("#chart_div").css('opacity'))=='undefined'){
        		chartDivOpacity=parseFloat($("#chart_div").css('opacity'))*100;
        	}
        	
            var trstr = "<tr Condition=''><td>" + index + "</td><td class='td_BS1 '>柱状图</td><td style='display:none'><img onclick='LayerControl.sort(this)' src='img/layerControl/layer_09.png' /></td><td><span class='layerControl_panel1_span_des'>透明度</span></td>";
            trstr += "<td><div layerID='chart_div'  class='Layer_box' left='"+chartDivOpacity+"'><div  class='Layer_bg'><div class='Layer_bgcolor ' style='width:"+chartDivOpacity+"px;'></div></div><div  class='Layer_bt' style='left:"+chartDivOpacity+"px;'></div></div></td><td style='width:30px;'><span class='span_percent'>"+chartDivOpacity+"%</span></td>";
            trstr += "<td style='width:40px;'><img onclick='LayerControl.openOrCloseLayer_div(this)' src='img/layerControl/layer_01.png' /></td></tr>";
            $(".tb_layerControl_layerInfo").append(trstr);
        }

        this.layerTrag();
    },
    layerEvent: function () {
        //打开图层按钮事件
        $(".div_layerControl").on("click", function () {
            $(".tb_layerControl_panel1").show();

        });
        //图层切换事件
        $(".layerControl_panel1_layer").find("div.chidelayer").on("mouseover", function () {
            $(this).find("span").show();
        });
        $(".layerControl_panel1_layer").on("mouseout", function () {
            $(this).find("span").hide();
        });
        //关闭按钮事件
        $(".tb_layerControl_close").on("click", function () {
            $(".tb_layerControl_panel1").hide();

        });
    },
    layerTrag: function () {
        var $box = $('.Layer_box');
        var $bg = $('.Layer_bg');
        var $bgcolor = $('.Layer_bgcolor');
        var $btn = $('.Layer_bt');
        $box.unbind();
        $bg.unbind();
        $bgcolor.unbind();
        $btn.unbind();
        $('.Layer_box').attr("ox", 0);
        $('.Layer_box').attr("statu", 0);
//        $('.Layer_box').attr("left", 100);
        $btn.mousedown(function (e) {
            if ($(this).parent().find("div.Layer_bgcolor_HD").length != 0) return;
            $(this).parent().attr("lx", $(this).offset().left);
            $(this).parent().attr("ox", e.pageX - parseFloat($(this).parent().attr("left")));
            $(this).parent().attr("statu", 1);
        });
        $(document).mouseup(function () {
            $(".Layer_box").attr("statu", 0);
        });
        $box.mousemove(function (e) {
            if ($(this).attr("statu") == 1) {
                $(this).attr("left", e.pageX - parseFloat($(this).attr("ox")));
                if (parseFloat($(this).attr("left")) < 0) {
                    $(this).attr("left", "0px");
                }
                if (parseFloat($(this).attr("left")) > 100) {
                    $(this).attr("left", "100px");
                }
                $(this).find(".Layer_bt").css('left', $(this).attr("left") + "px");
                $(this).find(".Layer_bgcolor").width($(this).attr("left"));
                var percent = parseInt(parseFloat($(this).attr("left")));
                $(this).parent().parent().find("span.span_percent").text(percent + '%');
                var layerID = $(this).attr("layerID");
                if (layerID == "chart_div")
                    $("#chart_div").css("opacity", percent * 0.01);
                else
                    LayerControl.setOpacity(percent * 0.01, layerID);
            }
        });
        $bg.click(function (e) {
            if ($(this).parent().find("div.Layer_bgcolor_HD").length != 0) return;
            if ($(this).parent().attr("statu") == 0) {
                $(this).parent().attr("bgleft", $(this).offset().left);
                $(this).parent().attr("left", e.pageX - parseFloat($(this).parent().attr("bgleft")));

                if (parseFloat($(this).parent().attr("left")) < 0) {
                    $(this).parent().attr("left", "0px");
                }
                if (parseFloat($(this).parent().attr("left")) > 100) {
                    $(this).parent().attr("left", "100px");
                }
                $(this).parent().find(".Layer_bt").css('left', $(this).parent().attr("left") + "px");
                $(this).parent().find(".Layer_bgcolor").stop().animate({ width: $(this).parent().attr("left") }, 100);
                var percent = parseInt(parseFloat($(this).parent().attr("left")));
                $(this).parent().parent().parent().find("span.span_percent").text(percent + '%');
                var layerID = $(this).parent().attr("layerID");
                if (layerID == "chart_div")
                    $("#chart_div").css("opacity", percent * 0.01);
                else
                    LayerControl.setOpacity(percent * 0.01, layerID);
            }
        });
    },
    control_layer: function (self) {
        //for (var i = 0; i < map_control.Layer.length; i++)
        // if (map_control.Layer[i].LAYER_ID == $(self).attr("layerID")) App.cutMap(map_control.Layer[i]);

        $(".layerControl_panel1_layer_BJT").find("div").removeClass("layerControl_panel1_layer_choose");
        $(self).addClass("layerControl_panel1_layer_choose");
    },
    openOrCloseLayer: function (self) {
        var ID = $(self).parent().parent().find("div.Layer_box").attr("layerID");
        var layer = App.map.getLayer(ID);
        var Opacity = $(self).parent().parent().find("span.span_percent").text();
        if (layer.visible == false) {
            $(self).attr("src", "img/layerControl/layer_01.png");
            $(self).parent().parent().find("div.Layer_bgcolor").removeClass("Layer_bgcolor_HD");
            $(self).parent().parent().find("td.td_BS1").removeClass("color_no");
            layer.show();

        } else {
            $(self).attr("src", "img/layerControl/layer_02.png");
            $(self).parent().parent().find("div.Layer_bgcolor").addClass("Layer_bgcolor_HD");
            $(self).parent().parent().find("td.td_BS1").addClass("color_no");
            //隐藏对应图层
            layer.hide();
        }


    },
    openOrCloseLayer_div: function (self) {
        //$("#chart_div").hide();
        $("#chart_div").toggle();

        if ($(self).attr("src") == "img/layerControl/layer_02.png") {
            $(self).attr("src", "img/layerControl/layer_01.png");
            $(self).parent().parent().find("div.Layer_bgcolor").removeClass("Layer_bgcolor_HD");
            $(self).parent().parent().find("td.td_BS1").removeClass("color_no");
        } else {
            $(self).attr("src", "img/layerControl/layer_02.png");
            $(self).parent().parent().find("div.Layer_bgcolor").addClass("Layer_bgcolor_HD");
            $(self).parent().parent().find("td.td_BS1").addClass("color_no");
        }
    },
    //排序
    sort: function (self) {
        var layerID = $(self).parent().parent().find(".Layer_box").attr("layerID");
        if ($(self).parent().parent().prev().find(".Layer_box").length == 0) return;
        var html = $(self).parent().parent().prev().prop("outerHTML");
        $(self).parent().parent().prev().remove();
        $(self).parent().parent().after(html);

        this.layerSort();
        this.layerTrag();
    },
    //图层顺序
    layerSort: function () {
        $(".tb_layerControl_layerInfo").find("div.Layer_box").each(function () {
            if ($(this).attr("layerID") != App.seminarMapID) {
                var layer = _self.map.getLayer($(this).attr("layerID"));
                if (typeof (layer) != "undefined") {
                    var index = $(".tb_layerControl_layerInfo").find("tr").index($(this).parent().parent());
                    index = 3 - index;
                    _self.map.reorderLayer(layer, index);
                }
            }
        });
    },
    //打开图层过滤
    openFitter: function (self) {
        if (!$(self).parent().parent().find("div.Layer_bgcolor").hasClass("Layer_bgcolor_HD")) {
            var layerID = $(self).parent().parent().find(".Layer_box").attr("layerID");
            $(".div_layerFitter").show();
            $(".div_layerFitter").attr("layerID", layerID);

            var Condition = $("#tr_" + layerID).attr("Condition");
            if (Condition != "") {
                var ConditionList = [];
                if (Condition.indexOf("or") > 0) {
                    ConditionList = Condition.split("or ");
                    $(".select_ConditionFeid_LJ").val("or");
                }
                else {
                    ConditionList = Condition.split("and ");
                    $(".select_ConditionFeid_LJ").val("and");
                }

                for (var i = 0; i < ConditionList.length; i++) {
                    if (ConditionList[i] == "1=1 ") continue;
                    var feidList = ConditionList[i].split(" ");
                    LayerControl.addCondition(feidList[0], feidList[1], feidList[2].replace(/%/g, ""));
                }
            }
        }
    },
    //增加一个条件
    addCondition: function (option1, option2, value1) {
        value1 = value1 == "" ? "''" : value1;
        var layerID = $(".div_layerFitter").attr("layerID");
        var optionStr = "";
        for (var i = 0; i < shpTDZservice.length; i++) {
            if (shpTDZservice[i].layer_ID == layerID) {
                var fitterFeid = shpTDZservice[i].fitterFeid;
                for (var j = 0; j < fitterFeid.length; j++) {
                    var choose = option1 == fitterFeid[j][0] ? "selected='selected'" : "";
                    optionStr += "<option " + choose + " value='" + fitterFeid[j][0] + "'>" + fitterFeid[j][1] + "</option>";
                }
            }
        }
        var FU_QYStr = "";
        for (var i = 0; i < FU_QY.length; i++) {
            var choose = option2 == FU_QY[i][0] ? "selected='selected'" : "";
            FU_QYStr += "<option " + choose + " value='" + FU_QY[i][0] + "'>" + FU_QY[i][1] + "</option>";
        }
        var trStr = "<tr><td><select class='select_ConditionFeid'>" + optionStr + "</select></td><td><select class='select_FH'>" + FU_QYStr + "</select></td><td><input value=" + value1 + " type='text'/></td><td style='width:60px;'><img onclick='$(this).parent().parent().remove()' style='cursor:pointer;' src='img/layerControl/layer_06.png' /></td></tr>";
        $(".div_layerFitter_middle_tb").append(trStr);
    },
    //应用到过滤器
    DoFitter: function () {
        var index = 0;
        var ConditionFeid_LJ = $(".select_ConditionFeid_LJ").val()
        var Condition = "";
        $(".div_layerFitter").find("tr").each(function () {
            if (index != 0) {
                var txt_WZ = $(this).find("input").val();
                var ConditionFeid = $(this).find(".select_ConditionFeid").val();
                var FH = $(this).find(".select_FH").val();
                var ConditionFeid_LJ_par = index == 1 ? "" : ConditionFeid_LJ + " ";
                if (txt_WZ != "") {
                    if (FH == "like")
                        Condition = Condition + ConditionFeid_LJ_par + ConditionFeid + " " + FH + " '%" + txt_WZ + "%'";
                    else
                        Condition = Condition + ConditionFeid_LJ_par + ConditionFeid + " " + FH + " '" + txt_WZ + "'";
                }
            }
            index++;
        });
        this.closeDoFitter();

        //过滤
        var layerID = $(".div_layerFitter").attr("layerID");
        var layer = GISobj.map.getLayer(layerID);
        layer.setDefinitionExpression(Condition);
        $("#tr_" + layerID).attr("Condition", Condition);
        if (Condition == "")
            $("#tr_" + layerID).find(".img_Fitter").attr("src", "img/layerControl/layer_05.png");
        else
            $("#tr_" + layerID).find(".img_Fitter").attr("src", "img/layerControl/layer_051.png");


    },
    closeDoFitter: function () {
        var tr1 = $(".div_layerFitter").find("tr").eq(0).prop("outerHTML");
        $(".div_layerFitter_middle_tb").html(tr1);
        $('.div_layerFitter').hide();

    },
    setOpacity: function (opacity, layerID) {
        var layer = App.map.getLayer(layerID);
        if (typeof (layer) != "undefined")
            layer.setOpacity(opacity);
    },
    //改变图层URL
    setUrl: function (url, layerID) {
        var layer = _self.map.getLayer(layerID);
        if (typeof (layer) != "undefined") {
            _self.clearLayers(layerID);
            _self.addDynamicLayer(url, layerID);
        }
    }
}

