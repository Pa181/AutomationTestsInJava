import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class letuska {

    private WebDriver driver;
    private final String BASE_URL = "https://zaletsi.cz/login/?redirect_to=https%3A%2F%2Fzaletsi.cz";

    @Before
    public void zaletsi() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Darinka/IdeaProjects/SeleniumBasic/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void Zalet() {
        driver.get(BASE_URL);

        driver.findElement(By.xpath("//*[@id=\"log\"]")).sendKeys("autotestpalo@seznam.cz");
        driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("Darinka2703");
        driver.findElement(By.xpath("//*[@id=\"wpmem_login_form\"]/fieldset/div[3]/input[2]")).click();

        driver.findElement(By.xpath("//*[@id=\"frm-ticketFinder-form-data-flights-0-originSearch\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"frm-ticketFinder-form\"]/div[1]/div[1]/div[2]/div[1]/div[1]/div/div[1]/input[1]")).click();
      /*  new WebDriverWait(driver, 15)
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath("//*[@id=\"frm-ticketFinder-form-data-flights-0-originSearch\"]")));
        driver.findElement(By.xpath("//*[@id=\"frm-ticketFinder-form-data-flights-0-originSearch\"]")).sendKeys("Praha");
*/
        //overenie ci je element zobrazeni na stranke
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"frm-ticketFinder-form-data-flights-0-originSearch\"]")).isDisplayed());
    }


    @After
    public void tearDown() {
    }























}
