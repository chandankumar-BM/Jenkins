package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithFLIPKART {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("9901143553");
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).sendKeys("chandhu@123");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		}

}
