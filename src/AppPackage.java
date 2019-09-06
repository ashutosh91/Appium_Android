//import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppPackage {

	public static void main(String[] args) throws MalformedURLException {
		
		//public static AndroidDriver<AndroidElement> Capabilities(){
			
			//File f = new File("src");
			//File fs = new File(f,"ApiDemos-debug.apk");
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy J2 Pro");
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
			cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.prodege.swagbucksmobile");
			cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.prodege.swagbucksmobile.view.permissionscreen.PermissionActivity");
			
			
			//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
			//cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
			AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//return driver;
			
		}

	}

