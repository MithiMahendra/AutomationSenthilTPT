package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.abhibusPage;
import utility.Base;
import utility.Utilities;
import java.util.ArrayList;
import java.util.List;

public class CalanderExample extends Base {

    @Test
    public void calExample() throws InterruptedException {
        abhibusPage ap = new abhibusPage(Base.driver);
        ap.enterSource("Bangalore");
        ap.enterDestination("Tirupati");
        ap.selectDate("March","15");
        ap.clickSearch();
        Thread.sleep(10000);
        List<WebElement> buses = driver.findElements(By.xpath("//div[@class='container card service  md ']"));
        int busesList  = buses.size();
        System.out.println(busesList);

    }
}
