package pages;

import Util.genericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class addressPage extends genericMethods {
    private WebDriver driver;
    public addressPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    private By firstName=By.name("BillingNewAddress.FirstName");
    private By lastName=By.name("BillingNewAddress.LastName");
    private By email=By.name("BillingNewAddress.Email");
    private By country=By.name("BillingNewAddress.CountryId");
    private By city=By.name("BillingNewAddress.City");
    private By adress1=By.name("BillingNewAddress.Address1");
    private By zipCode=By.name("BillingNewAddress.ZipPostalCode");
    private By phone=By.name("BillingNewAddress.PhoneNumber");
    private By continueBtn=By.xpath("//button[@name='save']");

    private By continueBtn2=By.className("shipping-method-next-step-button");
    private By continueBtn3=By.className("payment-method-next-step-button");
    private  By continueBtn4=By.className("payment-info-next-step-button");
    private By confirmBtn=By.className("confirm-order-next-step-button");
        public void enterDetails(){
            enterText(driver.findElement(firstName),"Amr" );
            enterText(driver.findElement(lastName),"saad" );
            enterText(driver.findElement(email),"amr@hotmail.com" );
            Select count = new Select(driver.findElement(country));
                count.selectByVisibleText("Egypt");
            enterText(driver.findElement(city),"Giza" );
            enterText(driver.findElement(adress1),"Giza" );
            enterText(driver.findElement(zipCode),"246810" );
            enterText(driver.findElement(phone),"01112" );
            clickElement(driver.findElement(continueBtn));

            clickElement(driver.findElement(continueBtn2));
            clickElement(driver.findElement(continueBtn3));
            clickElement(driver.findElement(continueBtn4));
            }
public confirmPage lastAction(){
    clickElement(driver.findElement(confirmBtn));
        String expectedURL = "https://demo.nopcommerce.com/checkout/completed";
        String currentURL = driver.getCurrentUrl();

        if (currentURL== expectedURL){
            System.out.println("You are on the expected page.");
        } else{
            System.out.println("You are not on the expected page.");
            System.out.println("Current URL: " + currentURL);
        }

    return new confirmPage(driver);


}

}
