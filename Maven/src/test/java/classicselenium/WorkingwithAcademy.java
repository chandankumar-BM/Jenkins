package classicselenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithAcademy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String Parent=driver.getWindowHandle();
		WebElement element=driver.findElement(By.cssSelector("button[id='openwindow']"));
		element.click();
		Set<String>allhandles=driver.getWindowHandles();
		for(String s:allhandles){
			if(!s.equals(Parent)){
			driver.switchTo().window(s);
			}
		}
		driver.findElement(By.xpath("//span[text()='Register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='user_name']")).sendKeys("CHANDAN");
		driver.findElement(By.cssSelector("input[id='user_email']")).sendKeys("CHANDHAN8264@gmail.com");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("chandhu@");
		driver.findElement(By.cssSelector("input[name='commit']")).click();
		for(String s:allhandles){
			if(s.equals(Parent)){
			driver.switchTo().window(s);
			}
		}
		driver.quit();
		
		
	}

}
