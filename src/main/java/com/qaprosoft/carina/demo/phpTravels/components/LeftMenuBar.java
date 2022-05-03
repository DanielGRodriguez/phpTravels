package com.qaprosoft.carina.demo.phpTravels.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.phpTravels.pages.BookingsPage;
import com.qaprosoft.carina.demo.phpTravels.pages.DashboardPage;
import com.qaprosoft.carina.demo.phpTravels.pages.dropdownNav.SettingsPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LeftMenuBar extends AbstractUIObject {

    @FindBy(xpath = "//div/a[@class='nav-link loadeffect mdc-ripple-upgraded']")
    private ExtendedWebElement menuDashboard;

    @FindBy(xpath = "//div/a[@class='nav-link collapsed mdc-ripple-upgraded']")
    private ExtendedWebElement menuSettings;

    @FindBy(xpath = "//div[@class='collapse show']/nav/a")
    private ExtendedWebElement submenuSettingsButton;

    @FindBy(xpath = "//div/a[@class='nav-link collapsed mdc-ripple-upgraded']")
    private ExtendedWebElement subMenuSettings;

    @FindBy(xpath = "//div/a[@class='nav-link collapsed loadeffect mdc-ripple-upgraded']")
    private ExtendedWebElement menuModules;

    @FindBy(xpath = "//div/a[6]")
    private ExtendedWebElement menuAccounts;

    @FindBy(xpath = "//div/a[17]")
    private ExtendedWebElement menuBookings;

    public LeftMenuBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public DashboardPage openDashboardPage() {
        menuDashboard.click();
        return new DashboardPage(driver);
    }

    public SettingsPage openSettingsSubmenu() {
        menuSettings.click();
        submenuSettingsButton.click();
        return new SettingsPage(driver);
    }

    public BookingsPage openBookingsPage() {
        menuBookings.click();
        return new BookingsPage(driver);
    }
}
