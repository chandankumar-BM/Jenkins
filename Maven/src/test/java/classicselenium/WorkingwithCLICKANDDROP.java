package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithCLICKANDDROP {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions act=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]"));
		WebElement target=driver.findElement(By.xpath("//div[@id='box104']"));
		act.clickAndHold(source).build().perform();
		act.release(target).build().perform();
		WebElement source1=driver.findElement(By.xpath("//div[text()='Seoul'][2]"));
		WebElement target1=driver.findElement(By.xpath("//div[@id='box105']"));
		act.clickAndHold(source1).build().perform();
		act.release(target1).build().perform();
		WebElement source2=driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
		WebElement target2=driver.findElement(By.xpath("//div[@id='box106']"));
		act.clickAndHold(source2).build().perform();
		act.release(target2).build().perform();
		WebElement source3=driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
		WebElement target3=driver.findElement(By.xpath("//div[@id='box102']"));
		act.clickAndHold(source3).build().perform();
		act.release(target3).build().perform();
		WebElement source4=driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
		WebElement target4=driver.findElement(By.xpath("//div[@id='box101']"));
		act.clickAndHold(source4).build().perform();
		act.release(target4).build().perform();
		WebElement source5=driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
		WebElement target5=driver.findElement(By.xpath("//div[@id='box107']"));
		act.clickAndHold(source5).build().perform();
		act.release(target5).build().perform();
		WebElement source6=driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
		WebElement target6=driver.findElement(By.xpath("//div[@id='box103']"));
		act.clickAndHold(source6).build().perform();
		act.release(target6).build().perform();
		driver.quit();
		
		
		
	}

}
