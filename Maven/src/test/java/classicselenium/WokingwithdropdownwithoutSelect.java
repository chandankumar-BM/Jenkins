package classicselenium;

import java.awt.AWTException;
import java.security.cert.PKIXRevocationChecker.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WokingwithdropdownwithoutSelect {

	public static void main(String[] args) throws AWTException {
		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demowebshop.tricentis.com/books");
/*		for(int i=0; i<5; i++){
			driver.findElement(By.xpath("//select[@name='products-orderby']")).click();
			    Actions act=new Actions(driver);
				act.sendKeys(Keys.ARROW_DOWN).perform();
			    act.sendKeys(Keys.ENTER).perform();
			 }*/
		/*	for(int i=0;i<5;i++){
			driver.findElement(By.xpath("//select[@name='products-orderby']")).click();
		    Robot robo=new Robot();
		    robo.keyPress(KeyEvent.VK_DOWN);
		    robo.keyPress(KeyEvent.VK_ENTER);
			}*/
			for(int i=0; i<5;i++){
			WebElement drop=driver.findElement(By.xpath("//select[@name='products-orderby']"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//select[@name='products-orderby']//option[i]")));
			}		
}
}
