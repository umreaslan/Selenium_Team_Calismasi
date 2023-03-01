package ders01;

import org.junit.Assert;
import org.junit.Test;

public class Soru5 extends testBass{

    @Test
    public void test01(){

       // 2. facebook sayfasina gidin ve sayfa basliginin
        driver.get("hhtps://www.facebook.com");


        // sayfa basliginin (title) "facebook" oldugunu dogrulayin (doğrula),
          //      degilse doğrusu baslığı yazdırin.
        String expectedTitle = "facebook";
        String actualTitle = driver.getTitle();
        if (expectedTitle. equals(actualTitle)){
            System.out.println("facebook title testi gecti");
        }else {
            System.out.println("facebook title testi gecemedi" +"\nGerceklesen title:" +actualTitle);
        }
       // 3.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa
       // "actual" URL'i yazdirin.
        String expectedUrl ="facebook";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl. contains(expectedUrl)) {
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }

       // 4.https://www.walmart.com/ sayfasina gidin.
        driver. get("https://www.walmart.com/");

       // 5. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        String dizeWalmmartTitle= "Walmart.com";
        String actualWalmartTitle = driver.getTitle();
        Assert.assertTrue(actualWalmartTitle.contains(dizeWalmmartTitle));

       // 6. Tekrar "facebook" sayfasina donun
        driver.navigate().back();

      //  7. Sayfayi yenileyin
        driver.navigate().refresh();

       // 8. Sayfayi tam sayfa (maximize) yapin
       driver.manage().window().maximize();

      //  9.Browser'ı kapatin

    }


}
