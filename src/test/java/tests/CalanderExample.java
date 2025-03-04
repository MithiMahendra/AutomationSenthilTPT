package tests;

import org.testng.annotations.Test;
import pageObjects.abhibusPage;
import utility.Base;
import utility.Utilities;

public class CalanderExample extends Base {

    @Test
    public void calExample() throws InterruptedException {
        abhibusPage ap = new abhibusPage(Base.driver);
        ap.enterSource("Bangalore");
        ap.enterDestination("Tirupati");
        ap.selectDate("March","7");
        ap.clickSearch();
        Thread.sleep(10000);
    }
}
