package Pages;

import Utils.CommonUtils;
import Utils.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class DataProviders {

    WebDriver driver  ;

   /* @DataProvider ( name = "Authentication")
    public Object[][] dataProvider() {
        return new Object[][]
                {
                        {"samad1", "pass123"},{"samad2", "pass123"}};

    }
*/
    //@Test(dataProvider = "Authentication")
    @Test
    public void login() throws InterruptedException {
        try {

            this.driver = Driver.browser();
            CommonUtils.launhBrowser(driver, "https://www.snapdeal.com/");

            driver.manage().window().fullscreen();
            Thread.sleep(3000);
            Actions te = new Actions(driver);
            List<WebElement> list = driver.findElements(By.tagName("iframe"));
            for (int x=0;x<list.size();x++){
                System.out.println(list.get(x).getText());
            }


            WebElement tt = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[3]/div[3]/div/span[2]"));
            String ttt = tt.getAttribute("name");
            System.out.println(ttt);
            te.moveToElement(tt);

            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[text()='Login']")).click();
            Thread.sleep(5000);
            // driver.quit();
            driver.findElement(By.id("edit-name")).clear();
            driver.findElement(By.id("edit-name")).click();
           // driver.findElement(By.id("edit-name")).sendKeys(username);
            driver.findElement(By.id("edit-pass")).clear();
            driver.findElement(By.id("edit-pass")).click();
            //driver.findElement(By.id("edit-pass")).sendKeys(password);
            driver.findElement(By.id("edit-submit")).click();
            Thread.sleep(3000);
            driver.quit();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            driver.quit();
        }

    }
}
