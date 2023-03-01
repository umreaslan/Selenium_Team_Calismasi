package ders01;

import org.junit.Assert;
import org.junit.Test;

public class Soru1 extends testBass {

    @Test
    public void test01(){
       // 3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver. get("https://www.amazon.com");

       // 4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        //5. Sayfa basliginin "Amazon" icerdigini test edin
        String expectedBaslik = "Amazon";
        String actualBaslik = driver.getTitle();

        Assert. assertTrue(actualBaslik. contains(expectedBaslik));

      //  6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

       // 7. Sayfa url'inin "amazon" icerdigini test edin.

        String expectedUrl="amazon";
        String actualUrl=driver. getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));


      //  8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());

       // 9. Sayfa HTML kodlarinda "alisveris" kelimesi gectigini test edin

        String sayfaKodlariElementi =driver.getPageSource();//hepsine toplu  bakar
        String expectedKelime = "alisveris";

       if (sayfaKodlariElementi.contains(expectedKelime)){
           System.out.println("test passed");
       }else {
           System.out.println("test failed");

       }
        //Assert. assertTrue(sayfaKodlariElementi. contains(expectedKelime));

      //  10. Sayfayi kapatin.


    }
}

