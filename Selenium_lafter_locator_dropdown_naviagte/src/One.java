import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe" );
		
		WebDriver driver =new ChromeDriver();
		//interface reference variable	operator    keyword to create obt     Default constructor/class
		driver.get("https://www.facebook.com"); //launching fb using get method
		
		
		//driver.manage().window().maximize();
		//driver.quit();
	
		
		WebElement a=driver.findElement((By.partialLinkText("Create")));   //create a  account beacuse it select first link with create if want to slecet crete page we need to type crete page in partial link 
		
		a.click();
		
		//WebElement and=
		
// below code not working 
		
		Thread.sleep(1000);
driver.findElement(By.id("u_2_b_2/")).sendKeys("Nivi");

driver.findElement((By.name("reg_passwd__"))).sendKeys("Oneoneone");
		
		//and.sendKeys("Nivi");
		
		//WebElement b=driver.findElement((By.partialLinkText("Create a Page"))); 
		
		//b.click();
		
		//Thread.sleep(70000);
		//driver.navigate().back();
		
		//driver.navigate().forward();
		
		
		
		
	}

}

