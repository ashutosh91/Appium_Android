package GeneralStore;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

// Negative test for toast error message

public class TC2 extends GSBase {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = Capabilities("real");
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		// Find for the toast message on the screen (with index) 
		// And, name attribute for the toast message have the content of toast message
		String toastMsg = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		System.out.println(toastMsg);
		Assert.assertEquals("Please enter your name", toastMsg);
		

	}

}
