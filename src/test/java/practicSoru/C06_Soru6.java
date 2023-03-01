package practicSoru;

import org.checkerframework.framework.qual.DefaultQualifier;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBass;

import java.util.List;

public class C06_Soru6 extends TestBass {


    @Test
    public  void test01(){

        // //1- https://www.amazon.com/ sayfasina gidelim
       driver.get("https://www.amazon.com/ ");
       bekle(3);
        //        // 2- arama kutusunu locate edelim
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        bekle(3);


        //        //3- “Samsung headphones” ile arama yapalim
        aramaKutusu.sendKeys("Samsung headphones " + Keys.ENTER);
        bekle(3);


        //        // 4- Bulunan sonuc sayisini yazdiralim
        System.out.println(driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")));
        //        //5- Ilk urunu tiklayalim
        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
        driver.navigate().back();


        //        //6- Sayfadaki tum basliklari yazdiralim

        List<WebElement> kulaklık = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));


        int sayac=1;
        for (WebElement each: kulaklık
             ) {
            System.out.println(sayac+"-"+each.getText());
            sayac++;

        }



    }
}
