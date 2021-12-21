package learn2code;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zistovanieTabulka {
    private WebDriver driver;
    private final String BASE_URL = "http://localhost/tabulka.php";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Darinka/IdeaProjects/SeleniumBasic/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void zistenie() {
        driver.get(BASE_URL);
        //  System.out.println(driver.findElement(By.xpath("//table/tbody/tr[last()]/td[1]")).getText());

        // vytvorenie premenej int a prevedenie texu na cislo pomocou Interg.parseInt (takyvane Iterovanie
        int rows = Integer.parseInt(driver.findElement(By.xpath("//table/tbody/tr[last()]/td[1]")).getText());
        for (int i = 1; i < rows + 1; i++) {
            System.out.println(driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[1]")).getText());
        }
    }
    @After
    public void tearDown() {
    }
}
