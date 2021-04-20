import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button {

	public static void main(String[] args) {
		
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
	WebElement fb=driver.findElement(By.partialLinkText("Create New Acc"));
	
	fb.click();
			
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//driver.manage().deleteAllCookies();
		
		
		// List<WebElement> ele=  driver.findElements(By.name("sex"));
		
	//	List<WebElement> ele=  driver.findElements(By.xpath("//input[@type='radio' and @name='sex']"));
		
	//int number	= ele.size();
	
	//System.out.println(number);
	
	//for(int i=0;i<number;i++) {
		
		//WebElement gett=ele.get(i);
		
		//String st=gett.getText();
	//	
		//String st=gett.getAttribute("value");
		//String st=gett.getTagName();
	
	//System.out.println(st);
	
	
//	if(st.equalsIgnoreCase("1")) {
	

	
	//gett.click();
	
	
	/*for(int i=0;i<number;i++) {
		
		WebElement gett=ele.get(i);
	String st=gett.getAttribute("id");
	
	System.out.println(st);
	
	if(st.equalsIgnoreCase("u_")) {     // here id getting changing 
	
	gett.click();
	
	
	System.out.println("vignesh");*/
	
	driver.findElement(By.xpath("//input[contains(@value,'2')][starts-with(@id,'u_')]")).click();
	
			//(By.xpath("//input[starts-with(@id,'twotabsearchtextbox')][@class='nav-input nav-progressive-attribute']"));
	
		
	}
	
		 
		 
	}	 
		 


	
