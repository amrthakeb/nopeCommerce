package pages;

import java.lang.String;
import java.time.Duration;

import Util.genericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class confirmPage extends genericMethods {
    private WebDriver driver;

    public confirmPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }



    private By confirmText=By.cssSelector("div.page-title");
    public String getTitleText(){
         //String x=

        return   driver.findElement(confirmText).getText();
            //return x;
    }


}
