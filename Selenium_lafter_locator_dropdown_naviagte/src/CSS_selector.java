import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_selector {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https:www.amazon.com");
		//css selcetor using copy
		//driver.findElement(By.cssSelector("#identifierId")).sendKeys("12345");
		
		//to scroll down 
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeAsyncScript("window.scrollBY(0,300)");
		
		
	//CSS selector
		
		//driver.findElement(By.cssSelector("input#identifierId")).sendKeys("78940");
		                                  //tagname#idvalue
		
	}

}
