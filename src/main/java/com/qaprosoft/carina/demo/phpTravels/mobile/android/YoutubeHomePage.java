package com.qaprosoft.carina.demo.phpTravels.mobile.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.WebViewPageBase;
import com.qaprosoft.carina.demo.phpTravels.mobile.common.YoutubePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WebViewPageBase.class)
public class YoutubeHomePage extends YoutubePageBase {

    @FindBy(id = "Search")
    private ExtendedWebElement buttonSearch;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Account\"]")
    private ExtendedWebElement buttonIconAccount;

    @FindBy(xpath = "//*[@resource-id = 'com.google.android.youtube:id/title']")
    private ExtendedWebElement buttonTitleVideo;

    public YoutubeHomePage(WebDriver driver) {
        super(driver);
    }
}
