package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Static_Dropdown_Updated_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(100);
		for(int i=1;i<=4; i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click(); 
		Thread.sleep(100);
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
	}
}
