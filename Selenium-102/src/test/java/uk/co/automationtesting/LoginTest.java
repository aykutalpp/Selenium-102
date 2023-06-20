package uk.co.automationtesting;

import pageObjects.LoginPage;
import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends BasePage {
    public LoginTest() throws IOException {
    }

    @Test
    public void login () throws IOException {
        WebDriver driver = getDriver();

        driver.manage().window().maximize();

        driver.get(getUrl());

        LoginPage logPage = new LoginPage(driver);

        logPage.getEmail().sendKeys("testl@test.com");

        logPage.getPassword().sendKeys("test123");

        logPage.getSignInBtn().click();

    }
}