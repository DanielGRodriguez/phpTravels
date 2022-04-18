package com.solvd.phpTravels.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.phpTravels.pages.BookingsPage;
import com.solvd.phpTravels.pages.DropdownNav.ProfilePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginBlock extends AbstractUIObject {
    @FindBy(xpath = "//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[1]/label/input")
    private ExtendedWebElement emailInput;
    @FindBy(xpath = "//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[2]/label/input")
    private ExtendedWebElement passwordInput;
    @FindBy(xpath = "/html/body/div/div[1]/main/div/div/div/div[1]/div/form/div[4]/button")
    private ExtendedWebElement loginButton;

    public LoginBlock(WebDriver driver) {
        super(driver);
    }

    public BookingsPage openBookingsPage() {
        loginButton.click();
        return new BookingsPage(driver);
    }
}
