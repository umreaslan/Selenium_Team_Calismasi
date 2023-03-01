package practicSoru;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBass;

public class C03_Soru3 extends TestBass {




    @Test
    public  void test01(){

           //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/ ");


        //        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();


        //        //3- Delete butonu’nun gorunur oldugunu test edin
      WebElement button= driver.findElement(By.xpath("(//button[text()='Delete'])[1]"));
        Assert.assertTrue(button.isDisplayed());
        bekle(3);


        //        //4- Delete tusuna basin
        button.click();

        //        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement yazi=driver.findElement(By.tagName("h3"));
        Assert.assertTrue(yazi.isDisplayed());


        //




    }
}
