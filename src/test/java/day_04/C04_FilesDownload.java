package day_04;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FilesDownload extends TestBase {

    @Test
    public void test01() {

        try {
            Files.delete(Paths.get("C:\\Users\\Admin\\Downloads\\some-file.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 'https://the-internet.herokuapp.com/download' adresine gidiniz
        driver.get("https://the-internet.herokuapp.com/download");

        // some-file.txt dosyasini indirelim
        //*[@href='download/some-file.txt']
        driver.findElement(By.xpath("//*[@href='download/some-file.txt']")).click();
        bekle(5);


        // dosyanin bilgisayarınızda Downloads(indirilenler)'a basariyla indirilip indirilmedigini test ediniz
        //"C:\Users\Admin   \Downloads\some-file.txt"
        String farkliKisim = System.getProperty("user.home");
        String ortakKisim = "\\Downloads\\some-file.txt";
        String dosyaYolu =farkliKisim+ortakKisim;
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));



    }
}
