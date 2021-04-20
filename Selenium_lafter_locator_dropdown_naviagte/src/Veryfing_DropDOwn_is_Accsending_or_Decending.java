import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Veryfing_DropDOwn_is_Accsending_or_Decending {

	public static void main(String[] args) {
		
		
		//Not clear
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
		
		// there is two drop down one is assending and another is random
		
		
	//WebElement dropdown1=	driver.findElement(By.id("tools"));
	
		WebElement dropdown1=	driver.findElement(By.xpath("//select[@id='tools']"));
		Select s1=new Select(dropdown1);
		
		//s1.selectByIndex(2);
		
		List actualList=new ArrayList();
		List<WebElement> gett=s1.getOptions();
		
		for(WebElement ele:gett) {
			
			String data=ele.getText();
			
			actualList.add(data);
		}
		
		List temp=new ArrayList();
		
		temp.addAll(actualList);
		//Ascending
		Collections.sort(temp);
		
		Assert.assertTrue(actualList.equals(temp));
		
		
	//	System.out.println(gett);
		
		
	}

}
