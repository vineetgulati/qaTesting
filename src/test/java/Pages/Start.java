package Pages;

import Utils.CommonUtils;
import Utils.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import java.util.List;
import java.util.concurrent.TimeUnit;

public class Start {

    WebDriver driver  ;
    //WebDriverWait wait = new WebDriverWait(driver, 20);

    @Test
    public void openbrowser() throws InterruptedException {
        try {
            this.driver = Driver.browser();
            CommonUtils.launhBrowser(driver, "https://www.toolsqa.com/automation-practice-switch-windows/");
            driver.manage().window().fullscreen();
            String parentWindowhandle = driver.getWindowHandle();
            String title = driver.getTitle();


          //  SoftAssert te = new SoftAssert() ;
            //te.assertEquals("test23",title);
         //   Assert.assertEquals(title, "test1234", "not matched");
           // System.out.println("xx");


            System.out.println(parentWindowhandle);
            Thread.sleep(4000);
            //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,500)");
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            Thread.sleep(4000);



           // Select se = new Select(driver.findElement(By.id("12")));


            WebElement test = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/div[1]/div[2]/div/div/div/div/p[3]/button"));

            test.click();
            Thread.sleep(4000);
            driver.switchTo().window(parentWindowhandle);
            Actions te = new Actions(driver);
            te.moveToElement(test).click().keyUp("Tab").sendKeys("test").contextClick();
           // driver.switchTo().defaultContent();
            Thread.sleep(4000);
          //  te.assertAll();


        } catch (AssertionError e) {
            e.printStackTrace();
        }

    }
    }

