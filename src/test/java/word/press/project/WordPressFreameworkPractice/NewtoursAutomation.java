package word.press.project.WordPressFreameworkPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewtoursAutomation {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement Username=driver.findElement(By.xpath("//input[@name='userName']"));
	  Username.sendKeys("Manali11@gmail.com");
	  
	  WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
	  Password.sendKeys("manali123");
	  
	  WebElement signinbnt=driver.findElement(By.xpath("//input[@name='login']"));
	  signinbnt.click();
  }
	  @Test
	  public void Submit() {
		  WebElement Username=driver.findElement(By.xpath("//input[@name='userName']"));
		  Username.sendKeys("Manali11@gmail.com");
		  
		  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		  password.sendKeys("manali123");
		  
		  WebElement submit=driver.findElement(By.xpath("//input[@name='login']"));
		  submit.click();
	  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","Resoures/chromedriver.exe" );
	  driver= new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	 
  }

}
