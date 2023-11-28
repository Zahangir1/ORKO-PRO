package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    AndroidDriver driver;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id ="com.myorko.orkodoctor.dev:id/next")
    WebElement splash_screen;
    @FindBy (id ="com.myorko.orkodoctor.dev:id/done")
    WebElement doneBtn;
    @FindBy(id = "com.myorko.orkodoctor.dev:id/btn_login")
    WebElement loginBtn;
    @FindBy(id = "com.myorko.orkodoctor.dev:id/etMobileNo")
    WebElement phoneNumber;
    @FindBy(id = "com.myorko.orkodoctor.dev:id/btn_next")
    WebElement nextBtn;
    @FindBy(id = "com.myorko.orkodoctor.dev:id/otp_one_edit_text")
    WebElement otp_One;
    @FindBy(id = "com.myorko.orkodoctor.dev:id/otp_two_edit_text")
    WebElement otp_Two;
    @FindBy(id = "com.myorko.orkodoctor.dev:id/otp_three_edit_text")
    WebElement otp_Three;
    @FindBy(id = "com.myorko.orkodoctor.dev:id/otp_four_edit_text")
    WebElement otp_Four;
    @FindBy(id = "com.myorko.orkodoctor.dev:id/otp_five_edit_text")
    WebElement otp_Five;
    @FindBy(id = "com.myorko.orkodoctor.dev:id/otp_six_edit_text")
    WebElement otp_Six;
    @FindBy(id = "com.myorko.orkodoctor.dev:id/btn_continue")
    WebElement continueBtn;


    public WebElement click_on_splash_screen(){
        return splash_screen;
    }
    public WebElement click_on_doneBtn(){
        return doneBtn;
    }
    public WebElement click_on_loginBtn() {
        return loginBtn;
    }
    public void setPhone_number(String phone){
        phoneNumber.sendKeys(phone);
    }
    public WebElement click_on_nextBtn(){
        return nextBtn;
    }
    public void setVerify_otpOne(String one){
        otp_One.sendKeys(one);
    }
    public void setVerify_otpTwo(String two){
        otp_Two.sendKeys(two);
    }
    public void setVerify_otpThree(String three){
        otp_Three.sendKeys(three);
    }
    public void setVerify_otpFour(String four){
        otp_Four.sendKeys(four);
    }
    public void setVerify_otpFive(String five){
        otp_Five.sendKeys(five);
    }
    public void setVerify_otpSix(String six){
        otp_Six.sendKeys(six);
    }
    public WebElement click_on_continueBtn(){
        return continueBtn;
    }

}
