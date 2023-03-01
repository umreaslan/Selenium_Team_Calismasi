package Practic2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBass;

public class C02_Soru2 extends TestBass {


    @Test
    public  void  test01(){

        //1. http://zero.webappsecurity.com/ Adresine gidin

        driver.get("http://zero.webappsecurity.com/");

        // 2. Sign in butonuna basin
        driver.findElement(By.id("signin_button")).click();

        //3. Login kutusuna “username” yazin
        driver.findElement(By.id("user_login")).sendKeys("username");

        //4. Password kutusuna “password.” yazin
        driver.findElement(By.id("user_password")).sendKeys("password");


        //5. Sign in tusuna basin
        driver.findElement(By.xpath("//input[@type='submit']")).click();
       driver.navigate().back();
       bekle(3);



        //6. Pay Bills sayfasina gidin
        driver.findElement(By.id("onlineBankingMenu")).click();
        driver.findElement(By.id("pay_bills_link")).click();
        bekle(3);

        //7. “Purchase Foreign Currency” tusuna basin
        driver.findElement(By.linkText("Purchase Foreign Currency")).click(); driver.findElement(By.linkText("Purchase Foreign Currency")).click();
        bekle(3);

        //8. “Currency” drop down menusunden Eurozone’u secin
        WebElement ddm = driver.findElement(By.id("pc_currency"));
        Select select = new Select(ddm);
        bekle(3);
        select.selectByVisibleText("Eurozone (euro)");

        // 9. “amount” kutusuna bir sayi girin
        driver.findElement(By.id("pc_amount")).sendKeys("500");
        //10. “US Dollars” in secilmedigini test edin
        WebElement element = driver.findElement(By.id("pc_inDollars_true"));
        Assert.assertFalse(element.isSelected());
        bekle(2);

        //11. “Selected currency” butonunu secin
        driver.findElement(By.id("pc_inDollars_false")).click();
        bekle(3);
        //12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
        driver.findElement(By.id("pc_calculate_costs")).click();
        driver.findElement(By.id("purchase_cash")).click();
        //13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini
        //kontrol edin.
                String expected = "Foreign currency cash was successfully purchased.";
        String actual = driver.findElement(By.id("alert_content")).getText();
        Assert.assertEquals(expected,actual);

        bekle(5);

    }
}
