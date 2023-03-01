package ders01;

import org.junit.Test;

public class Soru3 extends testBass {

    @Test
    public void test01() {

       // 2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver. get("https://www.amazon.com");

       // 3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

       // 4. Sayfayi simge durumuna getirin
      driver.manage().window().maximize();

      //  5. simge durumunda 3 saniye bekleyip sayfayi maksimize yapin

          driver.manage().window().getPosition();



      //  6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println(driver.manage().window().getPosition());

       // 7. Sayfayi tam ekran yapın
        driver.manage().window().maximize();

      //  8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println(driver.manage().window().getPosition());

      //  9. Sayfayi kapatin


    }

}
