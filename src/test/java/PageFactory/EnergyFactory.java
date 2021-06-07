package PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class EnergyFactory {
    public EnergyFactory(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//*[@text='Today']")
    public WebElement Today;

    @AndroidFindBy(xpath = "//*[@text='7 Days']")
    public WebElement Week;

    @AndroidFindBy(xpath = "//*[@text='14 Days']")
    public WebElement Fourteen;

    @AndroidFindBy(xpath = "//*[@text='30 Days']")
    public WebElement Month;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/value_chart")
    public WebElement ValueChart;

    @AndroidFindBy(xpath = "//*[@text='Yesterday']")
    public WebElement Yesterday;

    @AndroidFindBy(xpath = "//*[@text='Last 7 days']")
    public WebElement SevenDay;

    @AndroidFindBy(xpath = "//*[@text='Last 30 days']")
    public WebElement ThirtyDay;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/average_text_view")
    public WebElement Average;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/maximum_text_view")
    public WebElement Maximum;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/rooms")
    public WebElement Rooms;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/power_line_chart")
    public WebElement PowerChart;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/room_title_text_view")
    public WebElement RoomName;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/devices_size_text_view")
    public WebElement DeviceCount;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/power_value_text_view")
    public WebElement GeneratedWatt;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/energy")
    public WebElement Energy;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/container_energy_usage")
    public WebElement EnergyUsage;
}
