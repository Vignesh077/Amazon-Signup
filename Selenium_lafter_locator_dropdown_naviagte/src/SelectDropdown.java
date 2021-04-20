import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {      //selector

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");//using this comment driver connected to program 
		WebDriver driver=new ChromeDriver();
		
	  // to type backward slash type ALt+92 \
		
		driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=973072061&extra_1=s%7Cc%7C231346502318%7Ce%7Cfacebook%7C&placement=&creative=231346502318&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D973072061%26adgroupid%3D54006406691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-297690534863%26loc_physical_ms%3D9040217%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI7uD268KM7wIVmjUrCh33VgtEEAAYASAAEgJiaPD_BwE");
		
		
		WebElement one=driver.findElement(By.name("firstname"));
		 System.out.println(driver.getTitle());
		one.sendKeys("vignesh ");
		Thread.sleep(10000);
		one.clear();
		Thread.sleep(5000);
		one.sendKeys("Vignesh K");
		
		WebElement day=driver.findElement(By.name("birthday_day"));
		
		Select s1=new Select(day);
		
 	     s1.selectByIndex(31);
 	     
         WebElement mon=driver.findElement(By.name("birthday_month"));
		
		Select s2=new Select(mon);
		
 	     s2.selectByValue("8");
		
 	    WebElement year=driver.findElement(By.name("birthday_year"));
		
 	  		Select s3=new Select(year);
 	  		
 	   	     s3.selectByVisibleText("1992");  
 	  		
 	     
 	     
 	     driver.manage().window().maximize();
 	     
 	     String t= driver.getTitle();
 	      
 	      System.out.println(driver.getTitle());
 	            
 	              //or
 	      
 	     System.out.println(t);
 	     
 	  String Actual_result = t;
 	//or 
	//String Actual_result =  driver.getTitle();
 	
 	
 	String Expected_result = "Sign up for Facebook | Facebook";
 	
 	     
 	     
 	    if(Expected_result.equals(Actual_result)) {
 	    
 	    
 	    System.out.println("pass");}
 	    
 	    else {
 	    	System.out.println("fail");
 	    	
	}}

}
