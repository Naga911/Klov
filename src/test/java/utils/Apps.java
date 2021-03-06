package utils;

public enum Apps {

    ApiDemo("", "", "src/app/ApiDemos-debug.apk"),
    stc("xunison.com.smarthomeapp", "xunison.com.smarthomeapp.screen.smarthome.MainActivity", "src/app/Xunison.apk"),
    stcDebug("xunison.com.smarthomeapp", "xunison.com.smarthomeapp.screen.main.activity.MainActivity", "src/app/app-stc-debug.apk");


    private String appPackage;
    private String appPath;
    private String appActivity;

    public String getAppPackage() {
        return appPackage;
    }
    public String getAppPath() {

        return appPath;
    }
    public String getAppActivity() {

        return appActivity;
    }

    public void setAppPackage(String appPackage) {
        this.appPackage = appPackage;
    }
    public void setAppPath(String appPath) {
        this.appPath = appPath;
    }
    public void setAppActivity(String appActivity) {
        this.appActivity = appActivity;
    }

    Apps(String appPackage, String appActivity, String appPath) {
        this.appPackage = appPackage;
        this.appActivity = appActivity;
        this.appPath = appPath;
    }
}
