package com.solvd.phpTravels.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.phpTravels.pages.DropdownNav.HelpPage;
import com.solvd.phpTravels.pages.DropdownNav.ProfilePage;
import com.solvd.phpTravels.pages.DropdownNav.SettingsPage;
import com.solvd.phpTravels.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProfileDropdown extends AbstractUIObject {

    @FindBy(xpath = "/html/body/nav/div/div/div/div[3]/ul/li[1]/a")
    private ExtendedWebElement profileLink;
    @FindBy(xpath = "/html/body/nav/div/div/div/div[3]/ul/li[2]/a")
    private ExtendedWebElement settingsLink;
    @FindBy(xpath = "/html/body/nav/div/div/div/div[3]/ul/li[3]/a")
    private ExtendedWebElement helpLink;
    @FindBy(xpath = "/html/body/nav/div/div/div/div[3]/ul/li[5]/a")
    private ExtendedWebElement logoutLink;

    public ProfileDropdown(WebDriver driver) {
        super(driver);
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

    public LoginPage touchLogout() {
        logoutLink.click();
        return new LoginPage(driver);
    }
}
