package classicselenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Workingwithscreenshots_Element {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		WebElement flight=driver.findElement(By.xpath("//p[@data-cy='dealCarouselMsg3']"));
		if(flight.isDisplayed()){
			File temp=flight.getScreenshotAs(OutputType.FILE);
			File perm=new File("./Screenshots/element.png");
			try {
				FileHandler.copy(temp, perm);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
