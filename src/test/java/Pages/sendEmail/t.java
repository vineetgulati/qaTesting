package Pages.sendEmail;


import org.testng.Assert;

public class t {

  static int a = 19;
    static int b = 20;

    public static void main(String args[]){
        try {

            Assert.assertEquals(a, b);
            System.out.println("Test");
        } catch(AssertionError e){
            e.printStackTrace();
        }
        catch(Exception ee){}
    }


}
