package PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RoomsFactory {
    public RoomsFactory(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/home")
    public WebElement RoomPage;

    @AndroidFindBy(xpath = "//*[@text='Add New Room']")
    public WebElement AddRoom;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/create_room_button")
    public WebElement CreateRoom;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/room_icon")
    public WebElement RoomIcon;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/room_name_edit_text")
    public WebElement EditRoomName;

    @AndroidFindBy(xpath = "//*[@text='Living Room']")
    public WebElement LivingRoom;

    @AndroidFindBy(xpath = "//*[@text='Kitchen']")
    public WebElement Kitchen;

    @AndroidFindBy(xpath = "//*[@text='Bathroom']")
    public WebElement Bathroom;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/create_room_button")
    public WebElement CreateNewRoom;

    @AndroidFindBy(xpath = "//*[@content-desc='edit icon']")
    public WebElement MoreButton;

    @AndroidFindBy(xpath = "//*[@text='Edit room']")
    public WebElement EditRoom;

    @AndroidFindBy(xpath = "//*[@text='Delete Room']")
    public WebElement DeleteRoom;

    @AndroidFindBy(xpath = "//*[@text='Assign Device']")
    public WebElement AssignDevice;

    @AndroidFindBy(xpath = "//*[@text='Edit Device']")
    public WebElement EditDevice;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/current_room_container")
    public WebElement CurrentRoom;

    @AndroidFindBy(xpath = "//*[@text='Add New Room']")
    public WebElement NewRoom;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/save_changes_button")
    public WebElement SaveChangeDevice;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/confirm_button")
    public WebElement ConfirmDelete;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/decline_button")
    public WebElement DeclineDelete;

    @AndroidFindBy(id = "xunison.com.smarthomeapp:id/arrow_down_image_view")
    public WebElement Arrow;
}
