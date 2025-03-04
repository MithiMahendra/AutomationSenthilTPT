package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticePageCheckBox {

    public WebDriver driver;
    public WebDriverWait wait;
    Actions actions;

    public PracticePageCheckBox(WebDriver driver){
        this.driver = driver;

    }
}
