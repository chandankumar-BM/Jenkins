package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithtagname {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Chandan%20kumar%20BM/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/HTMLDemoPage%20(2).html");
		WebElement link=driver.findElement(By.tagName("a"));
		link.click();
		Thread.sleep(2000);
		driver.close();
	}

}
