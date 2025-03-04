package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(120));
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
//----------------------------------------------
    //fieldset/iframe[@id='courses-iframe']
    //iframe[@id='courses-iframe']

    @FindBy(id = "courses-iframe")
    WebElement ifrmaeExample;

    @FindBy(xpath = "(//a[@href='/'])[2]")
    WebElement homeMenu;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    WebElement moreMenu;

    //By moreMenu = By.xpath("//a[@class='dropdown-toggle']");


    @FindBy(xpath = "(//a[@href='contact-us'])[1]")
    WebElement contactUs;

    @FindBy(xpath = "//li[h4[text()='Address']]/text()[1]")
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
    public void getScrollMoreMenu(){
        try {
            //Scroll into more menu
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", moreMenu);
            wait.until(ExpectedConditions.visibilityOf(moreMenu));
            //perform actions
            actions.moveToElement(moreMenu).perform();
        } catch (Exception e){
            System.out.println("Error hovering over more menu: " + e.getMessage());
        }
    }

    //Hover to the more menu

    public void clickContact(){
        wait.until(ExpectedConditions.elementToBeClickable(contactUs));
        //wait.until(ExpectedConditions.elementToBeClickable(contactUs)).click();
    }

    public String getAddressText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(address))).getText();
    }



}
