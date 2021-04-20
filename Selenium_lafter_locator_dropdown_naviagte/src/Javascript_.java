import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_ {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html"); 
		
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		
		// 1.How to scroll down and up the webpage in Selenium by a specific number of pixels?
		
		//js.executeScript("window.scrollBy(0,1000)","");
		
	//	Thread.sleep(4000);
		//js.executeScript("window.scrollBy(0,-1000)","");
		
		//Thread.sleep(4000);
		//js.executeScript("window.scrollBy(0,5000)","");
		
		
		 //2.How to scroll down to an element in Selenium until it is visible?
		
	//WebElement element=driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));
		
		
		//js.executeScript("arguments[0].scrollIntoView();", element);
		
		//3.How to scroll down to the bottom of the webpage using Selenium?
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		

	}

}
