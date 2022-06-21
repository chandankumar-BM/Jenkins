package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithTagnameinput {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Chandan%20kumar%20BM/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/SampleHTMLPage.html");
	WebElement input=driver.findElement(By.tagName("input"));
	input.sendKeys("ELF");
	Thread.sleep(5000);
	driver.close();
	
	
	
}
}
