package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticePage {
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

    @FindBy(xpath = "//a[@href='/']")
    WebElement homeMenu;

    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    WebElement moreMenu;

    @FindBy(xpath = "//a[@href='contact-us']")
    WebElement contactUs;

    @FindBy(xpath = "//h4[text()='Address']/following-sibling::br/following-sibling::text()")
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
    public void clickOnHome(){
        homeMenu.click();
    }

    //Hover to the more menu
    public void hoverToMoreMenu(){
        actions.moveToElement(moreMenu).perform();
    }
    public void clickContact(){
        wait.until(ExpectedConditions.elementToBeClickable(contactUs)).click();
    }

    public String getAddressText(){
        return wait.until(ExpectedConditions.visibilityOf(address)).getText();
    }



}
