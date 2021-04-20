import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_relative_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.gmail.com");
		
		// relative x path of username element
		
		//driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("guruvicky077@gmail.com");
		
		
		
		//relative x path of username element
		
				driver.findElement(By.xpath("//input[@id=\"identifierId\"]")).clear();
				
				driver.findElement(By.xpath("//input[@id=\"identifierId\"]")).sendKeys("guruvicky");
		

	}

}
