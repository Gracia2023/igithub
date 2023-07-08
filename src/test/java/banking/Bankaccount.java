package banking;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bankaccount {
WebDriver driver; 
	//launch browser 
	@Before
	public void init(){
	System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");	
	//create chrome object
	 driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://techfios.com/billing/?ng=login");
	
	}
	@Test
	public void logintest() {
		
	driver.findElement(By.className("form-control")).sendKeys("demo@techfios.com");	
	driver.findElement(By.id("password")).sendKeys("abc123");	
	driver.findElement(By.name("login")).click();	
		
		}
	@ Test
	public void access(){
		
		
		
	}
}
