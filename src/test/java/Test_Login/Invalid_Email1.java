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

public class Invalid_Email1 extends Home {
    public Invalid_Email1(AndroidDriver driver) {
        super(driver);
    }

    static ExtentTest test;

    //TC0051

    @Test
    public void InvalidEmailTest() throws InterruptedException, NoSuchElementException {
        test = ExtentReport.shared().getExtentTest("Verify Invalid Email, case 2");
        test.assignCategory("Login");


        EmailAddress();

        LoginButton();

        if (isScreenShot()) {
            captureScreenShot();
        }

        WebElement result = (WebElement) driver.findElement(By.id("xunison.com.smarthomeapp:id/textinput_error"));
        Assert.assertEquals(result.getText(), "Invalid email");

        Log.addLog("Error displayed");
        test.log(Status.INFO, "Error Displayed");


    }


    public void EmailAddress() {
        loginFactory L = new loginFactory(this.driver);
        if (L.EmailAddress != null) {
            L.EmailAddress.sendKeys("abc");
            Log.addLog("InValid email address has been entered");
            test.log(Status.INFO, "InValid email address has been entered");
        } else {
            Log.addLog("Email address field not visible");
            test.log(Status.FAIL, "Email address field not visible");
        }
    }

    public void LoginButton() {
        loginFactory L = new loginFactory(this.driver);
        if (L.LoginButton != null) {
            L.LoginButton.click();
            Log.addLog("Login button is clicked");
            test.log(Status.INFO, "Login button is clicked");
        } else {
            Log.addLog("Login button is not visible");
            test.log(Status.FAIL, "Login button is not visible");
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
