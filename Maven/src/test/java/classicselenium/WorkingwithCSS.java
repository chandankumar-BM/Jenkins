package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithCSS {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Chandan%20kumar%20BM/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/LocatorsPractice%20(2).html");
        driver.findElement(By.cssSelector("input[class='username']")).sendKeys("CHANDAN");
        driver.findElement(By.cssSelector("input[class='password']")).sendKeys("CHANDHU");
        driver.findElement(By.cssSelector("input[class='checkbox']")).click();
        driver.findElement(By.cssSelector("input[name='a']")).click();
        driver.findElement(By.cssSelector("input[value='cancel']")).click();
        
       
	}

}
