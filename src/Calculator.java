
import io.appium.java_client.FindsByAccessibilityId;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Calculator {

	@SuppressWarnings("rawtypes")
	public static void main(String... args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "emulator-5554");
		// dc.setCapability("deviceName",
		// "adb-R58T92EK53R-bQQcsB._adb-tls-connect._tcp");
		dc.setCapability("platformName", "Android");
		dc.setCapability("appPackage", "com.google.android.calculator");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		// dc.setCapability("ignoreHiddenApiPolicyError", true);
		dc.setCapability("newCommandTimeout", 60);
		dc.setCapability("autoAcceptAlerts", true);
		dc.setCapability("disable-popup-blocking", true);
		dc.setCapability("unhandledPromptBehavior", "accept");
		dc.setCapability("unicodeKeyboard", true);
		dc.setCapability("autoGrantPermissions", true);
		// dc.setCapability("noReset", true);

		@SuppressWarnings("rawtypes")
		WebDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		System.out.println("Driver details while initalising are : " + driver);
	
		
		Thread.sleep(10000);

		WebElement el1 = (WebElement) ((FindsByAccessibilityId) driver).findElementByAccessibilityId("8");
		el1.click();
		WebElement el2 = (WebElement) ((FindsByAccessibilityId) driver).findElementByAccessibilityId("multiply");   
		el2.click();
		WebElement el3 = (WebElement) ((FindsByAccessibilityId) driver).findElementByAccessibilityId("8");
		el3.click();
		WebElement el4 = (WebElement) ((FindsByAccessibilityId) driver).findElementByAccessibilityId("equals");  
		el4.click();

		Thread.sleep(2000);

		System.out.println("**Tear down the Appium driver**");
		if (driver != null)
			driver.quit();
		System.out.println("**The script is finished**");
	}
}