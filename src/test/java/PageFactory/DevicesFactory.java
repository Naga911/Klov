package PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DevicesFactory {
    public DevicesFactory(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/devices")
    public WebElement DevicesPage;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/device_name_edit_text")
    public WebElement EditDeviceName;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/sensor_notification_type")
    public WebElement SensorNotification;

    @AndroidFindBy(xpath = "//*[@content-desc='Show password']")
    public WebElement ShowPassword;

    @AndroidFindBy(xpath = "//*[@text='In Armed state only']")
    public WebElement ArmedState;

    @AndroidFindBy(xpath = "//*[@text='Never']")
    public WebElement Never;

    @AndroidFindBy(xpath = "//*[@text='Edit Configuration']")
    public WebElement Configuration;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/image_view_manual_configuration")
    public WebElement ManualConfiguration;

    @AndroidFindBy(xpath = "//*[@text='Add custom configuration']")
    public WebElement AddCustomConfiguration;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/edit_text_number")
    public WebElement TextNumber;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/edit_text_value")
    public WebElement TextValue;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/radio_button_one_bit")
    public WebElement Onebit;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/radio_button_two_bits")
    public WebElement Twobit;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/radio_button_four_bits")
    public WebElement Fourbit;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/button_apply")
    public WebElement ApplyButton;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/image_view_apply")
    public WebElement ImageApply;

    @AndroidFindBy(xpath = "//*[@text='Readings History']")
    public WebElement ReadingHistory;

    @AndroidFindBy(xpath = "//*[@text='Yesterday']")
    public WebElement Yesterday;

    @AndroidFindBy(xpath = "//*[@text='Last 7 days']")
    public WebElement Week;

    @AndroidFindBy(xpath = "//*[@text='Last 30 days']")
    public WebElement Month;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/empty_state_text_view")
    public WebElement EmptyView;

}
