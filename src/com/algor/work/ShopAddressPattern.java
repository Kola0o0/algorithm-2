package com.algor.work;

import com.util.Print;

public class ShopAddressPattern {

	public static String shopAddressFormat(String shopAddress){
		String test =  shopAddress.replaceAll("\\��.{0,15}\\��|\\(.{0,15}\\)|\\(.{0,15}\\��|\\��.{0,15}\\)|\\[[^[������]]{0,10}\\]|\\{.+\\}", "");
		Print.println(shopAddress);
		return test;
	}
	
	
	public static void main(String[] args) {
		String shopAddress = "�����к������������������ʹ㳡E��307������¥�ϣ�";
		Print.println(shopAddressFormat(shopAddress));
	}

}
