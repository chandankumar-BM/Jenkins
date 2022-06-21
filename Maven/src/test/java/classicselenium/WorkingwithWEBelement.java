package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithWEBelement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		
		WebElement ele=driver.findElement(By.xpath("(//a[contains(text(),'Book')])[1]"));
		ele.click();String text1=driver.findElement(By.xpath("(//a[contains(text(),'Book')])[1]")).getText();
	    System.out.println(text1);
	   String text2= driver.findElement(By.xpath("(//a[contains(text(),'Book')])[1]")).getAttribute("href");
		System.out.println("Attribute is"+" "+text2);
	Class<? extends WebElement> ele3=driver.findElement(By.xpath("(//a[contains(text(),'Book')])[1]")).getClass();
		System.out.println(ele3);
		Point ele4=driver.findElement(By.xpath("(//a[contains(text(),'Book')])[1]")).getLocation();
		System.out.println(ele4);
		Rectangle ele5=driver.findElement(By.xpath("(//a[contains(text(),'Book')])[1]")).getRect();
		System.out.println(ele5);
		String text3=driver.findElement(By.xpath("(//a[contains(text(),'Book')])[1]")).getTagName();
		System.out.println(text3);
		boolean ele6=driver.findElement(By.xpath("(//a[contains(text(),'Book')])[1]")).isDisplayed();
		System.out.println(ele6);
	
		
	}

}
