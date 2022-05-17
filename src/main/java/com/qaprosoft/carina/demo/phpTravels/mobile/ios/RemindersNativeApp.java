package com.qaprosoft.carina.demo.phpTravels.mobile.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.AccessibilityId;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.ClassChain;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;
import com.qaprosoft.carina.demo.phpTravels.mobile.common.RemindersNativeAppBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginPageBase.class)
public class RemindersNativeApp extends RemindersNativeAppBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`label == \"Today, 0 reminders, May 16\"`]")
    @ClassChain
    private ExtendedWebElement buttonTodayReminder;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name CONTAINS 'Add List'`]")
    private ExtendedWebElement buttonAddList;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`value == \"Reminders\"`]")
    private ExtendedWebElement buttonReminders;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"New Reminder\"`]")
    private ExtendedWebElement buttonMapTraffic;

    @ExtendedFindBy(accessibilityId = "Edit")
    private ExtendedWebElement buttonEdit;

    public RemindersNativeApp(WebDriver driver) {
        super(driver);
    }
}
