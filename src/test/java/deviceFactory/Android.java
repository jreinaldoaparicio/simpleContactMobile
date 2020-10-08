package deviceFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Android implements  IDevice {
    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName","J2 Prime");
        capabilities.setCapability("platformVersion","6.0.1");
        capabilities.setCapability("appPackage","com.simplemobiletools.contacts");
        capabilities.setCapability("appActivity",".activities.MainActivity");
        capabilities.setCapability("platformName","Android");


        AppiumDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        return  driver;
    }
}
