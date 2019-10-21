package Pages;

import Utils.CommonUtils;
import Utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver driver  ;

    @Test
    public void openbrowser(){
        this.driver = Driver.browser();
        CommonUtils.launhBrowser(driver , "https://teamie-next.teamieapp.com/dash/#/classroom/118629/sections");
    }
}
