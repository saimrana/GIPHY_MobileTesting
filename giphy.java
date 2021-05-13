package GIHPY;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class giphy {
	static AppiumDriver<MobileElement>driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
		openCalculator();
	}catch(Exception exp) {
	System.out.println(exp.getCause());
	System.out.println(exp.getMessage());
	exp.printStackTrace();
	}
	}
     public static void openCalculator() throws Exception{
    	 
    	 DesiredCapabilities caps = new DesiredCapabilities();
    	 caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator1");
    	 caps.setCapability("skipServerInstallation", true);
    	 caps.setCapability("deviceName", "vivo 1915");
    	 caps.setCapability("udid", "P7QC49FYZHQ8HELJ");
    	 caps.setCapability("platformName", "Android");
    	 caps.setCapability("platformVersion", "9");
    	 caps.setCapability("appPackage", "com.android.vending");
    	 //caps.setCapability("appPackage", "com.android.bbkcalculator");
    	 //caps.setCapability("appActivity", "com.android.bbkcalculator.Calculator"); com.snapchat.kit.sdk.SnapKitActivity - GIPHY
    	 caps.setCapability("appActivity", "com.snapchat.kit.sdk.SnapKitActivity - GIPHY");

    	 //caps.setCapability("appPackage","com.joinbuggy.driverapp");            
         //set the Launcher activity name of the app
         //caps.setCapability ("appActivity","com.joinbuggy.driverapp.MainActivity"); 
    	 URL url = new URL ("http://localhost:4723/wd/hub");  
    	 driver = new AppiumDriver<MobileElement>(url, caps);
    	 System.out.println("Application Started ....");
    	    	 System.out.println("Application Started ....");
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);           
         driver.findElement(By.xpath ("")).click();
         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);            
         driver.findElement(By.xpath ("")).sendKeys("xxxx@gmail.com");
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.findElement(By.xpath ("")).sendKeys("yyyzzz");
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);        
         driver.findElement(By.xpath ("")).click();  
    	 
     }
}
