package classicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Workingwith_DRAGNDDOROP {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions act=new Actions(driver);
	WebElement source=	driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
	WebElement target=driver.findElement(By.xpath("//div[@id='box107']"));
		act.dragAndDrop(source, target).perform();
		Thread.sleep(2000);
    WebElement source1=	driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
    WebElement target1=driver.findElement(By.xpath("//div[@id='box103']"));
			act.dragAndDrop(source1, target1).perform();
    WebElement source2=	driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
    WebElement target2=driver.findElement(By.xpath("//div[@id='box102']"));
				act.dragAndDrop(source2, target2).perform();
    WebElement source3=	driver.findElement(By.xpath("(//div[text()='Seoul'])[2]"));
	WebElement target3=driver.findElement(By.xpath("//div[@id='box105']"));
					act.dragAndDrop(source3, target3).perform();
	WebElement source4	=driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]"));
    WebElement target4=driver.findElement(By.xpath("//div[@id='box104']"));
						act.dragAndDrop(source4, target4).perform();
  WebElement source5=	driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
 WebElement target5=driver.findElement(By.xpath("//div[@id='box101']"));
							act.dragAndDrop(source5, target5).perform();
							WebElement source6=	driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
							WebElement target6=driver.findElement(By.xpath("//div[@id='box106']"));
								act.dragAndDrop(source6, target6).perform();
							
		driver.close();
		
		
	}

}
