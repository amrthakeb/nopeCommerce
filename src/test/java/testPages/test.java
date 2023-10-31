package testPages;

import TestBase.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class test extends Base {
    @Test
    public void testHome(){
        homePage home=new homePage(driver);

        home.hooverElectronics();
        home.clickPhones();

        phonesPage phones=new phonesPage(driver);
        phones.scrollToElement();
        phones.clickPhone();
        phones.clickAdd();
        phones.goToCart();


        cartPage cart=new cartPage(driver);
        cart.agreeTerms_checkout();

            guestPage guest=new guestPage(driver);
            guest.clickGuestBtn();
        addressPage details=new addressPage(driver);
        details.enterDetails();
        details.lastAction();

        confirmPage confirm=new confirmPage(driver);

        Assert.assertEquals(confirm.getTitleText(),"Checkout");


        }
    }
