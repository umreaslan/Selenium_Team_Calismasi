package Practic2;

import org.junit.Test;
import utilities.TestBass;

public class C03_Soru3 extends TestBass {

    @Test
    public  void test01()  {
        //2- https://the-internet.herokuapp.com/basic_auth sayfasina gidin
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        bekle(5);

        //3- asagidaki yontem ve test datalarini kullanarak authentication’i yapin
        //Html komutu : https://username:password@URL Username : admin
        //password : admin


    }



}
