package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwith_DisableNotification {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
	WebElement TF=driver.findElement(By.xpath("//input[@class='form-control']"));
		//WebElement TF=driver.findElement(By.className("form-control"));	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='chandan';", TF);

}
}