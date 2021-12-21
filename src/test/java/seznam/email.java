
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class email {
    private WebDriver driver;
    private final String BASE_URL = "https://www.seznam.cz/";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Darinka/IdeaProjects/SeleniumBasic/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void emailP() {
        driver.get(BASE_URL);
        driver.findElement(By.xpath("//*[@id=\"boxik-184\"]/div/div/div[3]/div/form/div[1]/label/input")).sendKeys("autotestpalo");
        driver.findElement(By.xpath("//*[@id=\"boxik-184\"]/div/div/div[3]/div/form/div[2]/div/label/input")).sendKeys("Darinka1505");
        driver.findElement(By.xpath("//*[@id=\"boxik-184\"]/div/div/div[3]/div/form/div[2]/div/button")).click();

    }

    @After
    public void tearDown() {
    }


}

