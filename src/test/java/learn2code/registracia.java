
package learn2code;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registracia {
    private WebDriver driver;
    private final String BASE_URL = "http://localhost/registracia.php";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Darinka/IdeaProjects/SeleniumBasic/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void regtest() {
        driver.get(BASE_URL);
        driver.findElement(By.name("email")).sendKeys("p.melis@zoznam.sk");
        driver.findElement(By.xpath("/html/body/div/div/form/div[2]/input")).sendKeys("Pallo");
        driver.findElement(By.xpath("/html/body/div/div/form/div[3]/input")).sendKeys("Melko");
        driver.findElement(By.xpath("/html/body/div/div/form/div[4]/input")).sendKeys("sedere1452");
        driver.findElement(By.xpath("/html/body/div/div/form/div[5]/input")).sendKeys("sedere1452");
        driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();
        driver.findElement(By.xpath("/html/body/div/div/form/button")).click();




    }
    @After
    public void tearDown() {

    }



}