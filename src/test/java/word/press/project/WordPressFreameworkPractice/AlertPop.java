package word.press.project.WordPressFreameworkPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class AlertPop {
	 WebDriver driver;
  @Test
  public void f() {
	  WebElement gobntclick=driver.findElement(By.xpath("//input[@value='Go!']"));
	  gobntclick.click();
	  Alert alt=driver.switchTo().alert();
	  String textmassege=alt.getText();
	  System.out.println(textmassege);
	  alt.accept();
	  
  }
  @BeforeTest
  public void beforeTest() {
	 // System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
	//driver= new ChromeDriver();
	  System.setProperty("webdriver.gecko.driver", "Resoures/geckodriver.exe");
	 driver= new FirefoxDriver();
	  driver.get("http://output.jsbin.com/usidix/1");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
