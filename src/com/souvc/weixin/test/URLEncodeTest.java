package com.souvc.weixin.test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
/**
* ����: URLEncodeTest </br>
* ����: ��URL ������ǽ���  </br>
* ������Ա�� souvc </br>
* ����ʱ�䣺  2015-11-30 </br>
* �����汾��V1.0  </br>
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
    * ��������urlEncodeUTF8</br>
    * ������ URL ����  </br>
    * ������Ա��souvc </br>
    * ����ʱ�䣺2015-11-30  </br>
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
    * ��������urlDecodeUTF8</br>
    * ������URL ���� </br>
    * ������Ա��souvc </br>
    * ����ʱ�䣺2015-11-30  </br>
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
    * ��������urlDecodeGb2312</br>
    * ������URL ����</br>
    * ������Ա��souvc  </br>
    * ����ʱ�䣺2015-11-30  </br>
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
    * ��������urlEncodeGb2312</br>
    * ������URL ����  </br>
    * ������Ա��souvc  </br>
    * ����ʱ�䣺2015-11-30  </br>
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