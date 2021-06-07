package PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SceneFactory {
    public SceneFactory(AppiumDriver driver) { PageFactory.initElements(new AppiumFieldDecorator(driver), this); }

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/scenes")
    public WebElement Scene;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/scene_name_text_view")
    public WebElement Active;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/add_new_scene")
    public WebElement NewScene;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/scene_image")
    public WebElement SceneImage;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/scene_name_edit_text")
    public WebElement EnterSceneName;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/button_add_more_actions")
    public WebElement MoreDevice;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/save_scene_button")
    public WebElement SaveScene;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/button_add_actions_to_automators")
    public WebElement AddDeviceScene;

    @AndroidFindBy(xpath = "//*[@text='Good Morning Scene']")
    public WebElement Morning;

    @AndroidFindBy(xpath = "//*[@text='Good Night Scene']")
    public WebElement Night;

    @AndroidFindBy(xpath = "//*[@text='Away Scene']")
    public WebElement Away;

    @AndroidFindBy(xpath = "//*[@text='Romantic Scene']")
    public WebElement Romantic;

    @AndroidFindBy(xpath = "//*[@text='Disarm Scene']")
    public WebElement Disarm;

    @AndroidFindBy(xpath = "//*[@text='Custom Scene']")
    public WebElement Custom;

    @AndroidFindBy(xpath = "//*[@text='Wait 30 sec']")
    public WebElement Delay;

    @AndroidFindBy(xpath = "//*[@text='Edit scene']")
    public WebElement EditScene;

    @AndroidFindBy(xpath = "//*[@text='Delete scene']")
    public WebElement DeleteScene;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/scene_name_edit_text")
    public WebElement EditName;


}
