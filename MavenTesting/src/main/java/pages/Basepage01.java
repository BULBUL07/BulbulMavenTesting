package pages;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Basepage01 {
	 public static WebDriver driver;
	   
	   
	    public static void initialSetUP(String sURL){
	       
	        driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.get(sURL);
	         
	    }
	   
	   public static By findLocator(String sLocator){
	      
	       By byLocator;
	       if(sLocator.contains("/")){
	           byLocator = By.xpath(sLocator);
	       }else{
	           byLocator = By.id(sLocator);
	       }
	       return byLocator;
	      
	   }
	  
	  
	    public  static  WebElement  findObject (By byLocator){
	       
	        WebElement   wEle= null;
	        try{
	        wEle= driver.findElement(byLocator);
	        }
	        catch(Exception e)
	        {
	        	e.printStackTrace();
	        }
	        
	       
	        return wEle;
	    }
	   
	    public static void setText(By byLocator,String sValue){
	       
	       
	        WebElement wEle=null;
	        wEle= findObject(byLocator);
	        wEle.clear();
	        wEle.sendKeys(sValue);
	   
	   
	    }
	       
	       
	    public static void clickElement (By byLocator){
	       

	        WebElement wEle=null;
	        wEle= findObject(byLocator);
	        try{
	              wEle.click();
	           
	        }catch(Exception e){
	            clickElementAction(byLocator);
	        }
	     
	    }   
	   
	    public static void clickElementAction (By byLocator)
	    {
	        WebElement wEle=null;
	        wEle= findObject(byLocator);
	       
	        Actions act = new Actions(driver);
	        act.click(wEle).build().perform();
	       
	    }
	   
	    public static boolean isElementPresent (By byLocator){
	        boolean b=  false;
	        WebElement wEle = null;
	        try{
	            wEle= findObject(byLocator);
	            b = wEle.isDisplayed();
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	       
	        return b;
	        }
	   
	    public static String getCurrentPageTitle(){
	        return driver.getTitle();
	       
	       
	    }
	   
	    public static String getElementText (By byLocator){
	        WebElement wEle = null;
	        wEle= findObject(byLocator);
	        return wEle.getText();
	    }
	   
	    public static void pageScroll(String direction){
	        if(direction.equalsIgnoreCase("down")){
	           
	            JavascriptExecutor jse = (JavascriptExecutor)driver;
	            jse.executeScript("window.scrollBy(0,250)", "");
	           
	        }else if (direction.equalsIgnoreCase("up")){
	            JavascriptExecutor jse = (JavascriptExecutor)driver;
	            jse.executeScript("window.scrollBy(0,-250)", "");
	        }
	    }
	   
	    public static void pageScrollForElement(By byLocator){
	            WebElement wEle = findObject(byLocator);
	       
	            JavascriptExecutor jse = (JavascriptExecutor)driver;
	            jse.executeScript("arguments[0].scrollIntoView(true);",wEle);
	    }
	   
	   
	    public  static void sleepApplication(int iTimeSecond){
	        long count = iTimeSecond*1000;
	        try{
	            Thread.sleep(count);
	        }catch ( InterruptedException e){
	            e.printStackTrace();
	        }
	    }
	   
	    public  static void captureScreenShot(String screenShotName)
	    {
	        // Take screenshot and store as a file format
	        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        try {
	         // now copy the  screenshot to desired location using copyFile //method
	        FileUtils.copyFile(src, new File("E://New folder//MavenTesting//ScreenShot//"+screenShotName+".png"));
	      
	        }
	         
	        catch (IOException e)
	         {
	          System.out.println(e.getMessage());
	         
	         }
	    }
	    
	        public static void selectValueFromDropDown(By bylocator , String sValue)
	        {
	        	WebElement wEle=null;
	        	wEle=findObject(bylocator);
	        	Select sel=new Select(wEle);
	        	sel.selectByVisibleText(sValue);
	        	
	        }
	    
	    public static void closesession(){
	       
	        driver.quit();
	    }


}
