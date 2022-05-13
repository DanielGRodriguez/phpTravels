package com.qaprosoft.carina.demo.phpTravels.mobile.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.WebViewPageBase;
import com.qaprosoft.carina.demo.phpTravels.mobile.common.SettingsAppBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WebViewPageBase.class)
public class SettingsAndroid extends SettingsAppBase {

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view." +
            "ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget." +
            "RecyclerView/android.widget.LinearLayout[4]/android.widget.RelativeLayout")
    private ExtendedWebElement buttonNotifications;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/" +
            "android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget." +
            "LinearLayout[5]/android.widget.RelativeLayout")
    private ExtendedWebElement buttonBattery;

    public SettingsAndroid(WebDriver driver) {
        super(driver);
    }
}
