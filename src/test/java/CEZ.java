import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CEZ {
    private WebDriver driver;
    private final String BASE_URL = "https://www.cezdistribuce.cz/cs/pro-zakazniky/spinani-hdo";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Darinka/IdeaProjects/SeleniumBasic/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void spiny() {
        driver.get(BASE_URL);
        new WebDriverWait(driver,15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"hdoForm\"]/div/div[1]/div[1]/div/div[2]/b")));
        driver.findElement(By.xpath("//*[@id=\"hdoForm\"]/div/div[1]/div[1]/div/div[2]/b")).click();

        driver.findElement(By.xpath("//*[@id=\"hdoForm\"]/div/div[1]/div[1]/div/div[3]/div/ul/li[3]")).click();

        driver.findElement(By.xpath("//*[@id=\"code\"]")).sendKeys("A1B6DP1");
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"code\"]")));
        driver.findElement(By.xpath("//*[@id=\"hdoForm\"]/div/div[2]/button")).click();

    }


    @After
    public void tearDown() {
    }
}