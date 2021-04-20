import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button_Elementwithsameattributevalue_forloop_if {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

		
	List<WebElement> one=	driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		
	int number=one.size();
	
	System.out.println(number);
		
	
	for(int i=0;i<number;i++) {
		
	WebElement gett =one.get(i)	;
	
	String val=gett.getAttribute("value");
	
	System.out.println(val);	
	
		if(val.equalsIgnoreCase("ruby")) {
			
			gett.click();
			
			
			List<WebElement> two=driver.findElements(By.xpath("//input[@name='lang']"));
			
		int num=	two.size();
		
		System.out.println(num);
		
		for(int i1=0;i1<num;i1++) {
			
			WebElement gettt=two.get(i1);
			
		String id=	gettt.getAttribute("id");
		
		
		System.out.println(id);
		
		if(id.equalsIgnoreCase("code")) {
		
		gettt.click();
		
		
		}
		
		
		
		
	}
		
		
	}

}}}
