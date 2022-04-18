package com.solvd.phpTravels.pages.DropdownNav;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.phpTravels.components.NavigationBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HelpPage extends AbstractPage {
    @FindBy(className = "navbar")
    private NavigationBar navigationBar;


    public HelpPage(WebDriver driver) {
        super(driver);
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }
}
