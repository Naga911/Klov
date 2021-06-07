package Test_Login;

import PageFactory.loginFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import extentreports.ExtentReport;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import stcHomeApp.Home;
import utils.Log;

import java.io.IOException;
import java.util.NoSuchElementException;

import static actions.MobileActions.Screenshot;
import static actions.MobileActions.isScreenShot;

public class Valid_Login extends Home {

    public Valid_Login(AndroidDriver driver) {
        super(driver);
    }

    static ExtentTest test;

    //TC0054

    @Test
    public void AppLoginValid() throws InterruptedException, NoSuchElementException {
        test = ExtentReport.shared().getExtentTest("Valid Login, case 8");
        test.assignCategory("Login");


        if (isScreenShot()) {
            captureScreenShot();
        }

        EnterPassword();

        if (isScreenShot()) {
            captureScreenShot();
        }

        HomePageLogin();


    }

    public void HomePageLogin() {
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

    public void EnterPassword() {
        loginFactory L = new loginFactory(this.driver);
        if (L.Password != null) {
            L.Password.sendKeys("demo1234");
            Log.addLog("Valid password address has been entered");
            test.log(Status.INFO, "Valid password address has been entered");
        } else {
            Log.addLog("Password field not visible");
            test.log(Status.FAIL, "Password field not visible");
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
