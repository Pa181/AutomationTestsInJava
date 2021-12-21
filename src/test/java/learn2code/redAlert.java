package learn2code;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class redAlert {
    private WebDriver driver;
    private final String BASE_URL = "http://localhost/redalert.php";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Darinka/IdeaProjects/SeleniumBasic/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void alerty() {
        driver.get(BASE_URL);

            //1alert
        /*    driver.findElement(By.id("alert1")).click();
            //prepnutie do alertu
            Alert alert = driver.switchTo().alert();
            alert.accept();
            //vypisanie alertu do console
          System.out.println(driver.findElement(By.xpath("//div[@class='result']/h1")).getText());
        driver.findElement(By.id("alert2")).click();
        Alert alert =driver.switchTo().alert();
        alert.dismiss();
        System.out.println(driver.findElement(By.xpath("//div[@class='result']/h1")).getText());*/
        driver.findElement(By.id("alert3")).click();
        Alert alert = driver.switchTo().alert();

        alert.sendKeys( "Dari");

        alert.accept();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='result']/h1")).getText().contains("Dari"));






    }


    @After
    public void tearDown() {
    }
}
