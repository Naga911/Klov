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

public class Blank_Email extends Home {
    public Blank_Email(AndroidDriver driver) {
        super(driver);
    }

    static ExtentTest test;

    //TC0047

    @Test
    public void BlankEmailTest() throws InterruptedException, NoSuchElementException {
        test = ExtentReport.shared().getExtentTest("Verify Blank Email Login");
        test.assignCategory("Login");


        EnterPassword();

        ShowPasswordButton();

        LoginButton();

        if (isScreenShot()) {
            captureScreenShot();
        }

        WebElement result = (WebElement) driver.findElement(By.id("xunison.com.smarthomeapp:id/textinput_error"));
        Assert.assertEquals(result.getText(), "Enter email");

        Log.addLog("Error displayed");
        test.log(Status.INFO, "Error Displayed");


    }


    public void EnterPassword() {
        loginFactory L = new loginFactory(this.driver);
        if (L.Password != null) {
            L.Password.sendKeys("demo1234");
            Log.addLog("Valid password has been entered");
            test.log(Status.INFO, "Valid password has been entered");
        } else {
            Log.addLog("Password field not found");
            test.log(Status.FAIL, "Password field not found");
        }
    }

    public void ShowPasswordButton() {
        loginFactory L = new loginFactory(this.driver);
        if (L.ShowPassword != null) {
            L.ShowPassword.click();
            Log.addLog("Password is readable");
            test.log(Status.INFO, "Password is readable");
        } else {
            Log.addLog("Show password button is not found");
            test.log(Status.FAIL, "Show password button is not found");
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


