package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingwithFB {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,30);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String FN="chandhu";
	    String LN="chandan";
	    String mob="99011433553";
	    String pwd="chandhu@";
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"))));
     	driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		//Thread.sleep(2000);
     	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("input[name='firstname']"))));
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys(FN);
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(LN);
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys(mob);
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys(pwd);
		driver.findElement(By.cssSelector("input[value='2']")).click();
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		driver.close();
		
		
		
		
		
	}

}
