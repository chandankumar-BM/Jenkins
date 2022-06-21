package classicselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Workingwith_DEMOhtml {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Chandan%20kumar%20BM/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/demo%20(2).html");
	WebElement dropdown =driver.findElement(By.xpath("//select[@id='standard_cars']"));
	Select down=new Select(dropdown);
	List<WebElement> option =down.getOptions();
	for(int i=0;i<option.size();i++){
		Select down1=new Select(driver.findElement(By.xpath("//select[@id='standard_cars']")));
		down1.selectByIndex(i);
	}
	}
}
