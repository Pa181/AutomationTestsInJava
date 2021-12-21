package learn2code;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackFowardTest {
    private WebDriver driver;
    private final String BASE_URL = "http://localhost/registracia.php";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Darinka/IdeaProjects/SeleniumBasic/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void BackFowardtestment() throws InterruptedException {
        driver.get(BASE_URL);
        String email = "dari@makozy.sk";
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.xpath("//a[@href='zenaalebomuz.php']")).click();
        driver.navigate().back();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
        Assert.assertEquals(email, driver.findElement(By.name("email")).getAttribute("value"));
        driver.navigate().forward();
        new
                WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@src='img/conchita.jpg']")));
        Assert.assertTrue(driver.findElement(By.xpath("//img[@src='img/conchita.jpg']")).isDisplayed());

    }

    @After
    public void tearDown() {

    }

    public static class clickMeReset {
        private WebDriver driver;
        private final String BASE_URL = "http://localhost/clickmebaby.php";

        @Before
        public void setUp(){
            System.setProperty("webdriver.chrome.driver","C:/Users/Darinka/IdeaProjects/SeleniumBasic/src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();

        }
        @Test
        public void resettest() {
            driver.get(BASE_URL);
            // System.out.print(driver.findElement(By.id("clicks")).getText());
            // Assert.assertEquals(  "0", driver.findElement(By.id("clicks")).getText());
            // driver.findElement(By.id("clickMe")).click();
            // Assert.assertEquals(  "1", driver.findElement(By.id("clicks")).getText());

            Assert.assertEquals("inicialni pocet klikov", "0", driver.findElement(By.id("clicks")).getText());
            Assert.assertEquals("klikov", driver.findElement(By.className("description")).getText());
            for (int i = 1; i < 11; i++) {
                driver.findElement(By.id("clickMe")).click();

                Assert.assertEquals(String.valueOf(i), driver.findElement(By.id("clicks")).getText());

            /*    if (i==1) {
                   Assert.assertEquals("klik", driver.findElement(By.className("description")).getText());
                }

               if (i >= 4) {
                    Assert.assertEquals("klikov", driver.findElement(By.className("description")).getText());
            */   }
            }
            @After
            public void teardown () {

            }
        }
}