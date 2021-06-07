package PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CyberFactory {
    public CyberFactory(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/cyber_security_container")
    public WebElement CyberSecurity;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/stats_view")
    public WebElement StatView;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/total_threats_blocked_count_tv")
    public WebElement BlockedThreat;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/threats_round_circle")
    public WebElement DeviceThreat;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/title")
    public WebElement ThreatTitle;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/device_title")
    public WebElement AllDevice;

    @AndroidFindBy(xpath = "//*[@text='Request report']")
    public WebElement Report;

    @AndroidFindBy(xpath = "//*[@text='Wrong detection']")
    public WebElement Detection;

    @AndroidFindBy(xpath = "//*[@text='OK']")
    public WebElement Ok;

}
