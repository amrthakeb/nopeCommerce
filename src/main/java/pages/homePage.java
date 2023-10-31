package pages;

import Util.genericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.annotation.Tainted;

public class homePage extends genericMethods {
    private WebDriver driver;
    public homePage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }

    private By eleBtn=By.linkText("Electronics");
    private By cellPhones=By.linkText("Cell phones");



    public void hooverElectronics(){

    WebElement element=driver.findElement(eleBtn);
    Actions action = new Actions(driver);
    action.moveToElement(element).perform();
    }
        public phonesPage clickPhones(){
        clickElement(driver.findElement(cellPhones));
        return new phonesPage(driver);
        }
}
