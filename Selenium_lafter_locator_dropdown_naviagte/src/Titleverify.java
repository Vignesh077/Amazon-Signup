import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverify {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        
        driver.get("https://www.facebook.com");
        
       System.out.println( driver.getTitle());
        
        
    String  ET="Facebook – log in or sign ";
    String  AT=driver.getTitle();
    
    

    
  
    /*if (ET.equals(AT)) {
    System.out.println( "pass");}
    
    else {
    	
    	 System.out.println( "fail");}*/
    
	}

}
