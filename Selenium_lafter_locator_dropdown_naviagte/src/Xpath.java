import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
	/*	driver.get("https://www.google.com");
		
		
		WebElement a=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		
		a.sendKeys("santhi");*/
		

		driver.get("https://www.amazon.com");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");

	}

}


