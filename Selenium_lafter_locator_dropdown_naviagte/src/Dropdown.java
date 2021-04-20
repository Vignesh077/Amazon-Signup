

	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	
	
	public class Dropdown {

	    public static void main(String[] args) {
		WebDriver driver;
		


	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
			
	    driver =new ChromeDriver();	
	
		
			
	        
       driver.get("http://www.leafground.com/pages/Dropdown.html");
	   WebElement dd1= driver.findElement(By.id("dropdown1"));
	   Select s1=new Select(dd1);
	   s1.selectByIndex(1);
			
		
		
	   WebElement dd2= driver.findElement(By.xpath("//select[@id='dropdown3'][contains(@name,'dropdown3')]"));
	   Select s2=new Select(dd2);
	   s2.selectByValue("1");
		
	   
	   WebElement dd3= driver.findElement(By.name("dropdown2"));
	   Select s3=new Select(dd3);
	   s3.selectByVisibleText("Selenium");
	   
       //select by sendkeys
	   WebElement dd4= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select"));
	   
	   dd4.sendKeys("App");
	   
	   // get no of options in element 
	   
	   WebElement dd5=driver.findElement(By.xpath("//select[@class='dropdown']"));
	   Select s4=new Select(dd5);
	   List<WebElement> list=s4.getOptions();
	   int no=list.size();
	   
	   System.out.println(no);    
	   
	   for(int i=0;i<=no;i++) {
		   
		 WebElement ele= list.get(i);
		 
		 String val= ele.getAttribute("value");
		
		// System.out.println(val); 
		  if (val.equalsIgnoreCase("2")) {
			  
			  ele.click();
		  }
		   
		  
		  
		  
	   }
		
	  }	
		

 }
