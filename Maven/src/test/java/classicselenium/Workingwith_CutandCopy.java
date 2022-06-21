package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwith_CutandCopy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com/");
       WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
       email.sendKeys("chandhu");
       email.sendKeys(Keys.CONTROL+"a");
       email.sendKeys(Keys.CONTROL+"x");
       driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.CONTROL+"v");
	}

}
