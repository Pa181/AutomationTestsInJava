package learn2code;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest {
    private WebDriver driver;
    private final String BASE_URL = "http://localhost/tabulka.php";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Darinka/IdeaProjects/SeleniumBasic/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void xpatest() {
        driver.get(BASE_URL);
        //absolutna cesta,absolutni xpath
        driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[3]/td[2]"));
        //relativni xpath
        driver.findElement(By.xpath("//table/tbody/tr[5]/td[3]"));

    }
    @After
    public void tearDown(){

    }
}