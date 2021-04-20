import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathwith_Multiple_attriputes {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.gecko.driver" ,"C:\\Users\\admin\\Desktop\\New folder (2)\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		
		driver.get("https://www.amazon.com");
		
		
		//1. relative xpath with single attribute
		//WebElement one=driver.findElement(By.xpath("//input[@ id='twotabsearchtextbox']"));
		
	//	one.sendKeys("fan");
		
		
		//2.relative xpath with starting text
		
		
		//WebElement one=driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearcht')]"));
		
		//	one.sendKeys("fan");
		
		
		//3.relative xpath with contains
		
		
			//	WebElement one=driver.findElement(By.xpath("//input[contains(@id,'bsearchtextbox')]"));
				
					//one.sendKeys("fan");
					
    	//4.relative xpath matiple attributes
					
					
					//WebElement one=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'][@class='nav-input nav-progressive-attribute']"));
					
		//WebElement one=driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearchtextbox')][@class='nav-input nav-progressive-attribute']"));
		//WebElement one=driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearchte')][contains(@class,' nav-progressive-attribute')]"));
		
		     //   one.sendKeys("fan");
						
						
					
					
					
		//4.relative  XPath axes methods:	
						
		WebElement one=driver.findElement(By.xpath("//*[@type='text']"));			
		//WebElement one=driver.findElement(By.xpath("//input[@type='text']"));
		
	       one.sendKeys("fan");
					
		
	     //4.relative  XPath Using OR & AND: 
		
	    
		
		//2.relative xpath with starting text
		//WebElement two=driver.findElement(By.xpath("//input[starts-with(@id,'nav-search-submit-button')]"));  // full id value entered
		
		WebElement two=driver.findElement(By.xpath("//input[starts-with(@id,'nav-search-')]"));  //here only partial starting id values entered
		
		
		
		two.click();
		
	}

}
