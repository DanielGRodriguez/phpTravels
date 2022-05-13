package com.qaprosoft.carina.demo.phpTravels.mobile.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.Predicate;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginPageBase.class)
public class MapsApp {

    @FindBy(xpath = "elementId= 'F0000000-0000-0000-B217-000000000000' AND visible = 'true'")
    private ExtendedWebElement buttonPreciseLocation;

    @FindBy(xpath = "elementId = '19010000-0000-0000-B217-000000000000'")
    private ExtendedWebElement buttonMapSetting;

    @FindBy(xpath = "name = 'Tracking'")
    private ExtendedWebElement buttonMapTracking;

    @FindBy(xpath = "elementId = 'AC050000-0000-0000-B217-000000000000'")
    private ExtendedWebElement buttonMapTraffic;

    @FindBy(xpath = "name = 'Mark My Location' AND type = 'XCUIElementTypeStaticText'")
    @Predicate
    private ExtendedWebElement buttonMapMarkLocation;
}
