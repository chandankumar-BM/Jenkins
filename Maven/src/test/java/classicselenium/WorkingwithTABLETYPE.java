package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithTABLETYPE {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[@href='/apparel-shoes'])[1]")).click();
		//driver.findElement(By.xpath(" //a[text()="50's Rockabilly Polka Dot Top JR Plus Size"]/../../..//input"))
		driver.findElement(By.xpath(" //a[text()='Blue and green Sneaker']/../../..//input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-28']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='/apparel-shoes'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Blue Jeans']/../..//input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Casual Golf Belt']/../..//input")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='Genuine Leather Handbag with Cell Phone Holder & Many Pockets']/../..//input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]")).click();
		Thread.sleep(2000);
		for(int i=1; i<=3; i=i+2){
			driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td/input")).click();
		}
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
	}

}
