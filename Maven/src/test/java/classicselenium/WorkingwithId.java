package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithId {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("CHANDHU");
		driver.findElement(By.id("LastName")).sendKeys("chandan");
		driver.findElement(By.id("Email")).sendKeys("Chandan8265@.com");
		driver.findElement(By.id("Password")).sendKeys("Chandan8265@.com");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("chandhu@123");
		driver.findElement(By.id("register-button")).click();
	}

}
