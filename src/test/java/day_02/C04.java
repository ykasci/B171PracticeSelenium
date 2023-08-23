package day_02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C04 extends TestBase {
    // https://www.bestbuy.com/ sayfasına gidin
    // sayfa Title'ini alın "Best" içerdigini test edin
    // BestBuy logosunun görüntülendigini test edin
    // Canada logosunun görüntülendigini test edin


    @Test
    public void test01() {
        // https://www.bestbuy.com/ sayfasına gidin
        driver.get("https://www.bestbuy.com/");
        // sayfa Title'ini alın "Best" içerdigini test edin
        Assert.assertTrue(driver.getTitle().contains("Best"));

        // BestBuy logosunun görüntülendigini test edin
        WebElement logo = driver.findElement(By.xpath("(//img)[1]"));
        Assert.assertTrue(logo.isDisplayed());
        // Canada logosunun görüntülendigini test edin
        WebElement canadaLogo = driver.findElement(By.xpath("(//img)[2]"));
        Assert.assertTrue(canadaLogo.isDisplayed());
    }
}
