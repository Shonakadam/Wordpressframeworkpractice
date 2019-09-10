package word.press.project.WordPressFreameworkPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogINClassWordPress {
	WebDriver driver;
	@FindBy(xpath="//input[@id='user_login']")
	WebElement WebUsername;
	
	@FindBy(xpath="//input[@id='user_pass']")
	WebElement Webpassword;
	
	@FindBy(xpath="//input[@id='wp-submit']")
	WebElement webloginbnt;
	public LogINClassWordPress(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void LoginWordpressfunction1() {
		//WebElement Username = driver.findElement(By.xpath("//input[@id='user_login']"));
		
		
		WebUsername.sendKeys("admin");

		//WebElement password = driver.findElement(By.xpath("//input[@id='user_pass']"));
		
		
		Webpassword.sendKeys("demo123");

		//WebElement loginbnt = driver.findElement(By.xpath("//input[@id='wp-submit']"));
		
		webloginbnt.click();
	}
	
	}


