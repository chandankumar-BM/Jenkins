package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.id("(//a[text()='Men'])[1]"))).build().perform();
	    Thread.sleep(2000);
	    act.click(driver.findElement(By.xpath("(//a[text()='T-Shirts'])[1]")));	  
	    
	    }

}
