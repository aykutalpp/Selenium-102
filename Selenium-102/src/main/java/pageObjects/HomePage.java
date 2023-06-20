package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By toggle = By.cssSelector(".toggle");
    By homePageLink = By.linkText("Homepage");
    By accordionLink = By.linkText("Homepage");
    By actionsLink = By.linkText("Actions");
    By browserTabsLink = By.linkText("Browser Tabs");
    By buttonsLink = By.linkText("Buttons");
    By calculatorLink = By.linkText("Calculator (JS)");
    By contactUsLink = By.linkText("CONTACT US FORM TEST");
    By datePickerLink = By.linkText("DATE PICKER");
    By dropdownLink = By.linkText("DROPDOWN CHECKBOX & RADIO");
    By fileUploadLink = By.linkText("FILE UPLOAD");
    By hiddenElementsLink = By.linkText("HIDDEN ELEMENTS");
    By iFrameLink = By.linkText("IFRAME");
    By loaderLink = By.linkText("LOADER");
    By loginPortalLink = By.linkText("LOGIN PORTAL TEST");
    By mouseLink = By.linkText("MOUSE MOVEMENT");
    By popupLink = By.linkText("POP UPS & ALERTS");
    By predictiveLink = By.linkText("PREDICTIVE SEARCH");
    By tablesLink = By.linkText("TABLES");
    By testStore = By.cssSelector("a[href='http://teststore.automationtesting.co.uk/']");
    By aboutMeLink = By.linkText("ABOUT ME");
    By cookie = By.cssSelector(".close-cookie-warning > span");


    public WebElement getToggle() {
        return driver.findElement(toggle);
    }

    public WebElement getHomePageLink() {
        return driver.findElement(homePageLink);
    }

    public WebElement getAccordionLink() {
        return driver.findElement(accordionLink);
    }

    public WebElement getActionsLink() {
        return driver.findElement(actionsLink);
    }

    public WebElement getBrowserTabsLink() {
        return driver.findElement(browserTabsLink);
    }

    public WebElement getButtonsLink() {
        return driver.findElement(buttonsLink);
    }

    public WebElement getCalculatorLink() {
        return driver.findElement(calculatorLink);
    }

    public WebElement getContactUsLink() {
        return driver.findElement(contactUsLink);
    }

    public WebElement getDatePickerLink() {
        return driver.findElement(datePickerLink);
    }

    public WebElement getDropdownLink() {
        return driver.findElement(dropdownLink);
    }

    public WebElement getFileUpload() {
        return driver.findElement(fileUploadLink);
    }

    public WebElement getHiddenElementsLink() {
        return driver.findElement(hiddenElementsLink);
    }

    public WebElement getiFrameLink() {
        return driver.findElement(iFrameLink);
    }

    public WebElement getLoaderLink() {
        return driver.findElement(loaderLink);
    }

    public WebElement getLoginPortalLink() {
        return driver.findElement(loginPortalLink);
    }

    public WebElement getMouseLink() {
        return driver.findElement(mouseLink);
    }

    public WebElement getPopupLink() {
        return driver.findElement(popupLink);
    }

    public WebElement getPredictiveLink() {
        return driver.findElement(predictiveLink);
    }

    public WebElement getTablesLink() {
        return driver.findElement(tablesLink);
    }

    public WebElement getTestStoreLink() {
        return driver.findElement(testStore);
    }

    public WebElement getAboutMeLink() {
        return driver.findElement(aboutMeLink);
    }

    public WebElement getCookie() {
        return driver.findElement(cookie);
    }
}
