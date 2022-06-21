package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwith_KEYSCONTROL {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/books");
		WebElement ele=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		ele.sendKeys("computers");
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		driver.close();
	}

}
