package practicSoru;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBass;

public class C02_Soru2 extends TestBass {

    @Test
    public  void test01(){
        //1- https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com");

        //2- Arama kutusuna “city bike” yazip aratin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);

        //3- Görüntülenen sonuçların sayısını yazdırın
        System.out.println(driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]")).getText());
         bekle(2);
        //4- Listeden ilk urunun resmine tıklayın.
        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();


    }


    }

