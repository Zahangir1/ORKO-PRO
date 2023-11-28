package home;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

public class CommonClass {
    AndroidDriver driver;

    public CommonClass(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void login_homepage() throws InterruptedException {
        Thread.sleep(3000);
        LoginPage _pro = new LoginPage(driver);
        for(int i=1; i<=5;i++){
            _pro.click_on_splash_screen().click();
            Thread.sleep(2000);
        }
        _pro.click_on_doneBtn().click();
        Thread.sleep(3000);
        _pro.click_on_loginBtn().click();
        Thread.sleep(5000);
        _pro.setPhone_number("01000330200");
        Thread.sleep(5000);
        _pro.click_on_nextBtn().click();
        Thread.sleep(5000);
        //Bypass OTP 440055
        _pro.setVerify_otpOne("4");
        Thread.sleep(3000);
        _pro.setVerify_otpTwo("4");
        Thread.sleep(3000);
        _pro.setVerify_otpThree("0");
        Thread.sleep(3000);
        _pro.setVerify_otpFour("0");
        Thread.sleep(3000);
        _pro.setVerify_otpFive("5");
        Thread.sleep(3000);
        _pro.setVerify_otpSix("5");
        Thread.sleep(3000);
        _pro.click_on_continueBtn().click();
        Thread.sleep(10000);
        System.out.println("Successfully Login! Welcome to Orko Pro Application");

    }

}
