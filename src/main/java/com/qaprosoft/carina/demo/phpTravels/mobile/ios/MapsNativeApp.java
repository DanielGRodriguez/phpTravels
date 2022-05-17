package com.qaprosoft.carina.demo.phpTravels.mobile.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.Predicate;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;
import com.qaprosoft.carina.demo.phpTravels.mobile.common.MapsNativeAppBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginPageBase.class)
public class MapsNativeApp extends MapsNativeAppBase {

    @ExtendedFindBy(accessibilityId = "Precise Location: Off")
    private ExtendedWebElement buttonPreciseLocation;

    @ExtendedFindBy(accessibilityId = "Settings")
    private ExtendedWebElement buttonMapSetting;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Tracking\"`]")
    private ExtendedWebElement buttonMapTracking;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeSwitch[`label == \"Traffic\"`]")
    private ExtendedWebElement buttonMapTraffic;

    @ExtendedFindBy(accessibilityId = "Mark My Location")
    private ExtendedWebElement buttonMapMarkLocation;

    public MapsNativeApp(WebDriver driver) {
        super(driver);
    }
}
