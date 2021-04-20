import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Implicitly {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement one=driver.findElement(By.partialLinkText("Create New"));
		one.click();
		//with time wait elemet not finded and code is fails
		
		//So have to provide time lag by thread.sleep,or by implicit wait,explicit wait 
		
		
		//Thread.sleep(5000);     //if element found in 2 sec balance 3 sec waiting is wastage of time but it works not efficient in time
		
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// if element found in 1 sec also it will execute next line of code
		  
		
		
		
	//	WebElement two=driver.findElement(By.id("u_1_b_Yo"));
		
		

	//	two.clear();
   //    two.sendKeys("guruvicky077@gmail.com");
		
		
		//Explictly wait unil element is clickable
		WebDriverWait wait=new WebDriverWait(driver,30);
		//class
		
		WebElement three=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		
		
		
		three.sendKeys("guruvicky077@gmail.com");
		
		
		
		
		

	}

}
