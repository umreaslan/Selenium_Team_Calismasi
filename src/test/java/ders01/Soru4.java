package ders01;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class Soru4 extends testBass {
    @Test
    public void test01() {

       // 2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

       // 3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());

       // 4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
       // 5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        driver.manage().window().setPosition(new Point(30,100));
        driver.manage().window().setSize(new Dimension(500,500));

       // 8. Sayfayi kapatin
    }

}
