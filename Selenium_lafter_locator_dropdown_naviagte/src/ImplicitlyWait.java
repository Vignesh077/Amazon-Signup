import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement one=	driver.findElement(By.id("email"));
		  
	      one.sendKeys("guru");
	      
	  //    
		
	WebElement two=	driver.findElement(By.partialLinkText("Create New A"));
		
    two.click();
    
  // driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);/* The key point to note here is, unlike Thread.sleep(), it does not wait for the complete duration of time. In case it finds the element before the duration specified, it moves on to the next line of code execution,*/ 
    
    
    Thread.sleep(2000); // The key point to note here is, unlike Thread.sleep(), it does not wait for the complete duration of time. In case it finds the element before the duration specified, it moves on to the next line of code execution,
                        // here getting failure because element is diplayed after 2 sec .but implicitly wait will find every 1 sec
    WebElement three=	driver.findElement(By.name("firstname"));
	
  three.sendKeys("guruvs");
    
    
    
    
    
	}

}
