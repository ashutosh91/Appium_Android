import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.android.AndroidKeyCode;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Miscelleanous extends Base {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver= Capabilities("real");
	    System.out.println(driver.currentActivity());
	    System.out.println(driver.getContext());
	    //views - Native , Hybrid, Webview
	    System.out.println(driver.getOrientation());
	    System.out.println(driver.isDeviceLocked());
	    //driver.hideKeyboard();
	 	driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	 	//driver.pressKeyCode(AndroidKeyCode.BACK);
	 	//driver.navigate().back();
	 	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	 	//driver.longPressKey(new KeyEvent(AndroidKey.WINDOW));
	 	

	}

}
