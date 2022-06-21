package classicselenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithTestcaseofFlipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		String pw=driver.getWindowHandle();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("APPLE iPhone SE (Red, 128 GB)");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone SE (Red, 128 GB)']")).click();
		String price=driver.findElement(By.xpath("(//div[text()='₹35,499'])[1]")).getText();
		System.out.println(price);
	Set<String> allwind=driver.getWindowHandles();
	for(String W:allwind){
		if(!W.equals(pw)){
			driver.switchTo().window(W);
			}
		
	}	
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		driver.findElement(By.xpath("//button[@class='_23FHuj'][2]")).click();
		String currentprice=driver.findElement(By.xpath("//span[text()=' ₹71,056']")).getText();
		System.out.println(currentprice);
	}

}
