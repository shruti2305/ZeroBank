package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.LoginPageObjects;

import java.util.concurrent.TimeUnit;

@Log4j2
public class StepDefs {
    WebDriver driver;
    String url="https://zero.webappsecurity.com";
    Scenario scenario;
    LoginPageObjects loginPageObjects;

    @Before
    public void setup(Scenario scenario){
        this.scenario=scenario;
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        loginPageObjects=new LoginPageObjects(driver);
        log.info("Chrome driver is invoked");

    }
    @After
    public void cleanup(){
       driver.quit();
        log.info("Driver quit success");
    }
    @Given(":User is on the login page")
    public void user_is_on_the_login_page() {
        driver.get(url + "/login.html");
        scenario.log("Navigation to login page is successfully");
        log.info("Navigation to login page is successfully");

    }



    @When(":User should be login as username as {string} and password as {string}.")
    public void user_should_be_login_as_username_as_and_password_as(String u, String p) {
        loginPageObjects.login(u,p);
        scenario.log("Login using username: "+u+" password: "+p);
        log.info("Login using username: "+u+" password: "+p);

    }
    @Then(":User should be successfully logged in the app.")
    public void user_should_be_successfully_logged_in_the_app() {
        Assert.assertEquals(driver.getTitle(),"Zero-Account Summary");

    }

}
