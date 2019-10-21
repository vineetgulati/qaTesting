package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

   public  static WebDriver driver = null;

    public static ChromeDriver browser() {


        try {
            System.setProperty("webdriver.chrome.driver", "/Users/apple/Desktop/Vineet Gulati/Desktop/Main Selenium/Selenium/test/chromedriver");
            driver = new ChromeDriver();
          return (ChromeDriver) driver;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;




    }
}
