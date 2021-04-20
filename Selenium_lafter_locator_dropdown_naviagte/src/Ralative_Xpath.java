import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ralative_Xpath {

	public static void main(String[] args) {
		
		
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
		
	driver.get("https://Google.com");
		//relative  xpath 
	//driver.findElement(By.xpath("//input[@name='q']"))	.sendKeys("hello");
	
	// if copied means     ( /html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input)-absolute Xpath

	
	//Absolute x path from root not preferable 
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("hello");
	
	}

}