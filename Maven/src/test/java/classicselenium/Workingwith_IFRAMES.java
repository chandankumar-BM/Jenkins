package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwith_IFRAMES {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Chandan%20kumar%20BM/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/iframe.html");
	//driver.switchTo().frame("frame1");
	//driver.switchTo().frame(0);
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='FR1']")));
	driver.navigate().refresh();
	driver.findElement(By.xpath("//a[@id='gavtab-4']")).click();
}
}
