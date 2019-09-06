package GeneralStore;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

// Shop the items in app by scrolling and add to cart

public class TC3 extends GSBase {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = Capabilities("real");

		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Jenny");
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		
		driver.findElement(By.id("android:id/text1")).click();
		// scrolling till India
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + "India" + "\").instance(0))"));
		driver.findElement(By.xpath("//*[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		//driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		
		for(int i=0; i<count ; i++){
			String text = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			if (text.equalsIgnoreCase("Jordan 6 Rings")) {
				driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
				break;
			}
				
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();	
		
		//Checking the cart for the added product
		String cartProduct = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
		
		Assert.assertEquals(cartProduct, "Jordan 6 Rings");
	
		//Checking the actual prices and cart total price
		
		
		
		
	}

}
