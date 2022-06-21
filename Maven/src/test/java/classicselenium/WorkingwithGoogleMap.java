package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithGoogleMap {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/@12.9989714,77.5504773,15z");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'starting ')]")).sendKeys("rajajinagar");
		Thread.sleep(4000);
        driver.findElement(By.xpath("//input[contains(@placeholder,'starting ')]/../../..//button[@aria-label='Search']")).click();
    	Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@placeholder,'destination')]")).sendKeys("Testyantra");
    	Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@placeholder,'destination')]/../../../..//button[contains(@aria-label,'Search')]")).click();
    
        
	}

}
