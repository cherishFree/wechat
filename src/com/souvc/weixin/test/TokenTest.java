package com.souvc.weixin.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import org.junit.Test;

import com.souvc.weixin.pojo.Token;
import com.souvc.weixin.util.CommonUtil;
import com.souvc.weixin.util.MyX509TrustManager;

public class TokenTest {

    @Test
    public void testGetToken1() throws Exception {
        String tokenUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=appID&secret=appsecret";
        // ��������
        URL url = new URL(tokenUrl);
        HttpsURLConnection httpUrlConn = (HttpsURLConnection) url.openConnection();

        // ����SSLContext���󣬲�ʹ������ָ�������ι�������ʼ��
        TrustManager[] tm = { new MyX509TrustManager() };
        SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
        sslContext.init(null, tm, new java.security.SecureRandom());
        // ������SSLContext�����еõ�SSLSocketFactory����
        SSLSocketFactory ssf = sslContext.getSocketFactory();

        httpUrlConn.setSSLSocketFactory(ssf);
        httpUrlConn.setDoOutput(true);
        httpUrlConn.setDoInput(true);

        // ��������ʽ��GET/POST��
        httpUrlConn.setRequestMethod("GET");

        // ȡ��������
        InputStream inputStream = httpUrlConn.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(
                inputStream, "utf-8");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        // ��ȡ��Ӧ����
        StringBuffer buffer = new StringBuffer();
        String str = null;
        while ((str = bufferedReader.readLine()) != null) {
            buffer.append(str);
        }
        bufferedReader.close();
        inputStreamReader.close();
        // �ͷ���Դ
        inputStream.close();
        httpUrlConn.disconnect();
        // ������ؽ��
        System.out.println(buffer);
    }

    @Test
    public void testGetToken2() {
        Token token = CommonUtil.getToken("appID","appsecret");
        System.out.println("access_token:"+token.getAccessToken());
        System.out.println("expires_in:"+token.getExpiresIn());
    }
}