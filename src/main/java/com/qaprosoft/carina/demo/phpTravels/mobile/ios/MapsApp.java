package com.qaprosoft.carina.demo.phpTravels.mobile.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.Predicate;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;
import com.qaprosoft.carina.demo.phpTravels.mobile.common.MapsAppBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginPageBase.class)
public class MapsApp extends MapsAppBase {

    @FindBy(id = "Precise Location: Off")
    private ExtendedWebElement buttonPreciseLocation;

    @FindBy(id = "Settings")
    private ExtendedWebElement buttonMapSetting;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Tracking\"`]")
    private ExtendedWebElement buttonMapTracking;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeSwitch[`label == \"Traffic\"`]")
    private ExtendedWebElement buttonMapTraffic;

    @FindBy(id = "Mark My Location")
    @Predicate
    private ExtendedWebElement buttonMapMarkLocation;

    public MapsApp(WebDriver driver) {
        super(driver);
    }
}
