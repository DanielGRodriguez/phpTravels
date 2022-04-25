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

    @FindBy(xpath = "//input[@name='slogan']")
    private ExtendedWebElement nameTextField;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private ExtendedWebElement saveChangesButton;

    @FindBy(xpath = "//h4[text()=\"Changes Saved!\"]")
    private ExtendedWebElement changesSavedText;

    public SettingsPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(saveChangesButton);
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }

    public void typeNameText(String newName) {
        nameTextField.type(newName);
    }

    public void clickSaveChangeButton() {
        saveChangesButton.click();
    }

    public boolean getChangesSaved() {
        return changesSavedText.isElementPresent();
    }

}
