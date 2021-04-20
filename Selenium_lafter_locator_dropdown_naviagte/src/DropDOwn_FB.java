import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDOwn_FB {

	public static void main(String[] args) {
		  //Select class
		
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.partialLinkText("Create New Acc")).click();
		
		
		//to select drop down in day,month,year
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement day= driver.findElement(By.id("day"));
		
		
		Select s1=new Select(day);
		
		// it should return day
		
	
		WebElement selected_value1=s1.getFirstSelectedOption();
		System.out.println(selected_value1.getText());
		
		
		
		
		s1.selectByIndex(30);
		
	// it will return 31
		WebElement selected_value2=s1.getFirstSelectedOption();
		System.out.println(selected_value2.getText());
		
		WebElement month= driver.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByValue("8");
		
		WebElement year= driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByVisibleText("1992");
		
	List <WebElement> mon=s2.getOptions();
	
	int a=mon.size();
	System.out.println(a);
	
	for(int i=0;i<a;i++) {
		
		WebElement gett=mon.get(i);
		
	String st=	gett.getText();
	System.out.println(st);
	
	}
	
		
	
	
	}

}
