package com.zkyt.dga.utils;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.net.util.Base64;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;


public class SpringmvcControllerBase {
    // 获得请求对象
    public HttpServletRequest request;
    // 获取取响应对象
    public HttpServletResponse response;

    private String jsonpCallback = null;


    // 设置mvc常用变量
    @ModelAttribute
    public void setReqAndRes(HttpServletRequest request,
                             HttpServletResponse response) {

        Map<String, String[]> map = request.getParameterMap();
        if (map.get("callback") != null) {//对非正式跨域传输协议 callback定义方法进行记录
            jsonpCallback = String.valueOf(((Object[]) map.get("callback"))[0]);
        }

        this.request = request;
        this.response = response;
    }

    public static String encodeStr(String str) {
        try {
        	if (null!=str) {
        		str = new String(str.getBytes("ISO-8859-1"), "UTF-8");
			}
        } catch (UnsupportedEncodingException e) {
        	str = null;
        }
        return str;
    }

    /**
     * UTF-8反编码
     */
    public String decodeByUTF8(String src) {
        if (src != null && !StringUtils.isBlank(src)) {
            try {
                // 页面传过来的是经过编码的，在此再反编码
                return URLDecoder.decode(src, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    /**
     * 向前台原样输出json字符串  为了统一方便 返回方式固定适应多平台调用  （不使用springmvc jsonmodel是为了多元化方便）
     *
     * @return str 需要输出的内容
     */
    public void toClient(String str) {
        PrintWriter out = null;
        try {
            response.setHeader("Content-Type", "text/plain;charset=UTF-8");
            out = response.getWriter();
            if (com.zkyt.dga.utils.StringUtils.noEmpty(jsonpCallback)) {//对非正式跨域传输协议支持
                out.print(jsonpCallback + "(" + str + ")");
            } else {
                out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        	
            if (out != null) {
                out.flush();
                out.close();
                out = null;
            }
        }
    }


    /**
     * 开放式跨域 向前台原样输出json字符串
     *
     * @return str 需要输出的内容
     */
    public void toClientOrigin(String str) {
        PrintWriter out = null;
        try {
            response.setHeader("Content-Type", "text/plain;charset=UTF-8");
            response.setHeader("Access-Control-Allow-Origin", "*");
            out = response.getWriter();
            out.print(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.flush();
                out.close();
                out = null;
            }
        }
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }


   /* public static void main(String[] args) {
        //船泊详情{mmsi:"477435600",ShoreAis:"1"} 船泊范围列表{lb:"121.751574,30.331310",rt:"122.675799,30.658500",shore:1,seq:7}  港口详情：{date:"20160406",portid:"45112"}
        String string = new String(Base64.decodeBase64("e2RhdGU6IjIwMTYwNDA2Iixwb3J0aWQ6IjQ1MTEyIn0=".getBytes()));
        System.out.println(string.toString());


    }*/
}
