package com.qaprosoft.carina.demo.phpTravels.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.phpTravels.pages.BookingsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginBlock extends AbstractUIObject {

    @FindBy(name = "email")
    private ExtendedWebElement emailInput;

    @FindBy(name = "password")
    private ExtendedWebElement passwordInput;

    @FindBy(className = "btn")
    private ExtendedWebElement loginButton;

    public LoginBlock(WebDriver driver) {
        super(driver);
    }

    public BookingsPage openBookingsPage() {
        loginButton.click();
        return new BookingsPage(driver);
    }
}
