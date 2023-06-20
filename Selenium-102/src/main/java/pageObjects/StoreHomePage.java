package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class StoreHomePage {
    public WebDriver driver ;

    public StoreHomePage(WebDriver driver) {
        this.driver = driver;
    }
    By productOne = By.linkText("Hummingbird Printed T-Shirt");
    By productTwo = By.linkText("Hummingbird Printed Sweater");
    By productThree = By.linkText("The Best Is Yet To Come'...");
    By productFour = By.linkText("The Adventure Begins Framed...");
    By productFive = By.linkText("Today Is A Good Day Framed...");
    By productSix = By.linkText("Mug The Best Is Yet To Come");
    By productSeven = By.linkText("Mug The Adventure Begins");
    By productEight = By.linkText("Mug Today Is A Good Day");
    By listOfProducts = By.cssSelector(".thumbnail-container");

    public WebElement getProdOne() {
        return driver.findElement(productOne);
    }

    public WebElement getProdTwo() {
        return driver.findElement(productTwo);
    }

    public WebElement getProdThree() {
        return driver.findElement(productThree);
    }

    public WebElement getProdFour() {
        return driver.findElement(productFour);
    }

    public WebElement getProdFive() {
        return driver.findElement(productFive);
    }

    public WebElement getProdSix() {
        return driver.findElement(productSix);
    }

    public WebElement getProdSeven() {
        return driver.findElement(productSeven);
    }

    public WebElement getProdEight() {
        return driver.findElement(productEight);
    }

    public List<WebElement> getListOfProducts () {
        return driver.findElements(listOfProducts);
    }

    public int randomProductFromList () {
        int min = 1;
        int max = getListOfProducts().size();
        int rand = (int)Math.floor(Math.random() * (max - min + 1) +  min);

        return rand;
    }
}
