package PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SettingFactory {

    public SettingFactory(AppiumDriver driver) { PageFactory.initElements(new AppiumFieldDecorator(driver), this); }

    @AndroidFindBy(xpath = "//*[@text='Factory Reset Router']")
    public WebElement ResetRouter;

    @AndroidFindBy(xpath = "//*[@text='CANCEL']")
    public WebElement Decline;

    @AndroidFindBy(xpath = "//*[@text='Setup Wizard']")
    public WebElement StartWizard;

    @AndroidFindBy(xpath = "//*[@text='Africa/Accra']")
    public WebElement TimeZone;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/forward_container")
    public WebElement Forward;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/admin_password_input_layout")
    public WebElement AdminPassword;

    @AndroidFindBy(xpath = "//*[@text='Router']")
    public WebElement Router;

    @AndroidFindBy(xpath = "//*[@text='Finish Setup']")
    public WebElement Finish;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/search_src_text")
    public WebElement Search;

    @AndroidFindBy(xpath = "//*[@text='EXIT']")
    public WebElement Exit;

    @AndroidFindBy(xpath = "//*[@text='Factory Reset Smart Home']")
    public WebElement ResetHome;

    @AndroidFindBy(xpath = "//*[@text='Change Password']")
    public WebElement Password;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/old_password_edit_text")
    public WebElement OldPassword;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/new_password_edit_text")
    public WebElement NewPassword;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/confirm_new_password_edit_text")
    public WebElement ConfirmPassword;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/button_change_password")
    public WebElement ChangePassword;

    @AndroidFindBy(xpath = "//*[@text='Security Alarms']")
    public WebElement SecurityAlarms;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/device_checkbox")
    public WebElement CheckBox;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/button_save_changes")
    public WebElement SaveChange;

    @AndroidFindBy(xpath = "//*[@text='Energy Settings']")
    public WebElement EnergySettings;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/concurrency_container")
    public WebElement Currency;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/image_view_edit_kw_rate")
    public WebElement CostEdit;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/save_changes_button")
    public WebElement SaveChangeEnergy;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/cost_container")
    public WebElement AddCost;

}
