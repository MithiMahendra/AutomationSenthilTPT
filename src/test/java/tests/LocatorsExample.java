package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObjects.PracticePage;
import utility.Base;

public class LocatorsExample extends Base {

    /*
    * Locators
    * 1. id
    * 2. name
    * 3. linkText
    * 4. partial link text
    * 5. xpath
    * 6. CSS selector
    *
    * */

@Test
    public void locatorExample(){
    // Name example
    Base.driver.findElement(By.name("radioButton"));
    //link text
    //Base.driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
    //partial link text
    Base.driver.findElement(By.partialLinkText("Free Access to InterviewQues/Resume")).click();

}


}
