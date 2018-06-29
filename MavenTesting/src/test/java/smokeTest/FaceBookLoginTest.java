package smokeTest;



import org.testng.annotations.Test;


import pages.Basepage01;
import pages.Homepage01;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




public class FaceBookLoginTest {
  
	
	@BeforeMethod
	 public void beforeMethod(){
		Basepage01.initialSetUP("https://www.facebook.com");
	 }
	
	
		 @Test
		 public void loginTest(){
			 
			//assertNotEquals(HomePage.getHomePageTitle(), "Facebook –   log in or sign up");
			assertFalse(true);
			Homepage01.LoginToFB("9827227097", "Bulbul@123"); 
			
		 }
		 
		 @Test
		 public void loginFaliureTest()
		 {
			 Homepage01.LoginToFB("9827227097", "Bulbul@123");
			 assertFalse(false);
		 }
		 
		 @AfterMethod
		 public void afterMethod(ITestResult result){
			 if(ITestResult.SUCCESS==result.getStatus())
			 {
				 Basepage01.captureScreenShot(result.getName());
			 }
			 Basepage01.closesession();
		 }



}



