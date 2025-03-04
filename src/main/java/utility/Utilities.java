package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utilities extends Base{

public WebDriverWait wait = new WebDriverWait(Base.driver, Duration.ofSeconds(10));
    public void waitAndClick(By locator){
    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }
    public void scrollToElement(WebElement element){
        ((JavascriptExecutor) Base.driver).executeScript("arguments[0].scrollIntoView(true)", element);
    }
    public void waitAndEnterValue(By locator,String inputValue){
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(inputValue);
    }

}
