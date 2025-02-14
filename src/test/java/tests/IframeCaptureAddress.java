package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pageObjects.PracticePage;
import utility.Base;
import utility.Utilities;

import java.time.Duration;

public class IframeCaptureAddress extends Base {
public Actions action;
public WebDriverWait wait;
Utilities utility  = new Utilities();
    @Test
    public void testIframAddressCapture(){
        PracticePage practicePage = new PracticePage(Base.driver);
        practicePage.switchToIframe();
        practicePage.clickOnHome();
        wait = new WebDriverWait(Base.driver, Duration.ofSeconds(5));
        action = new Actions(Base.driver);
        practicePage.scrollToMoreMenu();
        practicePage.clickOnMoreMenu();
        action.moveToElement(practicePage.clickContact()).click().build().perform();
       String captureAddress = practicePage.getAddressText().getText();
        System.out.println("Address : " + captureAddress);


    }



}
