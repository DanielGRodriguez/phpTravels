package com.qaprosoft.carina.demo.phpTravels.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {


    @FindBy(xpath = "//input[@name='email']")
    private ExtendedWebElement emailInput;

    @FindBy(xpath = "//input[@name='password']")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = "//a[@id='link-forgot']")
    private ExtendedWebElement forgotAccButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://phptravels.net/api/admin");
    }

    public BookingsPage openBookingsPage() {
        loginButton.click();
        return new BookingsPage(driver);
    }

    public ExtendedWebElement openForgotAcc() {
        forgotAccButton.click();
        return new ExtendedWebElement();
    }

}
