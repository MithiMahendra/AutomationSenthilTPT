package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.PracticePage;
import utility.Base;

public class WebTableHeaderText extends Base {

    @Test
    public void WebTableHeader(){
        PracticePage pp = new PracticePage(Base.driver);
        Assert.assertEquals(pp.header1().getText(),"Instructor");
        System.out.println("Header 1 is verified");
        Assert.assertEquals(pp.header2().getText(),"Course");
        System.out.println("Header 2 is verified");
        Assert.assertEquals(pp.header3().getText(),"Price");
        System.out.println("Header 3 is verified");
    }

}
