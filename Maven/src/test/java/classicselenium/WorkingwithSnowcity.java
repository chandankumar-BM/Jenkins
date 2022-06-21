package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithSnowcity {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://snowcityblr.com/contact-us/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[height='450']")));
		Thread.sleep(2000);
		/*driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@tabindex='-1'])[1]")));
		Thread.sleep(2000);
		driver.switchTo().frame(2);
		Thread.sleep(2000);
*/		
		driver.findElement(By.xpath("//div[@class='icon navigate-icon']")).click();
		
}
}