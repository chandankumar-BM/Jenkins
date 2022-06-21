package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingwithSELECTClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		WebElement dropdown=driver.findElement(By.id("products-orderby"));
		Select sortbydropdown=new Select(dropdown);
		sortbydropdown.selectByVisibleText("Name: A to Z");
		Thread.sleep(2000);
		sortbydropdown.selectByVisibleText("Name: Z to A");
		Thread.sleep(2000);
		sortbydropdown.selectByVisibleText("Price: Low to High");
		Thread.sleep(2000);
		sortbydropdown.selectByVisibleText("Price: High to Low");
		Thread.sleep(2000);
		sortbydropdown.selectByVisibleText("Created on");
		Thread.sleep(2000);
		driver.close();
	}

}
