import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver = Capabilities("real");
			
		//  xpath= "//tagName[@attribute='value']"
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		Thread.sleep(2000);
		driver.findElementById("android:id/checkbox").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("123456");
		//driver.findElementById("android:id/button1").click();
		driver.findElementsByClassName("android.widget.Button").get(1).click();
	}

}
 