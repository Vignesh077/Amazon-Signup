import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap {

	
	//Bootstrap dropdown
	public static void main(String[] args) {
		
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	WebElement Tuto=driver.findElement(By.xpath("//button[@id='menu1']"));
		
		Tuto.click();
		
		 List<WebElement> ele=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
	
		int number= ele.size();
		
		System.out.println(number);
		
		 for(int i=0;i<number;i++) {
			 
				WebElement gett= ele.get(i);
				
			String st=	gett.getAttribute("innerHTML");
		
		System.out.println(st);
		
		
		if(st.contentEquals("JavaScript")) {
			
			gett.click();
			break;
		
	}

}}}
