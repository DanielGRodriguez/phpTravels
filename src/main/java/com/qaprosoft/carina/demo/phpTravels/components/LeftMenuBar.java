package com.qaprosoft.carina.demo.phpTravels.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LeftMenuBar extends AbstractUIObject {

    @FindBy(xpath = "//div/a[@class='nav-link loadeffect mdc-ripple-upgraded']")
    private ExtendedWebElement menuDashboard;

    @FindBy(xpath = "//div/a[@class='nav-link collapsed mdc-ripple-upgraded']")
    private ExtendedWebElement menuSettings;

    @FindBy(xpath = "//div/a[@class='nav-link collapsed loadeffect mdc-ripple-upgraded']")
    private ExtendedWebElement menuModules;

    @FindBy(xpath = "//div/a[6]")
    private ExtendedWebElement menuAccounts;

    @FindBy(xpath = "//div/a[7]")
    private ExtendedWebElement menuCMS;

    @FindBy(xpath = "//div/a[8]")
    private ExtendedWebElement menuFlights;

    @FindBy(xpath = "//div/a[9]")
    private ExtendedWebElement menuHotels;

    @FindBy(xpath = "//div/a[10]")
    private ExtendedWebElement menuVisa;

    @FindBy(xpath = "//div/a[11]")
    private ExtendedWebElement menuTours;

    @FindBy(xpath = "//div/a[12]")
    private ExtendedWebElement menuOffer;

    @FindBy(xpath = "//div/a[13]")
    private ExtendedWebElement menuBlog;

    @FindBy(xpath = "//div/a[14]")
    private ExtendedWebElement menuLocation;

    @FindBy(xpath = "//div/a[15]")
    private ExtendedWebElement menuNewsletter;

    @FindBy(xpath = "//div/a[16]")
    private ExtendedWebElement menuPayout;

    @FindBy(xpath = "//div/a[17]")
    private ExtendedWebElement menuBookings;

    public LeftMenuBar(WebDriver driver) {
        super(driver);
    }
}
