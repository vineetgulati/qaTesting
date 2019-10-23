package Pages.sendEmail;

import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class sendNow {

    @Test
    public  void f() throws EmailException {
        System.out.println("Start test");
 int a = 10;
 int b = 10;
        Assert.assertEquals(a,b);
        System.out.println("a = b");
    }

        @AfterClass
        public  void d() throws EmailException {
        com.sendEmail();
        }
    }

