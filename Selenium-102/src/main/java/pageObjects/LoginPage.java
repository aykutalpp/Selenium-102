package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver ;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By email = By.cssSelector("section input[name='email']");
    By password = By.cssSelector("input[name='password']");
    By signInBtn = By.id("submit-login");

    public WebElement getEmail() {
        return driver.findElement(email);
    }

    public WebElement getPassword() {
        return driver.findElement(password);
    }

    public WebElement getSignInBtn() {
        return driver.findElement(signInBtn);
    }
}
