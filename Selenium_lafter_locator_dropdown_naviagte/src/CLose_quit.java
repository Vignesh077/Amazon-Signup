import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLose_quit {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		/*single window single tab -close(),quit()
		//driver.get("https://www.gmail.com");
		
		Thread.sleep(4000);
		
		//driver.close();
		//driver.quit();
		
		
		//single window multi tab -close(),quit()
				driver.get("https://www.gmail.com");
				
				Thread.sleep(4000);
				WebElement one=driver.findElement(By.linkText("Privacy"));
				one.click();
				Thread.sleep(4000);
			driver.close();
				//driver.quit();*/
				
		
		//Multiple window multi tab -close(),quit()
		driver.get("https://www.naukri.com");
		
		Thread.sleep(4000);
		
	//driver.close();
		driver.quit();
		
	}

}

