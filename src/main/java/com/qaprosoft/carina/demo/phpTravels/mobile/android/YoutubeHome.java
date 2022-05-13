package com.qaprosoft.carina.demo.phpTravels.mobile.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.WebViewPageBase;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WebViewPageBase.class)
public class YoutubeHome {

    @FindBy(id = "Search")
    private ExtendedWebElement buttonSearch;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Account\"]")
    private ExtendedWebElement buttonIconAccount;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Harry Styles - Sign of the Times (Official Video) " +
            "- 5 minutes, 42 seconds - Go to channel - HarryStylesVEVO - " +
            "972M views - 5 years ago - play video\"]/android.view.ViewGroup/android.view.ViewGroup[1]")
    private ExtendedWebElement buttonTitleVideo;

}
