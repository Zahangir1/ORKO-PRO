package home;

import base.BaseClass;
import io.appium.java_client.android.AndroidDriver;

import java.time.Duration;

public class Home extends BaseClass {

    //@Test
    public void homepage() throws InterruptedException {
        AndroidDriver driver = setup();
        implicitWait(driver);
        Thread.sleep(3000);

    }

    public void implicitWait(AndroidDriver driver) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

}
