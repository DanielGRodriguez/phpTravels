package com.qaprosoft.carina.demo.phpTravels.mobile.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.ClassChain;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.Predicate;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;
import com.qaprosoft.carina.demo.phpTravels.mobile.common.RemindersAppBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginPageBase.class)
public class Reminders extends RemindersAppBase {

    @FindBy(xpath = "**/XCUIElementTypeButton[`label == \"Today, 0 reminders, May 16\"`]")
    @ClassChain
    private ExtendedWebElement buttonTodayReminder;

    @FindBy(xpath = "**/XCUIElementTypeButton[`name CONTAINS 'Add List'`]")
    @ClassChain
    private ExtendedWebElement buttonAddList;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`value == \"Reminders\"`]")
    private ExtendedWebElement buttonReminders;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"New Reminder\"`]")
    private ExtendedWebElement buttonMapTraffic;

    @FindBy(id = "More")
    private ExtendedWebElement buttonEdit;

    public Reminders(WebDriver driver) {
        super(driver);
    }
}
