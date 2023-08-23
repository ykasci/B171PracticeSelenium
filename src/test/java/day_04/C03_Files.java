package day_04;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_Files  {

    @Test
    public void test01() {

        // Desktop(masaustu)'da bir text dosyası olusturun
        //"C:\Users\Admin       \Desktop\text.txt"
        //Dinamik Şekilde dosya yolu alma

        String farkliKisim = System.getProperty("user.home");
        String ortakKisim = "\\Desktop\\text.txt";
        //System.out.println("user.dir = " +ortakKisim);

        String dosyaYolu =farkliKisim+ortakKisim;




        // Desktop(masaustu)'da text dosyasının olup olmadıgını test edin
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
}
