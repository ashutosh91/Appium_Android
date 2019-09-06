package GeneralStore;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

// Basic positive test for filling the form

public class TC1 extends GSBase{

	public static void main(String[] args) throws MalformedURLException{
		
		AndroidDriver<AndroidElement> driver = Capabilities("real");

		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Jenny");
		//driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		
		driver.findElement(By.id("android:id/text1")).click();
		// scrolling till India
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));");
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + "India" + "\").instance(0))"));
		driver.findElement(By.xpath("//*[@text='India']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		
		
		
	}

}
