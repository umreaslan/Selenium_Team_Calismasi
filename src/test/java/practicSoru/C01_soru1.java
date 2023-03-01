package practicSoru;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBass;

import java.util.List;

public class C01_soru1 extends TestBass {


    @Test
    public  void test01(){

        // 2- https://www.automationexercise.com/ adresine gidin

        driver.get("https://www.automationexercise.com/");
        // 3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> link = driver.findElements(By.tagName("a"));
        int expected= 147;
        int actual = link.size();
        Assert.assertTrue(expected==actual);
        // 4- Products linkine tiklayin
        driver.findElement(By.xpath("//*[text()=' Products']")).click();
        bekle(3);
        // 5- special offer yazisinin gorundugunu test edin
        WebElement resim = driver.findElement(By.id("sale_image"));
        Assert.assertTrue(resim.isDisplayed());
        bekle(2);

        // 6- Sayfayi kapatin
    }



}



