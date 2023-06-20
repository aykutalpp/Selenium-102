package uk.co.automationtesting;

import base.BasePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class OrderCompleteTest extends BasePage {
    public OrderCompleteTest() throws IOException {
    }

    @BeforeTest
    public void setup () throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }
    @AfterTest
    public void tearDown () {
        driver.close();
        driver = null;
    }

    @Test
    public void endToEndTest () throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.getCookie().click();
        home.getToggle().click();
        TimeUnit.SECONDS.sleep(2);
        home.getTestStoreLink().click();

        StoreHomePage storeHome = new StoreHomePage(driver);
        storeHome.getProdOne().click();

        ShopProductPage shopProd = new ShopProductPage(driver);
        Select option = new Select(shopProd.getSizeOption());
        option.selectByVisibleText("L");
        shopProd.getQuantIncrease().click();
        shopProd.getAddToCartBtn().click();

        TimeUnit.SECONDS.sleep(3);

        ShopContentPanel shopContent = new ShopContentPanel(driver);
        shopContent.getCheckoutBtn().click();

        ShoppingCart shoppingCart = new ShoppingCart(driver);
        shoppingCart.getHavePromo().click();
        shoppingCart.getPromoTextbox().sendKeys("20OFF");
        shoppingCart.getPromoAddBtn().click();
        TimeUnit.SECONDS.sleep(3);
        shoppingCart.getProceedCheckoutBtn().click();

        OrderFormPersInfo pInfo = new OrderFormPersInfo(driver);
        pInfo.getGenderMr().click();
        pInfo.getFirstNameField().sendKeys("Aykut");
        pInfo.getLastnameField().sendKeys("Smith");
        pInfo.getEmailField().sendKeys("aykutsmith@testmail.com");
        pInfo.getTermsConditionsCheckbox().click();
        TimeUnit.SECONDS.sleep(2);
        pInfo.getContinueBtn().click();

        OrderFormDelivery oDeliver = new OrderFormDelivery(driver);
        oDeliver.getAddressField().sendKeys("İrfanlı mah.");
        oDeliver.getCityField().sendKeys("Düziçi/Osmaniye");
        Select state = new Select(oDeliver.getStateDropdown());
        state.selectByVisibleText("Texas");
        oDeliver.getPostcodeField().sendKeys("40100");
        TimeUnit.SECONDS.sleep(2);
        oDeliver.getContinueBtn().click();

        OrderFormShippingMethod oShip = new OrderFormShippingMethod(driver);
        oShip.getDeliveryMsgTextbox().sendKeys("Fragile");
        TimeUnit.SECONDS.sleep(2);
        oShip.getContinueBtn().click();

        OrderFormPayment oPay = new OrderFormPayment(driver);
        oPay.getPayByCheckRadioBtn().click();
        oPay.getTermsConditionsCheckbox().click();
        TimeUnit.SECONDS.sleep(2);
        oPay.getOrderBtn().click();



    }
}
