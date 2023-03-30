package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aradhna\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	WebDriverWait w = new WebDriverWait(driver, 20);	
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	WebElement address = driver.findElement(By.xpath("//select[@name=\"country\"]"));
    Select s = new Select(address);
	s.selectByVisibleText("INDIA");
	s.selectByIndex(2);
	Alert a = driver.switchTo().alert();
	
	
	

//	WebElement fname=driver.findElement(By.xpath("//input[@id=\"firstname\"]"));
//	w.until(ExpectedConditions.visibilityOf(fname));
//	driver.findElement(By.className("practice-form-wrapper"));
//	driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Chauhan");
//	driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]")).sendKeys("aradhna@tothenew.com");
//	driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]")).sendKeys("8287302200");
//	driver.findElement(By.xpath("//textarea[@placeholder=\"Current Address\"]")).sendKeys("SEC-144 NSL Techzone To the New ");
//	driver.findElement(By.xpath("//label[text()='Female']")).click();
////	Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(5,TimeUnit.SECONDS).ignoring(ElementClickInterceptedExceptions.class);
////	
////	Thread.sleep(5000);
////	driver.close();
//	
//	
	
	
	
}
}
