package Test_Login;

import PageFactory.loginFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import extentreports.ExtentReport;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import stcHomeApp.Home;
import utils.Log;

import java.io.IOException;
import java.util.NoSuchElementException;

import static actions.MobileActions.Screenshot;
import static actions.MobileActions.isScreenShot;

public class Blank_Fields extends Home {
    public Blank_Fields(AndroidDriver driver) {
        super(driver);
    }

    static ExtentTest test;

    //TC0046

    @Test
    public void BothBlankFiledTest() throws InterruptedException, NoSuchElementException {
        test = ExtentReport.shared().getExtentTest("Verify Blank Fields");
        test.assignCategory("Login");


        EmailAddress();

        EnterPassword();

        LoginButton();

        if (isScreenShot()) {
            captureScreenShot();
        }

        WebElement result = (WebElement) driver.findElement(By.id("xunison.com.smarthomeapp:id/textinput_error"));
        Assert.assertEquals(result.getText(), "Enter email");

        Log.addLog("Error displayed");
        test.log(Status.INFO, "Error Displayed");


    }

    public void EmailAddress() {
        loginFactory L = new loginFactory(this.driver);
        if (L.EmailAddress != null) {
            L.EmailAddress.sendKeys("");
            Log.addLog("Email does not entered");
            test.log(Status.INFO, "Email does not entered");
        } else {
            Log.addLog("Email address field not found");
            test.log(Status.FAIL, "Email address field not found");
        }
    }

    public void EnterPassword() {
        loginFactory L = new loginFactory(this.driver);
        if (L.Password != null) {
            L.Password.sendKeys("");
            Log.addLog("Password does not entered");
            test.log(Status.INFO, "password does not entered");
        } else {
            Log.addLog("Password field not found");
            test.log(Status.FAIL, "Password field not found");
        }
    }

    public void LoginButton() {
        loginFactory L = new loginFactory(this.driver);
        if (L.LoginButton != null) {
            L.LoginButton.click();
            Log.addLog("Login button is clicked");
            test.log(Status.INFO, "Login button is clicked");
        } else {
            Log.addLog("Login button is not found");
            test.log(Status.FAIL, "Login button is not found");
        }
    }

    public static void captureScreenShot() {
        String screenShotPath = Screenshot("");
        try {
            test.addScreenCaptureFromPath(screenShotPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
