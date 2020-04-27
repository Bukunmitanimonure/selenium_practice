package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static WebDriver driver = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-workspace\\Tutorial\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://web.facebook.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("Facebook")){
			System.out.println("Title matches");
		}else{
				System.out.println("Title does not match");
		}
		
//		WebElement FirstName = driver.findElement(By.name("firstname"));
//		FirstName.sendKeys("Opeyemi");
	}
	
	public static void SignUp (){
		
		
	}

}
