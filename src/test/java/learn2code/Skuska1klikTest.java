package learn2code;// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Skuska1klikTest {
  private WebDriver driver;
  private String baseUrl;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver","C:/Users/Darinka/IdeaProjects/SeleniumBasic/src/test/resources/drivers/chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "http://localhost/";
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }

  @Test
  public void skuska1klik() {
    driver.get("http://localhost/");

    driver.findElement(By.linkText("Click me baby")).click();
    driver.findElement(By.id("clickMe")).click();
    assertThat(driver.findElement(By.id("clicks")).getText(), is("1"));
    assertThat(driver.findElement(By.cssSelector(".description")).getText(), is("klik"));
  }

  @After
  public void tearDown() {
    driver.quit();
  }

}
