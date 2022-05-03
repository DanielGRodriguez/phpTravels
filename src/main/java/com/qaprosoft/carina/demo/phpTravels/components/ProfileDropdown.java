package com.qaprosoft.carina.demo.phpTravels.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.phpTravels.pages.dropdownNav.HelpPage;
import com.qaprosoft.carina.demo.phpTravels.pages.dropdownNav.SettingsPage;
import com.qaprosoft.carina.demo.phpTravels.pages.dropdownNav.ProfilePage;
import com.qaprosoft.carina.demo.phpTravels.pages.LoginPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProfileDropdown extends AbstractUIObject {

    @FindBy(xpath = "//div[normalize-space()='Profile']")
    private ExtendedWebElement profileLink;

    @FindBy(xpath = "//div[normalize-space()='Settings']")
    private ExtendedWebElement settingsLink;

    @FindBy(xpath = "//div[normalize-space()='Help']")
    private ExtendedWebElement helpLink;

    @FindBy(xpath = "//div[normalize-space()='Logout']")
    private ExtendedWebElement logoutLink;

    public ProfileDropdown(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ProfilePage openProfile() {
        profileLink.click();
        return new ProfilePage(driver);
    }

    public SettingsPage openSettings() {
        settingsLink.click();
        return new SettingsPage(driver);
    }

    public HelpPage openHelp() {
        helpLink.click();
        return new HelpPage(driver);
    }

    public LoginPage clickLogout() {
        logoutLink.click();
        return new LoginPage(driver);
    }
}
