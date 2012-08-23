package com.password.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class PasswordTest {
 private static Password password = new Password();
 private String pwd;
 private String result;

 @Parameters
 public static Collection<String[]> data() {
	return Arrays.asList(new String[][]{
			{"12321","���벻����Ҫ��"},
			{"1223","���벻����Ҫ��"},
			{"12345fsd6","�������Ҫ��"}, 			
			
	});
	
}
 
 
	@Before
	public void setUp() throws Exception {		
	}

	@After
	public void tearDown() throws Exception {
	}

	public PasswordTest(String pwd,String result){
		  this.pwd = pwd;
		  this.result = result;
	 }	

	@Test
	public void testMain() {
		assertEquals(result,password.passwordIntensity(pwd));
	}
	
	@Test
	public void testPasswordAlert() {		
		assertEquals(result,password.passwordAlert(pwd));
	}

}
