import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_to_ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("https://www.amazon.com");
		
		
		// 1.How to scroll down and up the webpage in Selenium by a specific number of pixels?
		//JavascriptExecutor js = (JavascriptExecutor) driver;
	       //js.executeScript("window.scrollBy(0,1400)", "");
	       
	       
	//JavascriptExecutor js=(JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(100,500)");
		
		
		
	       //2.How to scroll down to an element until an element becomes visible?
	
	

	Thread.sleep(10000);
	//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS)  ;  
	WebElement Element=driver.findElement(By.xpath("//a[@id=\"rhf-container\"]/div[2]/span/span/a"));
	
	
//js.executeScript("arguments[0].scrollIntoView();", Element);



Element.click();
	
	
	

	}
	
	

}
