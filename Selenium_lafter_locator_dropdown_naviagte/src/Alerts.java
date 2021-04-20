import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Alerts {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.com");
		
		
		// while deleting amazing history it will pop up conformation alert
		
		//in which we can accept or dismissss alert
		
		// to make history i need to add some items in cart 
		Thread.sleep(5000);
		
		 Actions actions = new Actions(driver);
		 
		 WebElement a=	driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		 
	//
	
	
	actions.moveToElement(a).perform();
	
	WebElement b=	driver.findElement(By.partialLinkText("Browsing His"));
		
	b.click();

	
	
	WebElement c=	driver.findElement(By.partialLinkText("Manage his"));
	
	c.click();
	
	
WebElement d=	driver.findElement(By.xpath("//input[starts-with(@class,'a-button-input')]"));
	
	d.click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Alert alert =driver.switchTo().alert();
	
	//alert.dismiss();
	
	
	// not working -may that pop up is not a alert 
	
	//may be because it has seperate close window option so it is an seperate window 
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//robot class
	
	Robot robot=new Robot();
	robot.mouseMove(700, 565);
	
	//WebElement e=	driver.findElement(By.partialLinkText("Remove all"));
	//e.click();
	robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // press left click	
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // release left click
    robot.keyPress(KeyEvent.VK_ENTER);	
    // press enter key of keyboard to perform above selected action	
	}

}
