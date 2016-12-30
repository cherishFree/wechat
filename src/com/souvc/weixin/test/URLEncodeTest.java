package com.souvc.weixin.test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
/**
* 类名: URLEncodeTest </br>
* 描述: 把URL 编码或是解码  </br>
* 开发人员： souvc </br>
* 创建时间：  2015-11-30 </br>
* 发布版本：V1.0  </br>
 */
public class URLEncodeTest {

    public static void main(String[] args) {
        String URL ="http://www.souvc.com/oauthServlet";
        System.out.println(urlEncodeUTF8(URL));
        System.out.println(urlEncodeGb2312(URL));
        System.out.println(urlDecodeUTF8("http%3A%2F%2Fwww.souvc.com%2FoauthServlet"));
        System.out.println(urlDecodeGb2312("http%3A%2F%2Fwww.souvc.com%2FoauthServlet"));
    }
    
    /**
    * 方法名：urlEncodeUTF8</br>
    * 详述： URL 编码  </br>
    * 开发人员：souvc </br>
    * 创建时间：2015-11-30  </br>
    * @param source
    * @return
    * @throws
     */
    public static String urlEncodeUTF8(String URL) {
        String result = URL;
        try {
            result = URLEncoder.encode(URL, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
    /**
    * 方法名：urlDecodeUTF8</br>
    * 详述：URL 解码 </br>
    * 开发人员：souvc </br>
    * 创建时间：2015-11-30  </br>
    * @param URL
    * @return
    * @throws
     */
    public static String urlDecodeUTF8(String URL) {
        String result = "";
        try {
            result = URLDecoder.decode(URL, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    /**
    * 方法名：urlDecodeGb2312</br>
    * 详述：URL 解码</br>
    * 开发人员：souvc  </br>
    * 创建时间：2015-11-30  </br>
    * @param URL
    * @return
    * @throws
     */
    public static String urlDecodeGb2312(String URL) {
        String result = "";
        try {
            result = URLDecoder.decode(URL, "gb2312");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    
    /**
    * 方法名：urlEncodeGb2312</br>
    * 详述：URL 编码  </br>
    * 开发人员：souvc  </br>
    * 创建时间：2015-11-30  </br>
    * @param URL
    * @return
    * @throws
     */
    public static String urlEncodeGb2312(String URL) {
        String result = URL;
        try {
            result = URLEncoder.encode(URL, "gb2312");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    
}