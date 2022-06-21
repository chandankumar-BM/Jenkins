package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithTestcaseofCSS {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://demowebshop.tricentis.com/register");
	   driver.findElement(By.cssSelector("input[name='q']")).sendKeys("books");
	   driver.findElement(By.cssSelector("input[value='Search']")).click();
	  try{
		  if(driver.findElement(By.cssSelector("input[value='computer']")).isDisplayed()){
	  
		   System.out.println("pass");
	 }
		  }
	  catch(NoSuchElementException e){
		  System.out.println("Fail:test case is fail");
	  }
//	 else{
//		   System.out.println("fail");	  
//		   }
//	   

}
}