package classicselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWith_customeralert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("chandhu");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
		/*alt.accept();
		Thread.sleep(2000);
		alt.accept();*/
		driver.close();
	}

}
