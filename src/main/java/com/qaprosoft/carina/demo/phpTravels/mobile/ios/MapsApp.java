package com.qaprosoft.carina.demo.phpTravels.mobile.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.Predicate;
import org.openqa.selenium.support.FindBy;

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
