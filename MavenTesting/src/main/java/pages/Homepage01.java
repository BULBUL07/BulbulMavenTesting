package pages;
import org.openqa.selenium.By;

public class Homepage01 extends Basepage01 {
	private static final By userNameField = findLocator("//input[@id='email']");
    private static final By passwordField = findLocator("//input[@id='pass']");
    private static final By LoginButton = findLocator("loginbutton");
   
    /***************** Setters **********************/
   
   
    public static void setUserNameValue(String sUserName){
    setText(userNameField,sUserName);
       
    }
   
    public static void setPasswordValue(String sPassword){
       
        setText(passwordField,sPassword);
    }
   
   
    /******************* Clickers *****************/
   
   
    public static void clickLoginButton(){
        clickElement(LoginButton);
       
   
    }
   
    /***************** Helper ********************/
   
   
    public static void LoginToFB(String sUserName,String sPassword){
        setUserNameValue(sUserName);
        setPasswordValue(sPassword);
        sleepApplication(3);
        clickLoginButton();
       
       
   
    }
    public static String getHomePageTitle()
    {
    	return Basepage01.getCurrentPageTitle();
    }

	

}
