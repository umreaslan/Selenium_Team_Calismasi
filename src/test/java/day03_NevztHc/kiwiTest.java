package day03_NevztHc;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class kiwiTest {
     WebDriver driver;
// https://www.kiwi.com sayfasina gidin
// Cookies i reddedin
// Sag ust kisimdan dil ve para birimi secenegini Turkiye ve TL olarak secin
// Sectiginiz dil ve para birimini dogrulayin
// Ucus secenegi olarak tek yon secelim
// Kalkis ve varis boxlarini temizleyerek kalkis ve varis ulkesini kendimiz belirleyelim
// Gidis tarihi kismina erisim saglayarak gidecegimiz gunu secelim ve booking i iptal edelim
// Sadece aktarmasiz ucuslar olarak filtreleme yapalim ve en ucuz secenegine tiklayalim
// Filtreleme yaptigimiz en ucuz ucusun fiyatini getirerek 5000 tl den kucuk oldgunu dogurlayalim



    @Before
    public  void  setup(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Select select=new Select(driver.findElement(By.xpath("//select[@data-test='LanguageSelect']")));

    }

    @Test
    public  void testKiwi() throws InterruptedException {

        driver.get(" https://www.kiwi.com/en/");
        driver.findElement(By.xpath("(//div[@class='ButtonPrimitiveContent__StyledButtonPrimitiveContent-sc-1nfggrh-0 iFkUjC'])[3]")).click();
        driver.findElement(By.xpath("//*[text()='TRY']")).click();
        WebElement language=driver.findElement(By.xpath("//select[@class='Select__StyledSelect-sc-2ijy2y-1 bStxNw']"));
        Thread.sleep(2);
        Select dilSecimi=new Select(language);
        dilSecimi.selectByVisibleText("Türkçe");
        WebElement currency=driver.findElement(By.xpath("//select[@data-test='CurrencySelect']"));
        Select paraBirimi=new Select(currency);
        paraBirimi.selectByValue("try");
        driver.findElement(By.xpath("//*[text()='Save & continue']"));


        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='TRY']")).getText().contains("TRY"));
       Assert.assertTrue(driver.getCurrentUrl().contains("en"));
        driver.findElement(By.xpath("//div[@class='ButtonPrimitiveContentChildren__StyledButtonPrimitiveContentChildren-sc-mra4yy-0 dkQFNd'][10]")).click();
        driver.findElement(By.xpath("//*[text()='Tek Yön']")).click();














    }

    @After
    public  void tearndown(){


        driver.close();
    }


}

