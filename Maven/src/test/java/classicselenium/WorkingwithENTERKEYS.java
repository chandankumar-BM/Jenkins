package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithENTERKEYS {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/books");
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("computers");
		Actions Act=new Actions(driver);
		Act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.close();
	}

}
