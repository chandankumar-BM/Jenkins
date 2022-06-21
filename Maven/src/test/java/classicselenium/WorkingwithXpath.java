package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		if(driver.findElement(By.xpath("//input[@class='button-1 register-button']")).isDisplayed()){
			System.out.println("PASS");
		}
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("Chandan8275@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("chandhu@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		if(driver.findElement(By.xpath("//a[@class='ico-logout']")).isDisplayed()){
			System.out.println("passss");
		}
		driver.close();
		
		
	}

}
