package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Qkart {
	  
	     private static WebDriver driver;
	     public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aradhna\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver, 20);	
		driver.get("https://crio-qkart-frontend-qa.vercel.app/");
	     }
	     
		@Test
		public void test1() {
		 WebElement search = driver.findElement(By.xpath("//input[@placeholder=\"Search for items/categories\"]"));
		 search.click();
		 search.isSelected();
		}	
	

}
