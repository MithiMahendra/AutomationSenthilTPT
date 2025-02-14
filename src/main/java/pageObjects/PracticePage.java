package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Utilities;

import java.time.Duration;

public class PracticePage {
    Utilities utility  = new Utilities();
    public WebDriver driver;
    public WebDriverWait wait;
    Actions actions;
    public PracticePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
    }
    @FindBy(xpath = "(//tr//th)[1]")
    WebElement header1;

    @FindBy(xpath = "(//tr//th)[2]")
    WebElement header2;

    @FindBy(xpath = "(//tr//th)[3]")
    WebElement header3;

    @FindBy(id="openwindow")
    WebElement openWindow;

    @FindBy(xpath = "//h2[contains(text(),'Welcome to QAClick Academy ')]")
    WebElement aboutUs;

    @FindBy(id = "courses-iframe")
    WebElement ifrmaeExample;

    @FindBy(xpath = "(//a[@href='/'])[2]")
    WebElement homeMenu;

    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    WebElement ScrollMoreMenu;

    By moreMenu = By.xpath("//a[@class='dropdown-toggle']");


    @FindBy(xpath = "//a[@href='contact-us']")
    WebElement contactUs;

    @FindBy(xpath = "(//h4[text()='Address'])[1]")
    WebElement address;

    public WebElement AboutUs(){
        return aboutUs;
    }
    public WebElement OpenWindow(){
        return openWindow;
    }

    public WebElement header1(){
        return header1;
    }
    public WebElement header2(){
        return header2;
    }
    public WebElement header3(){
        return header3;
    }

    //Method to switch to I frame
    public void switchToIframe(){
        driver.switchTo().frame(ifrmaeExample);
    }

    //Click on the home menu
    public WebElement clickOnHome(){
        return homeMenu;
    }
    public WebElement getScrollMoreMenu(){
        return ScrollMoreMenu;
    }

    //Hover to the more menu
    public void clickOnMoreMenu(){
        utility.waitAndClick(moreMenu);
    }
    public void scrollToMoreMenu(){
        utility.scrollToElement(ScrollMoreMenu);
    }
    public WebElement clickContact(){
        return contactUs;
        //wait.until(ExpectedConditions.elementToBeClickable(contactUs)).click();
    }

    public WebElement getAddressText(){
        return address;
    }



}
