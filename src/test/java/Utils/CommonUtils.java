package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CommonUtils {



    public static boolean takeScreenshot(WebDriver driver , String name ) {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File destination = new File ("/Screenshots"+name+".png");
        try {
            //Copy file at destination

            FileUtils.copyFile(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } return true;
    }

    public static boolean launhBrowser(WebDriver driver , String url ) {
        try {
            driver.navigate().to(url);

            driver.manage().window().maximize();

        }catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void waits(WebDriver driver , long time) {
        try {
            driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

