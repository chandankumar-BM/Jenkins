package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwith_fileupload {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://smallpdf.com/pdf-to-word");
	Thread.sleep(5000);
	String path="C:/Users/Chandan kumar BM/Downloads/certificate final-converted.pdf";
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys(path);
	
	}

}
