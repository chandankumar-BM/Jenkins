package classicselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithAlertGuru {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement Ele=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions act=new Actions(driver);
	act.doubleClick(Ele).build().perform();
	Alert alt=driver.switchTo().alert();
	alt.accept();
	Thread.sleep(2000);
	driver.close();
	
}
}
