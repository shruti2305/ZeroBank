package pageobjects;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class LoginPageObjects {
    WebDriver driver;
    By username= By.id("user_login");
    By password= By.id("user_password");
    By signinbutton= By.xpath("//input[@value='Sign in']");

    public LoginPageObjects(WebDriver driver){

        this.driver= driver;
    }

    public void login(String u, String p){
        driver.findElement(username).sendKeys(u);
        driver.findElement(password).sendKeys(p);
        driver.findElement(signinbutton).click();
        log.info("Login into the app using username: "+u+" password: " + p);
    }
}
