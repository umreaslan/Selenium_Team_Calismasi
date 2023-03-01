package practicSoru;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBass;

public class C07_Soru7 extends TestBass {


    @Test
    public void test01(){

          ////1. http://zero.webappsecurity.com sayfasina gidin
        driver.get(" http://zero.webappsecurity.com");
        //        //2. Signin buttonuna tiklayin
        driver.findElement(By.id("signin_button")).click();

        //        //3. Login alanine “username” yazdirin
        driver.findElement(By.id("user_login")).sendKeys("username");

        //        //4. Password alanine “password” yazdirin
        driver.findElement(By.id("user_password")).sendKeys("password");

        //        //5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        bekle(3);
        driver.navigate().back();
        bekle(3);

        //        //6. Pay Bills sayfasina gidin
        driver.findElement(By.id("online-banking")).click();
        bekle(3);
        driver.findElement(By.id("pay_bills_link")).click();
        bekle(3);



        //        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        driver.findElement(By.id("sp_amount")).sendKeys("500");

        //        //8. tarih kismina “2020-09-10” yazdirin
        driver.findElement(By.id("sp_date")).sendKeys("2020-09-10");
       ;
        //        //9. Pay buttonuna tiklayin
        driver.findElement(By.id("pay_saved_payees")).click();


        //        //10. “The payment was successfully submitted.” mesajinin ciktigini test edin
        String expected="The payment was successfully submitted.";
        String actual=driver.findElement(By.xpath("//span[text()='The payment was successfully submitted.']")).getText();

        Assert.assertTrue(actual.contains(expected));
        bekle(3);





    }
}
