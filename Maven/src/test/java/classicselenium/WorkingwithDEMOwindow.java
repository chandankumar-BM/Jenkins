package classicselenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithDEMOwindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		String pw=driver.getWindowHandle();
		WebElement fb=driver.findElement(By.xpath("//a[text()='Facebook']"));
		fb.click();
		Thread.sleep(2000);
		Set<String> Allhandles=driver.getWindowHandles();
		for(String s:Allhandles){
			if(!s.equals(pw)){
				driver.switchTo().window(s);
				driver.close();
			}
		}
		
		
	}

}
