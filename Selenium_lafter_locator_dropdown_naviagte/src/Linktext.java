import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://Google.com");
		
	WebElement one=driver.findElement(By.cssSelector("#gb > div > div:nth-child(1) > div > div:nth-child(1) > a"));
	
	one.click();
		
	}

}
