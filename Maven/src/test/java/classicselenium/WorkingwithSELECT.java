package classicselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingwithSELECT {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/books");
		WebElement viewas=driver.findElement(By.id("products-viewmode"));
		Select dropdown=new Select(viewas);
		List<WebElement> option=dropdown.getOptions();
		for(WebElement v:option){
			System.out.println(v.getText());
			
		}
	}

}
