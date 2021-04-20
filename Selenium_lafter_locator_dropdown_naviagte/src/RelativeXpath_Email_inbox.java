import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath_Email_inbox {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		//absolute X path
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("guruvicky077@gmail.com");
		
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		
		
		
	}

}
