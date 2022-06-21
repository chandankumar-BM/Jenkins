package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithclassandname {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Chandan%20kumar%20BM/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/LocatorsPractice.html");
		WebElement cs=driver.findElement(By.className("username"));
		cs.sendKeys("CHANDHU");
		WebElement cn=driver.findElement(By.className("password"));
		cn.sendKeys("12345");
		WebElement co=driver.findElement(By.className("checkbox"));
		co.click();
		WebElement ci=driver.findElement(By.name("a"));
		ci.click();
		WebElement cw=driver.findElement(By.className("button"));
		cw.click();
		
		
		
		
	}

}
