package PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ParentalFactory {
    public ParentalFactory(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/vInternetAccessText")
    public WebElement InternetAccess;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/add_block_website_cdv")
    public WebElement BlockWebsite;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/block_web_url_edt")
    public WebElement AddWebsite;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/add_block_web_url_container")
    public WebElement AddBlockWeb;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/open_chrome")
    public WebElement ChromeButton;

    @AndroidFindBy(id = "com.android.chrome:id/home_button")
    public WebElement ChromeHome;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/item_block_web_remove")
    public WebElement RemoveBlockWeb;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/open_block_category_list_container")
    public WebElement BlockListCat;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/add_block_category_btn")
    public WebElement AddCategory;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/block_category_container")
    public WebElement AddBlockCat;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/item_block_category_remove")
    public WebElement RemoveBlockCat;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/supervisions")
    public WebElement Supervision;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/toolbarTitle")
    public WebElement VisionTitle;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/count_tv")
    public WebElement WebCategory;

    @AndroidFindBy(xpath = "//*[@text='Block Site']")
    public WebElement BlockSite;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/devices")
    public WebElement Devices;

    @AndroidFindBy(xpath = "//*[@text='Today']")
    public WebElement Today;

    @AndroidFindBy(xpath = "//*[@text='7 Days']")
    public WebElement Week;

    @AndroidFindBy(xpath = "//*[@text='14 Days']")
    public WebElement FourteenDays;

    @AndroidFindBy(xpath = "//*[@text='30 Days']")
    public WebElement ThirtyDays;

    @AndroidFindBy(xpath = "//*[@text='Social Supervision']")
    public WebElement SocialSupervision;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/social_pie_chart")
    public WebElement Chart;

    @AndroidFindBy(xpath = "//*[@text='Block Category']")
    public WebElement BlockCategory;

    @AndroidFindBy(xpath = "//*[@text='Time Supervision']")
    public WebElement TimeSupervision;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/time_bar_chart")
    public WebElement TimeChart;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/item_sv_time_history_title_tv")
    public WebElement history;

    @AndroidFindBy(xpath = "//*[@text='Limit Internet']")
    public WebElement LimitInternet;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/set")
    public WebElement Set;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/vTuesday")
    public WebElement Tuesday;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/vMonday")
    public WebElement Monday;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/vWednesday")
    public WebElement Wednesday;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/vThursday")
    public WebElement Thursday;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/vFriday")
    public WebElement Friday;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/vSaturday")
    public WebElement Saturday;

    @AndroidFindBy(xpath = "//*[@text='Save']")
    public WebElement SaveButton;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/internet_access_limit_tv")
    public WebElement Limit;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/item_limit_delete_btn")
    public WebElement Delete;
}
