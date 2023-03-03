package KonuTekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FindElements {

    public static void main(String[] args) {


        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.findElement(By.xpath(""));

        //WebDriver kullanılarak bir web sayfasındaki belirli bir öğeyi bulmak için kullanılır.

        /*
        Örneğin, bir web sayfasındaki bir düğmeyi tıklamak
        veya bir metin kutusuna veri girmek gibi
        belirli bir öğenin etkileşimini simüle etmek istediğimizde,
        önce öğenin yerini tespit etmemiz gerekir.
        Bu işlem, driver.findElement() methodu kullanılarak yapılabilir.

         */

        driver.findElements(By.id(""));
        //Birden fazla öğe bulunması durumunda,
        // findElements() methodu kullanılabilir.
        // findElements() methodu, belirtilen tüm öğeleri bir liste olarak döndürür.


        WebElement hediyeKutusu=driver.findElement(By.id(""));
        hediyeKutusu.isDisplayed();//elementin GORUNUR OLDUGUNUN test edilmediS

    }

}
