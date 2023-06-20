package uk.co.automationtesting;

import pageObjects.HomePage;
import pageObjects.StoreHomePage;
import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class StoreTest extends BasePage {
    public StoreTest() throws IOException {
    }
    @Test
    public void storeTest () throws IOException, InterruptedException {

        WebDriver driver = getDriver();

        driver.manage().window().maximize();

        driver.get(getUrl());

        HomePage homePage = new HomePage(driver);

        homePage.getCookie().click();

        homePage.getToggle().click();

        TimeUnit.SECONDS.sleep(2);

        homePage.getTestStoreLink().click();

        StoreHomePage storePage = new StoreHomePage(driver);

        TimeUnit.SECONDS.sleep(2);

        System.out.println(storePage.getListOfProducts().size());

        storePage.getListOfProducts().get(storePage.randomProductFromList()).click();

    }
}
