import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollDemo extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = Capabilities("emulator");
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
		//driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Lists\"));");
		
	}

}
