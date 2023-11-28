package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.opentelemetry.api.internal.ConfigUtil;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;

public class CapabilitiesGenerator {

    public static Properties androidconfig = ConfigUtil.getConfig("androidconfig");
    // App1 capabilities
    static String contactsAppPackageName="com.android.contacts";
    // App2 capabilities
    String settingsAppPackageName="com.android.settings";
    String settingsAppActivityName="com.android.settings.Settings";


    public static int getAnyFreePort() throws IOException {
        ServerSocket s = new ServerSocket(0);
        return s.getLocalPort();
    }

    public static DesiredCapabilities getAndroidCapabilities() throws IOException {
        //  Properties UserProperties = ConfigUtil.getConfig("AndroidUser");
        String apk = androidconfig.getProperty("androidApk");
        File apkDir = new File("APK/");
        System.out.println("Apk : " + apk);
        File app = new File(apkDir, apk);

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, androidconfig.getProperty("platformName"));
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, androidconfig.getProperty("platformVersion"));
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, androidconfig.getProperty("deviceName"));
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, androidconfig.getProperty("automationName"));
        cap.setCapability(MobileCapabilityType.UDID ,  androidconfig.getProperty("udid"));
        cap.setCapability("systemPort",getAnyFreePort());
        cap.setCapability("newCommandTimeout", 400000);
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, androidconfig.getProperty("appPackage"));
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, androidconfig.getProperty("appActivity"));
        cap.setCapability("autoGrantPermissions", true);
        cap.setCapability("autoAcceptAlerts", true);
        cap.setCapability("noReset", false);
        cap.setCapability("unicodeKeyboard",true);
        cap.setCapability("resetKeyboard",true);
        return cap;
    }



    /*public static AndroidDriver driver;

    @BeforeStep
    public static AndroidDriver setup() {
        //Emulator Device Set Capabilities
        *//*DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a_API_30");
        //cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3_API_30");
        cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        cap.setCapability("appPackage", "com.myorko.orkodoctor.dev");
        cap.setCapability("appActivity","com.myorko.orkodoctor.splash.SplashActivity");*//*

        //Real Device Set Capabilities
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "platformName");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "platformVersion");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "automationName");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "deviceName");
        cap.setCapability(MobileCapabilityType.UDID, "udid");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "appPackage");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"appActivity");

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

 */


}
