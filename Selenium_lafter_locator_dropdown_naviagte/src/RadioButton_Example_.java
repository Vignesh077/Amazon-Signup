import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_Example_ {
     
	static WebDriver  driver;
	public static void main(String[] args) {
	
		

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		
		driver.get("http://www.leafground.com/pages/radio.html");
		
		
	/*	List<WebElement> noOfButtonWIthTypeRadio	=driver.findElements(By.xpath("//input[@type='radio']"));
		
		int size=noOfButtonWIthTypeRadio.size();
		
		System.out.println(size);
		for(int i=0;i<=size;i++) {
			
			WebElement rad=noOfButtonWIthTypeRadio.get(i);
			
			System.out.println(rad.getAttribute("value"));*/
		
		WebElement below20	=driver.findElement(By.xpath("//input[contains(@value,'0')][contains(@name,'age')]" ));
			
		below20.click();                    
		
		
		// to check is previously selected 
		WebElement UncheckedButton	=driver.findElement(By.xpath("//input[contains(@value,'0')][contains(@name,'news')]" ));
		WebElement CheckedButton	=driver.findElement(By.xpath("//input[contains(@value,'1')][contains(@name,'news')]" ));
		
		boolean UCstatus= UncheckedButton.isSelected();
		
		boolean Cstatus= CheckedButton.isSelected();
		System.out.println(UCstatus);
		System.out.println(Cstatus);
		
	}

}
