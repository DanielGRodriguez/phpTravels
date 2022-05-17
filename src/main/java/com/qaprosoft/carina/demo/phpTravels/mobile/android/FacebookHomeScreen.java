package com.qaprosoft.carina.demo.phpTravels.mobile.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.WebViewPageBase;
import com.qaprosoft.carina.demo.phpTravels.mobile.common.FacebookHomeScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WebViewPageBase.class)
public class FacebookHomeScreen extends FacebookHomeScreenBase {
    @FindBy(id = "Go to profile")
    private ExtendedWebElement iconUserProfile;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Make a post on Facebook\"]")
    private ExtendedWebElement inputTextMakePost;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Group\"]")
    private ExtendedWebElement buttonGroup;

    @FindBy(id = "Post menu")
    private ExtendedWebElement buttonPostMenu;

    @FindBy(xpath = "//*[@text = 'Like']")
    private ExtendedWebElement buttonLikeReact;

    @FindBy(xpath = "//*[@text = 'Comment']")
    private ExtendedWebElement buttonComment;

    public FacebookHomeScreen(WebDriver driver) {
        super(driver);
    }
}
