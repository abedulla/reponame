package autofirsttest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MavenTest {

	public final String baseURL ="https://www.techlistic.com/p/selenium-practice-form.html";
	public String ChromePath = "D:\\chromedriver_win32\\chromedriver.exe";
	public WebDriver wd;
	
	
	@SuppressWarnings("deprecation")
	@Test
	 public void testopenpage()
	 {
		System.out.println("Logger");
		System.setProperty("webdriver.chrome.driver",ChromePath);//tell program to use chromedriver using chromepath//
		wd =new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
		wd.manage().window().maximize();
		wd.get(baseURL);
	 }
	
	@BeforeTest
	public void PreReq()
	{
		
		System.out.println("before test");
	}
	@AfterTest
	public void cleanup()
	{
		System.out.println("aftertest");
	}
}

