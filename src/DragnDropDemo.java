import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragnDropDemo extends Base {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities("real");
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		
		TouchAction t = new TouchAction(driver);
		WebElement dragSrc = driver.findElementsByClassName("android.view.View").get(0);
		WebElement dragDestin = driver.findElementsByClassName("android.view.View").get(1);
		//t.longPress(longPressOptions().withElement(element(dragSrc)).withDuration(ofSeconds(2))).moveTo(element(dragDestin)).release().perform();
		
		// shortcut of above line (if we didn't need to give duration or points)
		t.longPress(element(dragSrc)).moveTo(element(dragDestin)).release().perform();
	}

}
