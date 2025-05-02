package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("file:///C:/Users/shubha/Desktop/Selenium_Pratice/Locators.html");
      
        driver.findElement(By.id("username")).sendKeys("shubha");
        driver.findElement(By.name("pass")).sendKeys("shubha123");
        driver.findElement(By.className("btn primary")).click();
       System.out.println( driver.findElement(By.tagName("p")).getText());
	}

}
