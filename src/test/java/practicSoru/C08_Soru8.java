package practicSoru;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBass;

public class C08_Soru8 extends TestBass {


    @Test
    public  void test01(){
          ////2- https://www.google.com/ adresine gidin
        driver.get(" https://www.google.com/");
        bekle(3);

        //        // 4- Sayfa basliginin “Google” ifadesi icerdigini test edin
        String expected="Google";
        String actual=driver.getTitle();
        Assert.assertTrue(actual.contains(expected));
        ;
        //        // 5- Arama cubuguna “Nutella” yazip aratin
        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@class='gLFyf']"));
        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();
        bekle(3);

        //

        //
        //        //6- Bulunan sonuc sayisini yazdirin
        System.out.println(driver.findElement(By.id("result-stats")).getText());

        //        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        WebElement sonucElementi=driver.findElement(By.id("result-stats"));

        String sonucYazisi=sonucElementi.getText();

        String [] Arr=sonucYazisi.split(" ");
        String sonucArr=Arr[1];
        sonucArr=sonucArr.replaceAll("\\D","");

        int Expected=10000000;
        int Actual=Integer.parseInt(sonucArr);

        if (Actual>Expected){
            System.out.println("TEST: PASSED");
        }else {
            System.out.println("TEST: FAILED");
        }


    }
}
