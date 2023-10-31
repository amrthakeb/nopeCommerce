package pages;

import Util.genericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.lang.model.element.Element;

public class phonesPage extends genericMethods {
    private WebDriver driver;
    public phonesPage(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }
    private By HtcPhone=By.xpath("//img[@alt='Picture of HTC One Mini Blue']");
    private By AddBtn=By.id("add-to-cart-button-19");

    private By CartBtn=By.cssSelector("a.ico-cart");
    public void scrollToElement()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(HtcPhone));
    }

    public void clickPhone(){
        clickElement(driver.findElement(HtcPhone));

    }

    public void clickAdd(){
        clickElement(driver.findElement(AddBtn));
    }

    public cartPage goToCart(){
            clickElement(driver.findElement(CartBtn));
            return new cartPage(driver);

    }
}
