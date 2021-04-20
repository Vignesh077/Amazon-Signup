import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox_Example {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		
		//to click VB
		WebElement VBbutton=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[2]/input"));
		VBbutton.click();                                 ///html/body/div/div/div[3]/section/div[1]/div[2]/input
		
		// to check Selenium button selecetd or not
		WebElement seleniumbutton=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/input"));
		boolean sele=seleniumbutton.isSelected();
		
		System.out.println(sele);
		
		// Deselct the previously selected button
		
		WebElement notSelectedbutton=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[1]/input"));
		WebElement iAmSelectedbutton=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[2]/input"));
	
		boolean isalreadyselected=notSelectedbutton.isSelected();
		if(isalreadyselected==true) {
			
			notSelectedbutton.click();	
		}
		boolean isalreadyselected1=iAmSelectedbutton.isSelected();
        if(isalreadyselected1==true) {
			
        	iAmSelectedbutton.click();	
		}
		
	}
}
