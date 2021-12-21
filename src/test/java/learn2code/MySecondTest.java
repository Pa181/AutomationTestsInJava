package learn2code;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySecondTest {
   private WebDriver driver;
   private final String BASE_URL = "http://localhost/clickmebaby.php";

   @Before
   public void setUp(){
       System.setProperty("webdriver.chrome.driver","C:/Users/Darinka/IdeaProjects/SeleniumBasic/src/test/resources/drivers/chromedriver.exe");
       driver = new ChromeDriver();

   }
   @Test
   public void test(){
       driver.get(BASE_URL);
       driver.findElement(By.xpath("//*[@id=\"clickMe\"]")).click();

   }
   @After
   public void teardown(){

}


}
