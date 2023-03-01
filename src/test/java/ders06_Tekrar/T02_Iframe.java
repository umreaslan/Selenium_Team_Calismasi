package ders06_Tekrar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBass;

public class T02_Iframe extends TestBass {

    @Test
    public  void test01(){
// https://the-internet.herokuapp.com/iframe  adresine gidin
        driver.get("https://the-internet.herokuapp.com/iframe");

        //bazen locate islemimizden emein olamamiza ragmn calismayabilir
        //bunun sebebbi iframe  child i olmasi olabilir
        //1- gecis yapmak frame i locate edin
        //2-switcto ile o frame igecis yapin
        //3-sonra istediginiz element ile istediginiz islemi yapin

        WebElement  frameelementi=driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(frameelementi);

      //  WebElement  yaziElementi=driver.findElement(By.tagName("p"));
       // Assert.assertTrue(yaziElementi.isDisplayed());
        driver.switchTo().parentFrame();//icicie frame lerde bir ust seviyeye cikar
       driver.switchTo().defaultContent();

        driver.findElement(By.linkText("Elemental Selenium")).click();//calismaz
        //1 -fir frame gecis yaptiktan sonra
        //oradan cikincaya veya baska bir frame  gecinceye kadar
        //driver o frame icerisinde kalir
        ;//bu ise direk anasayfaya gecer

        bekle(3);


    }
}
