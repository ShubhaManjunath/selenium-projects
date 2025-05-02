package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_using_siblings_Traverse {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.findElement(By.xpath("//header/div/button[1]/following-sibiling::button[1]")).click();
		driver.close();
		

	}

}
