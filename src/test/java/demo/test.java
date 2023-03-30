package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aradhna\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	WebDriverWait w = new WebDriverWait(driver, 20);	
	driver.get("https://demoqa.com/automation-practice-form");

//	System.out.println(driver.getTitle());
//	driver.findElement(By.id("firstName")).sendKeys("Aradhna");
//	driver.findElement(By.cssSelector("input#firstName[type=\"text\"]")).sendKeys("Aradhna");
	WebElement fname=driver.findElement(By.xpath("//input[@id=\"firstname\"]"));
	w.until(ExpectedConditions.visibilityOf(fname));
	driver.findElement(By.className("practice-form-wrapper"));
	driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Chauhan");
	driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]")).sendKeys("aradhna@tothenew.com");
	driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]")).sendKeys("8287302200");
	driver.findElement(By.xpath("//textarea[@placeholder=\"Current Address\"]")).sendKeys("SEC-144 NSL Techzone To the New ");
	driver.findElement(By.xpath("//label[text()='Female']")).click();
//	Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(5,TimeUnit.SECONDS).ignoring(ElementClickInterceptedExceptions.class);
//	
//	Thread.sleep(5000);
//	driver.close();
	
	
	
	
	
}
}
