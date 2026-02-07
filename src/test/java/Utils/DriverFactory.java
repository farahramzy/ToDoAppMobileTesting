package Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    public static AppiumDriver createDriver() throws MalformedURLException {

    UiAutomator2Options options = new UiAutomator2Options()
            .setDeviceName("FarahTesting")
            .setPlatformName("Android")
            .setAutomationName("UIAutomator2")
            .setApp(System.getProperty("user.dir")
                    + "/src/test/resources/app/app-debug.apk")
            .setAutoGrantPermissions(true);

    return new AndroidDriver(
            new URL("http://127.0.0.1:4723"),
            options
    );
}

}
