package tests;

import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pageObjects.PracticePage;
import utility.Base;

public class IframeCaptureAddress extends Base {

    @Test
    public void testIframAddressCapture(){
        PracticePage practicePage = new PracticePage(Base.driver);
        practicePage.switchToIframe();
        practicePage.clickOnHome();
        practicePage.hoverToMoreMenu();
        practicePage.clickContact();
       String captureAddress = practicePage.getAddressText();
        System.out.println("Address : " + captureAddress);


    }



}
