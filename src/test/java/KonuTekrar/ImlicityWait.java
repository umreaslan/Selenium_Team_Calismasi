package KonuTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImlicityWait {


    public static void main(String[] args) {


        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //butun zaman isteyen islemler icin  driver 'in max. nekadar bekleyecegini   belirler

        //bir yazinin orn "Nutella" icerdigini digrulama

        String expectedIcerik="Nutella";
        String actualurl=driver.getCurrentUrl();//seklinde test edilir

        //*************************LOCATER*********************
        //DRIVER'E WEBELEMENTI TARIF ETME ISLEMI
        //8 TANE LOCATER VARDIR

        //web elementin ozelliklerine baglidir
        /*
        1-ID
        2-classname
        3-tagname
        4-link text
        5-partiaalinkaaaaatext
         */
      // herturlu web elementilocate etmek icin kullanilir

        //1-xpath
        //2-cssSelwctor






    }
}
