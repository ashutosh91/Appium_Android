package WebApps;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Browse extends BaseChrome {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities("real");
		driver.get("http://facebook.com");
		driver.findElementByCssSelector("#m_login_email").sendKeys("abc@gmail.com");
		driver.findElementByCssSelector("m_login_password").sendKeys("qwerty123");
		driver.findElementByName("login").click();
		

	}

}
