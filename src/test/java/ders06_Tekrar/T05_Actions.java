package ders06_Tekrar;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBass;

public class T05_Actions extends TestBass {

    @Test
    public  void  test01(){

        driver.get("https://the-internet.herokuapp.com/context_menu");

        Actions action=new Actions(driver);

        WebElement cizgiliAlanElementi=driver.findElement(By.id("hot-spot"));

        action.contextClick(cizgiliAlanElementi).perform();





        bekle(3);
    }

}
