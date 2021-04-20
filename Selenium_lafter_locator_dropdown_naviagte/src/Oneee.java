import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oneee {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		   driver.get("https://demoqa.com/alerts");
		    driver.manage().window().maximize();
		    
		    // This step will result in an alert on screen
		     // driver.findElement(By.id("alertButton")).click();
		   //  Alert simpleAlert = driver.switchTo().alert();
		     
		   //  Thread.sleep(3000);
		// simpleAlert.accept();
		  
		   //driver.findElement(By.id("timerAlertButton")).click();
		   
		     
		  // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  // Alert Alert = driver.switchTo().alert();
		// Alert.accept();
		    
		    
		 //   driver.findElement(By.id("confirmButton")).click();
		    
		  //  Alert Alert = driver.switchTo().alert();
		    //Thread.sleep(4000);
		    //Alert.accept();
		    
		    driver.findElement(By.id("promtButton")).click();
		    
			    Alert alert = driver.switchTo().alert();
			    Thread.sleep(4000);
			   
			 // System.out.println(  Alert.getText());
			 // Thread.sleep(2000);
			  
			 alert.sendKeys("Test User");
			  
			  Thread.sleep(10000);
			   alert.accept();  
		    
		    
	}

}
