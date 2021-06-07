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

public class Browser_Back extends Home {
    public Browser_Back(AndroidDriver driver) {
        super(driver);
    }

    static ExtentTest test;

    //TC0055

    @Test
    public void BrowserBackTest() throws InterruptedException, NoSuchElementException {
        test = ExtentReport.shared().getExtentTest("Verify browser back button");
        test.assignCategory("Login");


        driver.navigate().back();
        Log.addLog("Mobile back button has been clicked");
        test.log(Status.INFO, "Mobile back button has been clicked");

        if (isScreenShot()) {
            captureScreenShot();
        }

        driver.launchApp();
        Log.addLog("App has been relaunched");
        test.log(Status.INFO, "App has been relaunched");

        HomePage();

        if (isScreenShot()) {
            captureScreenShot();
        }


    }

    public void HomePage() {
        loginFactory L = new loginFactory(this.driver);
        if (L.HomePage != null) {
            L.HomePage.isDisplayed();
            Log.addLog("Home page is visible");
            test.log(Status.INFO, "Home page is visible");
        } else {
            Log.addLog("Home page is not found");
            test.log(Status.FAIL, "Home page is not found");
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
