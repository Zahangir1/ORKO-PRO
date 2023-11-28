package step_definition;

import base.BaseClass;
import home.CommonClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class Login extends BaseClass {

    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() throws InterruptedException {
        //Login Page
        Thread.sleep(3000);
        CommonClass lg = new CommonClass(driver);
        lg.login_homepage();

        //Assertion
        WebElement result = driver.findElement(By.id("com.myorko.orkodoctor.dev:id/logo"));
        Assert.assertEquals(result.getText(), "");
        System.out.println("Successfully Login");
    }
    @When("Enter your valid username")
    public void enter_your_valid_username() {

    }
    @When("Enter your valid password")
    public void enter_your_valid_password() {

    }
    @When("Click on the submit button")
    public void click_on_the_submit_button() {

    }
    @Then("I should see login page")
    public void i_should_see_login_page() {

    }
}
