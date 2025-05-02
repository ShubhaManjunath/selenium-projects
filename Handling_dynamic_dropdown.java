package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_dynamic_dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Thread.sleep(100);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(100);
		//driver.findElement(By.cssSelector("a[value='BLR']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//a[@value='MAA'])[2]")).click();
		driver.close();
		
		
	}
}


