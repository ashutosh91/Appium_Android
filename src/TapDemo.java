import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class TapDemo extends Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = Capabilities("real");
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//Tap
		TouchAction t = new TouchAction(driver);
		WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		t.tap(tapOptions().withElement(element(expandList))).perform();
		
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		WebElement peopleName = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		t.longPress(longPressOptions().withElement(element(peopleName)).withDuration(ofSeconds(2))).release().perform();
		Thread.sleep(2000);
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
	}

}
