import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Two_amazon {         //locators ,

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");//using this comment driver connected to program 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
	WebElement one=	driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	
	one.click();
	
WebElement two=	driver.findElement(By.name("email"));   // to enter user name
	two.sendKeys("guruvicky077@gmail.com");
	
	WebElement three=	driver.findElement(By.id("createAccountSubmit")); // to click creat new acc
	three.click();
	
	WebElement four=	driver.findElement(By.id("ap_customer_name"));
	four.sendKeys("vignesh");
	
	WebElement five=	driver.findElement(By.name("email"));
	five.sendKeys("guruvicky077@gmail.com");
	
	Thread.sleep(10000);
	
	WebElement six=	driver.findElement(By.name("passwordCheck"));
	six.sendKeys("niviki@777");
	
	
	WebElement seven=	driver.findElement(By.id("ap_password"));
	seven.sendKeys("niviki@777");
	
	
	WebElement eight=	driver.findElement(By.id("continue"));
	eight.click();
	
	
	
	WebElement nine=	driver.findElement(By.partialLinkText("Sign"));
	nine.click();
	
	WebElement ten=	driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
    ten.sendKeys("guruvicky077@gmail.com");
	
    
    WebElement eleven=	driver.findElement(By.cssSelector("#continue"));
   eleven.click();
    thread.sleep();
	
   WebElement twelve=	driver.findElement(By.partialLinkText("Forgot your"));
   twelve.click();
   
   
   WebElement thirteen=	driver.findElement(By.id("continue"));
   thirteen.click();
   
   WebElement fourteen=	driver.findElement(By.name("code"));
  
  // fourteen.sendKeys("561599");  //OTP
   
   


   
	}

}
