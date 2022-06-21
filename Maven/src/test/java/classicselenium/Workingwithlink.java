package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithlink {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
//	driver.findElement(By.linkText("Register")).click();
//driver.findElement(By.partialLinkText("Books")).click();//whenever we use partial linktext it works on the link present on the application.
	driver.findElement(By.partialLinkText("BOOKS")).click();
	
	
	}

}
