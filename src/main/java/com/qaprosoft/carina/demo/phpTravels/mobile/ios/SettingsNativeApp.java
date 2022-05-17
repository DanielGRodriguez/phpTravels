package com.qaprosoft.carina.demo.phpTravels.mobile.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.Predicate;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;
import com.qaprosoft.carina.demo.phpTravels.mobile.common.SettingsNativeAppBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginPageBase.class)
public class SettingsNativeApp extends SettingsNativeAppBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeCell[`name == \"General\"`]")
    private ExtendedWebElement buttonSettingsGeneral;

    @ExtendedFindBy(accessibilityId = "Sign in to your iPhone")
    private ExtendedWebElement buttonAddProfile;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeCell[`label == \"Passwords\"`]")
    private ExtendedWebElement buttonPasswords;

    @ExtendedFindBy(accessibilityId = "Maps")
    private ExtendedWebElement buttonMapPrivacy;

    @ExtendedFindBy(accessibilityId = "username-field")
    private ExtendedWebElement inputEmailText;

    public SettingsNativeApp(WebDriver driver) {
        super(driver);
    }
}
