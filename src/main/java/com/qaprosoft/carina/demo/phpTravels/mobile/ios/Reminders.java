package com.qaprosoft.carina.demo.phpTravels.mobile.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.Predicate;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginPageBase.class)
public class Reminders {

    @FindBy(xpath = "elementId = '43010000-0000-0000-6918-000000000000'")
    private ExtendedWebElement buttonTodayReminder;

    @FindBy(xpath = "label = 'Add List' AND enabled = 'true'")
    private ExtendedWebElement buttonAddList;

    @FindBy(xpath = "elementId = '46010000-0000-0000-6918-000000000000'")
    private ExtendedWebElement buttonReminders;

    @FindBy(xpath = "value = 'New Reminder'")
    private ExtendedWebElement buttonMapTraffic;

    @FindBy(xpath = "name = 'More' AND type = 'XCUIElementTypeButton'")
    @Predicate
    private ExtendedWebElement buttonDropdownMore;
}
