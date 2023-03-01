package ders06_Tekrar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBass;

public class T01_BasicAuthentication extends TestBass {

    @Test
    public  void  test01(){

        //2- https://the-internet.herokuapp.com/basic_auth sayfasina gidin
        //3- asagidaki yontem ve test datalarini kullanarak authentication’i yapin
        //
        //  Html komutu : https://username:password@URL
        //  Username     : admin
        //  password      : admin
        //
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        String actualGirisyazisi=driver.findElement(By.tagName("p")).getText();
        String expectedIcerik="Congratulations";
        Assert.assertTrue(actualGirisyazisi.contains(expectedIcerik));
        bekle(3);


    }
}

