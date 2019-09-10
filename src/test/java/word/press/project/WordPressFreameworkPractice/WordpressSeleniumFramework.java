package word.press.project.WordPressFreameworkPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WordpressSeleniumFramework {
	WebDriver driver;
   
	@Test
	public void login() {
		LogINClassWordPress log=new LogINClassWordPress(driver);
		log.LoginWordpressfunction1();
		
		
	}
		@Test
		public void dashboard() {
			DashBoardWordPress dash=new DashBoardWordPress(driver);
			dash.dashboardwordpressfunction();
	        
		

	}

	@BeforeTest
	public void beforeTest() {
		
		
		System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php?");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		
		driver.quit();
	}
	
	 }


