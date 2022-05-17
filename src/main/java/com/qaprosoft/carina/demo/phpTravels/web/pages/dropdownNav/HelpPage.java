package com.qaprosoft.carina.demo.phpTravels.web.pages.dropdownNav;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.phpTravels.web.pages.components.NavigationBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HelpPage extends AbstractPage {

    @FindBy(className = "//nav[@class]")
    private NavigationBar navigationBar;

    public HelpPage(WebDriver driver) {
        super(driver);
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }
}
