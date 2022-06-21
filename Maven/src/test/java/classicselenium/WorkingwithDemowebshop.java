package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithDemowebshop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		//driver.findElement(By.xpath("//span[@class='close']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]")).click();
		String text=driver.findElement(By.xpath("(//table)/tbody/tr[1]/td[3]/a")).getText();
		if(text.contains("Computing and Internet")){
			System.out.println("pass");
		}


	}

}
