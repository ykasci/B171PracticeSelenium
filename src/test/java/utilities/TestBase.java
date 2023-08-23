package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public abstract class TestBase {

    // bu class'a extends ettigimiz test class'larından ulasabiliriz.
    // TestBase class'ından obje olusturulmasının onune gecilmesi icin abstract yapılabilir.


    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
    }



    public void ddmVisibleText(WebElement ddm, String secenek){

        Select select = new Select(ddm);
        select.selectByVisibleText(secenek);
    }




    public void ddmIndex(WebElement ddm, int index){

        Select select = new Select(ddm);
        select.selectByIndex(index);

    }



    public void ddmValue(WebElement ddm, String value){

        Select select = new Select(ddm);
        select.selectByValue(value);

    }



    public void bekle(int saniye){

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }






}