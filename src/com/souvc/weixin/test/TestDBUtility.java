package com.souvc.weixin.test;

import java.sql.SQLException;
import java.util.Map;

import org.junit.Test;

import com.souvc.weixin.pojo.Token;
import com.souvc.weixin.pojo.WeixinUserInfo;
import com.souvc.weixin.util.CommonUtil;
import com.souvc.weixin.util.DBUtility;
import com.souvc.weixin.util.TokenUtil;

public class TestDBUtility {

    /**
    * ��������testgetConnection</br>
    * �����������Ƿ�����</br>
    * ������Ա��souvc </br>
    * ����ʱ�䣺2015-10-5  </br>
    * @throws SQLException
    * @throws
     */
    @Test
    public  void testgetConnection() {
    	try {
    		DBUtility db = new DBUtility();
    		System.out.println(db.getConnection());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	public TestDBUtility() {
		super();
	}
	
	@Test
    public void testGetToken3() {
        Map<String, Object> token=TokenUtil.getToken();
        System.out.println(token.get("access_token"));
        System.out.println(token.get("expires_in"));
    }
    
    
    @Test
    public void testSaveToken4() {
        Token token=CommonUtil.getToken("appID", "appsecret");
        TokenUtil.saveToken(token);
    }
    
    
    public static void main(String args[]) {
        // ��ȡ�ӿڷ���ƾ֤
        String accessToken = CommonUtil.getToken("xxxx", "xxxx").getAccessToken();
        /**
         * ��ȡ�û���Ϣ
         */
        WeixinUserInfo user = getUserInfo(accessToken, "ooK-yuJvd9gEegH6nRIen-gnLrVw");
        System.out.println("OpenID��" + user.getOpenId());
        System.out.println("��ע״̬��" + user.getSubscribe());
        System.out.println("��עʱ�䣺" + user.getSubscribeTime());
        System.out.println("�ǳƣ�" + user.getNickname());
        System.out.println("�Ա�" + user.getSex());
        System.out.println("���ң�" + user.getCountry());
        System.out.println("ʡ�ݣ�" + user.getProvince());
        System.out.println("���У�" + user.getCity());
        System.out.println("���ԣ�" + user.getLanguage());
        System.out.println("ͷ��" + user.getHeadImgUrl());
    }
	private static WeixinUserInfo getUserInfo(String accessToken, String string) {
		return null;
	}
    
   
}