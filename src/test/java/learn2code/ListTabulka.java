package learn2code;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListTabulka {
    private WebDriver driver;
    private final String BASE_URL = "http://localhost/tabulka.php";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Darinka/IdeaProjects/SeleniumBasic/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void list() {
        driver.get(BASE_URL);
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        //overnie debugmod
        for (WebElement row : rows) {
            Assert.assertFalse(row.findElement(By.xpath("./td[3]")).getText().isEmpty());
        }
    }

    @After
    public void tearDown() {
    }
}
