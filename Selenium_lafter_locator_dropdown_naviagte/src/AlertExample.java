import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
	
    static WebDriver  driver;
	public static void main(String[] args) throws InterruptedException {
		
		

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement  simpleAlertbox=driver.findElement((By.xpath("//button[@onclick='normalAlert()']")));////*[@id="contentblock"]/section/div[1]/div/div/button
		simpleAlertbox.click();
		Alert simpleAlert=driver.switchTo().alert();
		Thread.sleep(3000);  // do not use in code for to see what is happening using this
		simpleAlert.accept(); //click ok
	   
		
		WebElement  conformAlertbox=driver.findElement((By.xpath("//button[@onclick='confirmAlert()']")));
		conformAlertbox.click();
		Alert ConformAlert=driver.switchTo().alert();
		Thread.sleep(3000);  // do not use in code for to see what is happening using this
		ConformAlert.dismiss(); //click calcel
	    
		WebElement  promtAlertbox=driver.findElement((By.xpath("//button[@onclick='confirmPrompt()']")));
		promtAlertbox.click();
		Alert promptAlert=driver.switchTo().alert();
		Thread.sleep(3000);  // do not use in code for to see what is happening using thi
		promptAlert.sendKeys("hello");
		promptAlert.accept();

	}

}
