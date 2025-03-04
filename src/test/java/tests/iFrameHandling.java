package tests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import pageObjects.PracticePage;
import utility.Base;

public class iFrameHandling extends Base {

    @Test
    public void iframeHandlingTest() {
        // Test case implementation
        PracticePage pp = new PracticePage(Base.driver);

        pp.switchToIframe();
        Reporter.log("Switched to iframe",true);
        pp.clickOnHome();
        Reporter.log("clicked on the home page",true);

        pp.getScrollMoreMenu();
        Reporter.log("hovered the more menu",true);

        pp.clickContact();
        Reporter.log("clicked on the contactUS button",true);

        String addressCaptured =pp.getAddressText();
        System.out.println("Address: " + addressCaptured);
        Reporter.log("got the address",true);


    }
}
