package classicselenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WorkingWithTCofAmazonandFlipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("REDMI Note 10 Pro (Dark Night, 128 GB)  (6 GB RAM)");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String FP=driver.findElement(By.xpath("(//div[text()='₹15,999'])[1]")).getText();
		driver.close();
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.amazon.in/");
		driver1.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("REDMI Note 10 Pro (Dark Night, 128 GB)  (6 GB RAM)");
		driver1.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    String AP=driver1.findElement(By.xpath("(//span[text()='15,999'])[1]")).getText();
		driver1.close();
		String Fprice="";
		for(int i=0; i<FP.length(); i++){
		char ch	=FP.charAt(i);
		if(Character.isDigit(ch)){
			Fprice=Fprice+ch;
		}
		}
		String Aprice="";
		for(int i=0; i<AP.length(); i++){
		char ch	=AP.charAt(i);
		if(Character.isDigit(ch)){
			Aprice=Aprice+ch;
		}
		}
	if(Integer.parseInt(Fprice)>Integer.parseInt(Aprice)){
		System.out.println("cost of mobile phone in Amazon is less"+" "+Aprice);
	}else{
		System.out.println("cost of mobile phone in flipkart is less"+Fprice);
	}
	}
	
}


