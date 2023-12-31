package tests.day12_testNG;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_TestNGIlkTest {

    @Test
    public void test01(){
        /*
            POM'de driver olusturmak ve gerekli ayarlari yapmak icin
            TestBase kullanmak yerine
            Ayri bir Driver class'i icerisinde
            bize driver döndürecek bir method olusturulmasi tercih edilmistir
         */

        Driver.getDriver().get("https://www.amazon.com");

        ReusableMethods.bekle(5);

        Driver.closeDriver();


    }
    @Test
    public void test02(){
        Driver.getDriver().get("https://youtube.com");
        System.out.println(Driver.getDriver().getCurrentUrl());
        Driver.closeDriver();

    }
}