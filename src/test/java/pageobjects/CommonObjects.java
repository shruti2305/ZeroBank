package pageobjects;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class CommonObjects {
    WebDriver driver;
    By proceed= By.id("details-button");
    By detailbutton= By.id("proceed-link");

    public CommonObjects(WebDriver driver){

        this.driver= driver;
    }

    public void proceedlink(String u, String p){
        driver.findElement(proceed).click();
        driver.findElement(detailbutton).click();


    }

}
