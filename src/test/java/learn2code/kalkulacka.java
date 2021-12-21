package learn2code;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kalkulacka {
    private WebDriver driver;
    private final String BASE_URL = "http://localhost/kalkulacka.php";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Darinka/IdeaProjects/SeleniumBasic/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void kalk() {
    driver.get(BASE_URL);

        //relativni xpath
    driver.findElement(By.xpath("//*[@id=\"firstInput\"]")).sendKeys("5");
    driver.findElement(By.xpath("//*[@id=\"secondInput\"]")).sendKeys("6");
    driver.findElement(By.xpath("//*[@id=\"count\"]")).click();



    }
    @After
    public void tearDown(){

    }
}