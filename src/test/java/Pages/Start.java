package Pages;

import Utils.CommonUtils;
import Utils.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class Start {

    WebDriver driver  ;
    //WebDriverWait wait = new WebDriverWait(driver, 20);

    @Test
    public void openbrowser(){
        try {
            this.driver = Driver.browser();
            CommonUtils.launhBrowser(driver, "https://www.toolsqa.com/automation-practice-switch-windows/");
            driver.manage().window().fullscreen();
            String parentWindowhandle = driver.getWindowHandle();

            System.out.println(parentWindowhandle);
            Thread.sleep(4000);
          //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(0,500)");
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            Thread.sleep(4000);




            WebElement test = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/div[1]/div[2]/div/div/div/div/p[3]/button"));

            test.click();



        } catch(Exception e){
            e.printStackTrace();
        }
            driver.quit();
        }
    }

