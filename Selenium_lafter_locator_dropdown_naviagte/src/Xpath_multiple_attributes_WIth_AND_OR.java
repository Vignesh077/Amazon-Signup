import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_multiple_attributes_WIth_AND_OR {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver" ,"C:\\Users\\admin\\Desktop\\New folder (2)\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		
		driver.get("https://www.amazon.com");
		
		
		//4.relative  XPath Using or & and: 
		
		//and logical opt && both condition have true than it will execute next line
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @name='field-keywords']" )).sendKeys("mixi"); // pass LHC  and RHC
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @name='-keywords']" )).sendKeys("mixi"); //fail RHC fail ie name 
		 
		//in that second line name field is worng so it fail 
		
		
		//or( ie pipe line opt logical opt  any one  condition have true than it will execute next line
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @name='-keywords']" )).sendKeys("mixi"); // or so LHC pass it will execute next line
		//driver.findElement(By.xpath("//input[@id='twotabsearchtex' or @name='-keywords']" )).sendKeys("mixi");  // both LHC RHC fail not execute next line
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @name='-keywords']" )).sendKeys("mixi");
	}

}
