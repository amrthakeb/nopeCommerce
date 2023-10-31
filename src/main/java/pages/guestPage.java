package pages;

import Util.genericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class guestPage extends genericMethods {

    private WebDriver driver;
    public guestPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
private By guestBtn=By.cssSelector("button.checkout-as-guest-button");


    public addressPage clickGuestBtn(){
        clickElement(driver.findElement(guestBtn));
        return new addressPage(driver);
    }
}
