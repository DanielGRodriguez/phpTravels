package com.solvd.phpTravels.pages.DropdownNav;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.phpTravels.components.NavigationBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends AbstractPage {
    @FindBy(className = "navbar")
    private NavigationBar navigationBar;


    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }
}
