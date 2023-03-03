package KonuTekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivermethodlari {


    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver.exe");//seklinde dosya yolunu tanitiyoruz

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();//ekrani tam ekran yapar ,hemde cozunurlugu ayarlar

        driver.get("");//siteye gider.
        driver.getCurrentUrl();//gittigimiz sayfanin url'sini yazdirir
        driver.getTitle();//gittigimiz sayfanin basligini yazdirir.

        String expectedIcerik="nutella";
        String actual=driver.getCurrentUrl();//expexted result ile actual result karsilastirmasi yapar


        driver.getWindowHandle();//unique handel degerini dondurur.
                                 //sayfayi her acip kapattigimizda farkli bir handel degeri gelir

        driver.getWindowHandles();//birden cok sayfa acilmissa ,bir  set olarak tum sayfalarin handel
                                   //degerini dondurur

        driver.getPageSource();

        //bir web sayfasında belirli bir metin veya öğe olup olmadığını doğrulamak için
        // getPageSource() metodunu kullanabilirsiniz.

        driver.close();//sadece  bir sayfayi kapatir

        driver.quit();//test sirasinda acilan tum sayfalari kapatir

        //**********************************Navigate methodlari************************************

        driver.navigate().back();//ciktigimiz  web sayfasina tekrar doner

        driver.navigate().forward();// tekrar anasayfaya doner

        driver.navigate().to("");//driver.get ile ayni islevi yapar

        driver.navigate().refresh();//sayfayi yeniler

        driver.manage().window().getSize();
        //b method, web sayfasının boyutunu değiştirmek,
        // sayfanın tam ekran moduna geçmek veya
        // sayfada bazı işlemler yapmak için kullanılabilir.

        driver.manage().window().getPosition();

        //Bu method, web sayfasının penceresinin konumunu değiştirmek,
        // sayfanın bir bölgesini ekranın farklı bir yerine taşımak
        // veya sayfada bazı işlemler yapmak için kullanılabilir.
        //print() fonksiyonu kullanılarak pencerenin konumu yazdırılır.

        driver.manage().window().fullscreen();

        //WebDriver kullanılarak bir web sayfasının tam ekran moduna geçmesini sağlar.
    }
}
