package Practic2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBass;

public class C01_soru1 extends TestBass {

    @Test
    public  void test01(){

        //https://the-internet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");



        //b. Checkbox1 ve checkbox2 elementlerini locate edin. c. Checkbox1 seçili değilse onay kutusunu tıklayın

        WebElement check1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        if (!check1.isSelected()){
            check1.click();
        }
        bekle(3);

        //d. Checkbox2 seçili değilse onay kutusunu tıklayın
        WebElement check2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        if (!check2.isSelected()){
            check2.click();
        }
        bekle(2);


    }


}
