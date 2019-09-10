package word.press.project.WordPressFreameworkPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardWordPress {
	WebDriver driver;
	@FindBy(xpath="//div[text()='Posts']")
	WebElement webpostclick;
	
	@FindBy(xpath="//a[text()='All Posts']")
	WebElement Weballpost;
	
	@FindBy(xpath="//a[text()='Add New'][@href='post-new.php']")
	WebElement WebclickAddnew;
	
	@FindBy(xpath="//input[@name='post_title']")
	WebElement webenter;
	
	@FindBy(id="publish")
	WebElement Webpublish;
	


	public DashBoardWordPress(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void dashboardwordpressfunction() {
		//WebElement postclick=driver.findElement(By.xpath("//div[text()='Posts']"));
		
		webpostclick.click();
		
		//WebElement allpost = driver.findElement(By.xpath("//a[text()='All Posts']"));
		
		Weballpost.click();

		//WebElement clickAddnew = driver.findElement(By.xpath("//a[text()='Add New'][@href='post-new.php']"));
		System.out.println("Hello");
		WebclickAddnew.click();

		//WebElement addnewpost = driver.findElement(By.xpath("//h1[text()='Add a New Post']"));
		//addnewpost.click();

		//WebElement enter = driver.findElement(By.xpath("//input[@name='post_title']"));
		
		
		webenter.sendKeys("SaurabPost");
		
		//WebElement publish = driver.findElement(By.id("publish"));
		
		Webpublish.click();
	}

}

