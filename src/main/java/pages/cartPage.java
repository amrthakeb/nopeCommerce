package pages;

import Util.genericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartPage extends genericMethods {
    private WebDriver driver;
    public cartPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    private By terms=By.id("termsofservice");
    private By checkBtn=By.xpath("//button[@name='checkout']");

    public guestPage agreeTerms_checkout(){
        clickElement(driver.findElement(terms));
        clickElement(driver.findElement(checkBtn));
        return new guestPage(driver);
    }




}
