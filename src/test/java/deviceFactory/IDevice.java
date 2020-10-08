package deviceFactory;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public interface IDevice {
    AppiumDriver create() throws MalformedURLException;
}
