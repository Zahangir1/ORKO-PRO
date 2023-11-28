package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    public static AndroidDriver driver;

    @BeforeStep
    public static AndroidDriver setup() {
        //Emulator Device Set Capabilities
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a_API_30");
        //cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3_API_30");
        cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        cap.setCapability("appPackage", "com.myorko.orkodoctor.dev");
        cap.setCapability("appActivity","com.myorko.orkodoctor.splash.SplashActivity");


        //Real Device Set Capabilities
        /*DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Realme Pad");
        cap.setCapability(MobileCapabilityType.UDID, "INZTGEC6NJPBDIWG");
        cap.setCapability("appPackage", "com.myorko.orkodoctor.dev");
        cap.setCapability("appActivity","com.myorko.orkodoctor.splash.SplashActivity");*/

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        // Appium server
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        assert url != null;

        driver = new AndroidDriver(url, cap);
        return driver;

    }

    @AfterStep
    public void tearDown() {
        driver.quit();
    }

}

