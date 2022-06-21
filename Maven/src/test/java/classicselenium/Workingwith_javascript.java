package classicselenium;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwith_javascript {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://demowebshop.tricentis.com/");
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,1500);");
    Thread.sleep(2000);
    js.executeScript("window.scrollBy(0,-1500);");
    Thread.sleep(2000);
    js.executeScript("window.scrollTo(267,567);");
}
}
