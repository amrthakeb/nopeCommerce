package Util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class genericMethods {
    WebDriver driver;
    public genericMethods (WebDriver driver){
        this.driver=driver;
    }

    public void clickElement(WebElement element){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
        highlight(element);
        element.click();
    }
public void enterText(WebElement element,String text){
    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    wait.until(ExpectedConditions.visibilityOf(element));
    highlight(element);
    element.sendKeys(text);


}
public void highlight(WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript("arguments[0].setAttribute('style'," +
            " ' border: 2px solid red;');", element);
        }
}
