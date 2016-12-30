package com.souvc.weixin.test;

import java.sql.SQLException;
import java.util.Map;

import org.junit.Test;

import com.souvc.weixin.pojo.Token;
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
    public static void main(String[] args) {
    	new TestDBUtility().testgetConnection();
	}
	public TestDBUtility() {
		super();
		// TODO Auto-generated constructor stub
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
    
    
   
}