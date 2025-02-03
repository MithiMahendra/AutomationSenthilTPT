package tests;

import org.testng.annotations.Test;
import pageObjects.PracticePage;
import utility.Base;

import java.util.Set;

public class HandleMultipleWindow extends Base {
    @Test
    public void handleMultipleWindow(){
        PracticePage pp = new PracticePage(Base.driver);
        String parent = Base.driver.getWindowHandle();
        pp.OpenWindow().click();
        Set<String> allWindows = Base.driver.getWindowHandles();
        for(String window:allWindows){
            if(window.equals(parent)){
                System.out.println("This is parent");
            }
            else {
                Base.driver.switchTo().window(window);
                System.out.println(pp.AboutUs().getText());
            }
        }
    }
}
