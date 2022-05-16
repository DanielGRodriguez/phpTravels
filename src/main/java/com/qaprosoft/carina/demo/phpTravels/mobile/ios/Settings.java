package com.qaprosoft.carina.demo.phpTravels.mobile.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.Predicate;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;
import com.qaprosoft.carina.demo.phpTravels.mobile.common.SettingsAppBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginPageBase.class)
public class Settings extends SettingsAppBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeCell[`name == \"General\"`]")
    private ExtendedWebElement buttonSettingsGeneral;

    @FindBy(id = "Sign in to your iPhone")
    private ExtendedWebElement buttonAddProfile;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeCell[`label == \"Passwords\"`]")
    private ExtendedWebElement buttonPasswords;

    @FindBy(id = "Maps")
    private ExtendedWebElement buttonMapPrivacy;

    @FindBy(id = "username-field")
    @Predicate
    private ExtendedWebElement inputEmailText;

    public Settings(WebDriver driver) {
        super(driver);
    }
}
