package customer1;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
 WebDriver driver;
	@Before
	public void init(){
System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");	 
WebDriver driver = new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
// go to  the website
driver.get("https://objectspy.space/login");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}

	//create a login method
	@Test
	public void login() {
	driver.findElement(By.name("firstname")).sendKeys("selenium");
	driver.findElement(By.id("sex-1")).click();	
		
	}
	
	
	
}
