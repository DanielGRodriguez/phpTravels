package com.qaprosoft.carina.demo.phpTravels.mobile.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.Predicate;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;
import com.qaprosoft.carina.demo.phpTravels.mobile.common.SettingsAppBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginPageBase.class)
public class SettingsIos extends SettingsAppBase {

    @FindBy(xpath = "elementId = '20000000-0000-0000-541C-000000000000'")
    private ExtendedWebElement buttonSettingsGeneral;

    @FindBy(xpath = "name = 'Set up iCloud, the App Store, and more.' AND visible = 'true'")
    private ExtendedWebElement buttonAddProfile;

    @FindBy(xpath = "name = 'Passwords'")
    private ExtendedWebElement buttonPasswords;

    @FindBy(xpath = "xpath = 'E0000000-0000-0000-541C-000000000000' AND visible = 'true'")
    private ExtendedWebElement buttonMapPrivacy;

    @FindBy(xpath = "xpath = '75010000-0000-0000-541C-000000000000'")
    @Predicate
    private ExtendedWebElement inputEmailText;

    public SettingsIos(WebDriver driver) {
        super(driver);
    }
}
