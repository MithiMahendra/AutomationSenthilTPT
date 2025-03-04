package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Base;
import utility.Utilities;

import java.time.Duration;
import java.util.List;

public class abhibusPage {
    Utilities util = new Utilities();
    private final WebDriver driver;
    WebDriverWait wait = new WebDriverWait(Base.driver, Duration.ofSeconds(30));
    Actions action = new Actions(Base.driver);
    public abhibusPage(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver,this);
}

    By from = By.xpath("//input[@placeholder='From Station']");
    By to = By.xpath("//input[@placeholder='To Station']");
    By onWordJounry = By.xpath("//input[@placeholder='Onward Journey Date']//parent::div");
    By search = By.xpath("//button[text()='Search']");
    By currentMonth = By.xpath(("(//div[@class='container month ']//following-sibling::div)[1]//span[1]"));
    By rightArrow = By.xpath(("(//div[@class='container month ']//following-sibling::div)[2]//span"));
    By allDates = By.xpath(("(//div[@class='container month ']//following-sibling::div)[3]//span"));


    public void enterSource(String fromCity){
    util.waitAndEnterValue(from,fromCity);
    action.moveToElement(Base.driver.findElement(By.xpath("//div[text()='"+fromCity+"']"))).click().build().perform();
    }
    public void clickSearch(){
        util.waitAndClick(search);
    }
    public void enterDestination(String toCity){
        util.waitAndEnterValue(to,toCity);
        action.moveToElement(Base.driver.findElement(By.xpath("//div[text()='"+toCity+"']"))).click().build().perform();
    }
    public void selectDate(String selectedMonth,String selectedDate){
        Base.driver.findElement(onWordJounry).click();
        String cMonth = Base.driver.findElement(currentMonth).getText();
        if (cMonth.equalsIgnoreCase(selectedMonth)){
                List<WebElement> allDate = Base.driver.findElements(allDates);
                for (int i=0;i<allDate.size();i++){
                    String date = allDate.get(i).getText();
                    if (date.equalsIgnoreCase(selectedDate)){
                        allDate.get(i).click();
                        break;
                    }
                }
        }
        else{
            System.out.println("Please enter a valid date");
        }

    }

}
