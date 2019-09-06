import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UiAutomatorTest extends Base{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities("real");
		
	
	    //driver.findElementByAndroidUIAutomator("attribute("value")");
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();

		//driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
	}

}
