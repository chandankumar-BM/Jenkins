package classicselenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWIndow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		String pw=driver.getWindowHandle();
		WebElement cw=driver.findElement(By.xpath("//button[text()='New Window']"));
		cw.click();
		Set<String> windows=driver.getWindowHandles();
		for(String s:windows){
			if(pw.equals(s)){
				driver.switchTo().window(s);
				}else{
					driver.switchTo().window(s);
					driver.close();
				}
				
			}
		}

}
