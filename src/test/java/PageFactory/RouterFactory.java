package PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RouterFactory {
    public RouterFactory(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//*[@text='Details']")
    public WebElement Details;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/graph_view")
    public WebElement GraphView;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/router_lan_ip_text_view")
    public WebElement LanIP;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/lan_ip_text")
    public WebElement lanIPName;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/router_wan_ip_text_view")
    public WebElement WanIP;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/router_wan_ip_text_view")
    public WebElement wanIPName;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/router_mac_text_view")
    public WebElement MacAddress;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/mac_text")
    public WebElement macName;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/router_firmware_version_text_view")
    public WebElement Firmware;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/firmware_version_text")
    public WebElement firmwareVersion;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/router_ssid_text_view")
    public WebElement SSID;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/ssid_text")
    public WebElement ssidName;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/download_round_view")
    public WebElement Download;

}
