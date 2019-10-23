package Pages.sendEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class com {

    public static void sendEmail() throws EmailException {

        Email email = new SimpleEmail();
        System.out.println("Start test1");
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("vineetgulati1989@gmail.com", "vinny99999"));
        email.setSSLOnConnect(true);
        System.out.println("Start test2");
        email.setFrom("vineet@gmail.com");
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        System.out.println("Start test3");
        email.addTo("vineetgulati1989@gmail.com");
        email.send();
    }
}
