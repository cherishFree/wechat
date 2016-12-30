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
    * 方法名：testgetConnection</br>
    * 详述：测试是否连接</br>
    * 开发人员：souvc </br>
    * 创建时间：2015-10-5  </br>
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
        // 获取接口访问凭证
        String accessToken = CommonUtil.getToken("xxxx", "xxxx").getAccessToken();
        /**
         * 获取用户信息
         */
        WeixinUserInfo user = getUserInfo(accessToken, "ooK-yuJvd9gEegH6nRIen-gnLrVw");
        System.out.println("OpenID：" + user.getOpenId());
        System.out.println("关注状态：" + user.getSubscribe());
        System.out.println("关注时间：" + user.getSubscribeTime());
        System.out.println("昵称：" + user.getNickname());
        System.out.println("性别：" + user.getSex());
        System.out.println("国家：" + user.getCountry());
        System.out.println("省份：" + user.getProvince());
        System.out.println("城市：" + user.getCity());
        System.out.println("语言：" + user.getLanguage());
        System.out.println("头像：" + user.getHeadImgUrl());
    }
	private static WeixinUserInfo getUserInfo(String accessToken, String string) {
		return null;
	}
    
   
}