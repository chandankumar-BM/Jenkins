package classicselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingwithSelectbyIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/books");
		WebElement dropdown=driver.findElement(By.id("products-orderby"));
		Select drop=new Select(dropdown);
		List<WebElement> option=drop.getOptions();
		for(int i=0;i<option.size(); i++){
			 Select a1= new Select(driver.findElement(By.id("products-orderby")));
			 a1.selectByIndex(i);
		
	}
}
}
