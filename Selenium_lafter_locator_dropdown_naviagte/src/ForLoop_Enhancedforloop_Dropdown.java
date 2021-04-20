import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForLoop_Enhancedforloop_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        
        driver.get("https://www.facebook.com");

		
		WebElement fb=driver.findElement(By.partialLinkText("Create New"));
		
		fb.click();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    //implicit wait
		
	//	WebElement one=	driver.findElement(By.xpath("//input[starts-with(@id,'u_')] [contains(@placeholder,'First name')]"));     // dynamic element id changing  u_1_b_59
		
	/*	one.sendKeys("vignesh");
		one.clear();
		Thread.sleep(3000);
		one.sendKeys("vignesh");
		String tagname=one.getTagName();
		
		System.out.println(tagname);
		
		
		System.out.println	(one.getSize());
		
		
		String data=(one.getAttribute("data-type"));
		System.out.println	(one.getAttribute("data-type"));
		
		if(data.equalsIgnoreCase("Text")) {    
		
		one.clear();
		Thread.sleep(3000);
		one.sendKeys("Aadhvik");}
		
		else {
			one.clear();
			Thread.sleep(3000);
			one.sendKeys("Akshara");*/
	//	}
			
	WebDriverWait wait=new WebDriverWait(driver,30);	
	
	
	WebElement one=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[starts-with(@id,'u_')] [contains(@placeholder,'First name')]")));     // dynamic element id changing  u_1_b_59
	
	one.sendKeys("vignesh");
	one.clear();
	Thread.sleep(3000);
	one.sendKeys("vig");
	String tagname=one.getTagName();
	
	System.out.println(tagname);
	
	
/*List<WebElement> da=	driver.findElements(By.id("day"));
	
	int number=da.size();
	
	System.out.println(number);
	
	for(int i=0;i<number;i++) {        
		 
     WebElement element=da.get(i);
			                            
	String st=  element.getText();
	  
	System.out.println(st);
	
	
	  
	String st1=  element.getAttribute("value");
	  
	System.out.println(st1);
	
	String st3=  element.getAttribute("id");
	  
	System.out.println(st3);
	
	if(st3.equalsIgnoreCase("day")) {
	
		
		System.out.println(element.getTagName());}
		
	else {
		
		System.out.println(st3);
	
	}
		
		}	*/
	
	
List<WebElement> da=	driver.findElements(By.id("day"));
	
	int number=da.size();
	
	System.out.println(number);
	
	for(WebElement element:da) {
		
	String st=element.getText();
	System.out.println(st);


	
	}
	
	
	
	
	
	
	
	
	
	
	
	
		
}}
