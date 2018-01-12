define([
"dojo/_base/declare"
, "esri/request"
, "dojo/dom"
, "esri/tasks/query"
, "esri/tasks/QueryTask"
, "esri/layers/GraphicsLayer"
, "esri/symbols/SimpleFillSymbol"
, "esri/graphic"
, "esri/geometry/Point"
, "esri/units"
, "esri/SpatialReference"
, "esri/config"
]
, function (declare, esriRequest, dom, Query, QueryTask, GraphicsLayer, SimpleFillSymbol, Graphic, Point, Units, SpatialReference, config) {

    var thisQuery = null
    var GISobj = null;
    //点图层
    var pointGraphicsLayer = null;
    //线图层
    var polylineGraphicsLayer = null;
    //面图层
    var polygonGraphicsLayer = null;
    //面结果
    var polygonSymbol = null;


    declare("widgets.Query", null, {
        constructor: function (args) {
            dojo.safeMixin(this, args);
            GISobj = this.GISobj;
            thisQuery = this;
        },
        query: function (params) {
            if (params.IsAddLayer) {
                GISobj.clearLayer(polygonGraphicsLayer);
                GISobj.clearLayer(polylineGraphicsLayer);
                GISobj.clearLayer(polygonGraphicsLayer);
                var params_Layer = {
                    click: function (e) {

                    },
                    mouseover: function (e) {
                        console.log(e);
                    },
                    mouseout: function (e) {

                    }
                }
                polygonGraphicsLayer = GISobj.getLayer("GL_Widgets_Query_polygon1", params_Layer);
                polylineGraphicsLayer = GISobj.getLayer("GL_Widgets_Query_polyline1", params_Layer);
                polygonGraphicsLayer = GISobj.getLayer("GL_Widgets_Query_point1", params_Layer);
            }


            var queryTask = new QueryTask(params.layer);
            var query = new Query();
            query.multipatchOption = "xyFootprint";
            query.outFields = params.outFields;
            query.where = params.wherestr;
            if (params.searchGeometry != null)
                query.geometry = params.searchGeometry;
            query.returnGeometry = params.returnGeometry;
            queryTask.on("error", function (e) { console.log(e); });
            queryTask.execute(query, function (result) {
                if (params.IsAddLayer) thisQuery.showResults(result);
                params.callBack(result.features);
            });

        },
        showResults: function (results) {
            var LineSymbol = new esri.symbol.SimpleLineSymbol(esri.symbol.SimpleLineSymbol.STYLE_SOLID, new dojo.Color([255, 255, 0]), 2);
            var color = [129, 194, 99, 1];
            var sfs = new esri.symbol.SimpleFillSymbol(esri.symbol.SimpleFillSymbol.STYLE_SOLID, LineSymbol, new dojo.Color(color));
            for (var i = 0; i < results.features.length; i++) {
                var graphic = results.features[i];
                //设置查询到的graphic的显示样式
                var geometryType = graphic.geometry.type;
                switch (geometryType) {
                    case "point":
                        break;
                    case "polyline":
                        break;
                    case "polygon":
                        graphic.setSymbol(sfs);
                        polygonGraphicsLayer.add(graphic);
                        break;

                }

            }
        }

    });

});