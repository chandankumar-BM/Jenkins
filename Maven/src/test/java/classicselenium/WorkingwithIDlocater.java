package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithIDlocater {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://demowebshop.tricentis.com/");
	 if (driver.getTitle().contains("Demo")){
		 System.out.println("Demo web page is open");
		 }
	 String title="ico-register";
	 driver.findElement(By.className(title)).click();
	 if(driver.getTitle().contains("Register")){
		 System.out.println("Register page is displayed");
	 }
	 driver.findElement(By.id("gender-male")).click();
	 String fn="CHANDHU";
	 String ln="chandan";
	 String email="Chandan8275@gmail.com";
	 String pwd="chandhu@123";
	 String con="chandhu@123";
		driver.findElement(By.id("FirstName")).sendKeys(fn);
		driver.findElement(By.id("LastName")).sendKeys(ln);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(con);
		driver.findElement(By.id("register-button")).click();
		if(driver.findElement(By.className("ico-logout")).isDisplayed())
		{
			System.out.println("User is registered successfully");
		}
	 
	 
	 
	 
	 
	}

}
