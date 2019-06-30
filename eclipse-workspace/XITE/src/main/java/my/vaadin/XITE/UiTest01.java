package my.vaadin.XITE;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UiTest01 {
  private WebDriver driver;  
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\alfis\\eclipse-workspace\\geckodriver.exe");
    driver = new FirefoxDriver();    
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test01() throws Exception {
	driver.manage().window().maximize();
    driver.get("http://localhost:8080//");
    if(isElementPresent(By.id("gwt-uid-3"))) {
    driver.findElement(By.id("gwt-uid-3")).click();
    }
    driver.findElement(By.id("gwt-uid-3")).clear();
    driver.findElement(By.id("gwt-uid-3")).sendKeys("3");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('Type a natural number here to check if it', \"'\", 's a prime number')])[1]/following::div[3]")).click();
    driver.findElement(By.id("gwt-uid-3")).click();
    driver.findElement(By.id("gwt-uid-3")).clear();
    driver.findElement(By.id("gwt-uid-3")).sendKeys("0");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('Type a natural number here to check if it', \"'\", 's a prime number')])[1]/following::div[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Info:'])[1]/following::b[1]")).click();
    driver.findElement(By.id("gwt-uid-3")).click();
    driver.findElement(By.id("gwt-uid-3")).clear();
    driver.findElement(By.id("gwt-uid-3")).sendKeys("-12");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('Type a natural number here to check if it', \"'\", 's a prime number')])[1]/following::div[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Lets Check'])[1]/following::div[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Info:'])[1]/following::h1[1]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }
}
