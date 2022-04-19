package com.qaprosoft.carina.demo.phpTravels.pages.DropdownNav;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.phpTravels.components.LeftMenuBar;
import com.qaprosoft.carina.demo.phpTravels.components.NavigationBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends AbstractPage {

    @FindBy(xpath = "//nav[@class]")
    private NavigationBar navigationBar;

    @FindBy(xpath = "//div[@class='nav']")
    private LeftMenuBar leftMenuBar;

    @FindBy(xpath = "//mwc-textfield[@name='site_title']")
    private ExtendedWebElement nameTextField;

    @FindBy(xpath = "//button[@type='submit']")
    private ExtendedWebElement saveChangesButton;

    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }


}
