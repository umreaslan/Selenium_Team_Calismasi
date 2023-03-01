package ders06_Tekrar;

import org.checkerframework.checker.signature.qual.DotSeparatedIdentifiersOrPrimitiveType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBass;

public class T03_SwitchWindows  extends TestBass {

    @Test
    public  void  test01(){
// amazon anasayfaya gidip, arama kutusunun erisilebilir oldugunu test edin
        driver.get("https://www.amazon.com");

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(aramaKutusu.isDisplayed());

        String amazonHandleDegeri=driver.getWindowHandle();
// yeni bir tab olarak wisequarter.com'a gidin
        driver.switchTo().newWindow(WindowType.TAB);
        bekle(2);
        driver.get("https://www.wisequarter.com");
// url'in wisequarter icerdigini test edin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.wisequarter.com");
        // url'in wisequarter icerdigini test edin
        String expectedIcerik="wisequarter";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        String wiseWindowHandleDegeri= driver.getWindowHandle();


// amazon'un acik oldugu tab'a geri donup
        driver.switchTo().window(amazonHandleDegeri);
        //daha once acilmis olan windowa gecis yapmak icin handel degerini almis olamamiz lazim

// Nutella icin arama yapin
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
// Sonuclarin Nutella icerdigini test edin
        String actualSonucYazisi=driver
                .findElement(By.xpath("//h1[@class=‘a-size-base s-desktop-toolbar a-text-normal’]"))
                .getText();
         expectedIcerik="Nutella";
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));


// yeni bir window olarak youtube.com'a gidin
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");

// Url'in youtube icerdigini test edin
        expectedIcerik="youtube";
        actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedIcerik));

// wisequarter'in acik oldugu sayfaya donun
        driver.switchTo().window(wiseWindowHandleDegeri);

// Title'in WiseQuarter icerdigini test edin
        expectedIcerik="Wise Quarter";
         String actualTitle =driver.getTitle();
         Assert.assertTrue(actualTitle.contains(expectedIcerik));
         bekle(3);







    }
}
