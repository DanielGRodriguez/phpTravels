package com.qaprosoft.carina.demo.phpTravels.mobile.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.WebViewPageBase;
import com.qaprosoft.carina.demo.phpTravels.mobile.common.SettingsAppBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WebViewPageBase.class)
public class Settings extends SettingsAppBase {

    @FindBy(xpath = "//*[@resource-id = 'android:id/title' and @text = 'Notifications']")
    private ExtendedWebElement buttonNotifications;

    @FindBy(xpath = "//*[@text = 'Battery and device care']")
    private ExtendedWebElement buttonBattery;

    public Settings(WebDriver driver) {
        super(driver);
    }
}
