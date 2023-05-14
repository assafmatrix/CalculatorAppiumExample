
import io.appium.java_client.FindsByAccessibilityId;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Linkedin {

	@SuppressWarnings("rawtypes")
	public static void main(String... args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "emulator-5554");
		// dc.setCapability("deviceName",
		// "adb-R58T92EK53R-bQQcsB._adb-tls-connect._tcp");
		dc.setCapability("platformName", "Android");
		dc.setCapability("appPackage", "com.linkedin.android");
		dc.setCapability("appActivity", "com.linkedin.android.authenticator.LaunchActivity");
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

		
		WebElement el1 = (WebElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]")); 
		el1.click();
		Thread.sleep(5000);
		
		//WebElement el2 = (WebElement) driver.findElement(By.id("com.linkedin.android:id/notif_permission_signin_text"));
		//el2.click();
		
		Thread.sleep(2000);
		
		WebElement el3 = (WebElement) driver.findElement(By.id("com.linkedin.android:id/search_bar_text")); 
		el3.click();


		Thread.sleep(8000);

		System.out.println("**Tear down the Appium driver**");
		if (driver != null)
			driver.quit();
		System.out.println("**The script is finished**");
	}
}