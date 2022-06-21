package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Workingwith_MOUSEHOVER {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/books");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Com')])[1]"))).build().perform();
		Thread.sleep(2000);
		act.click(driver.findElement(By.xpath("//a[contains(text(),'Des')]"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'cheap')]/../../..//input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//a[@class='product-name']")).getText().contains("cheap")){
			System.out.println("PASS");
		}else{
			System.out.println("fail");
		}
		driver.close();	
		}
}
