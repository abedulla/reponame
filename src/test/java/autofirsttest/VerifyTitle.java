package autofirsttest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class VerifyTitle {
	
	public final String baseUrl ="https://overapi.com/java";
	public final String chromepath = "D:\\chromedriver_win32\\chromedriver.exe";
	public WebDriver wd;
	
	@BeforeTest
	void beforetest()
	{
		
	}
	
		@SuppressWarnings("deprecation")
		@Test
		public void validationtest()
		{
			System.setProperty("webdriver.chrome.driver", chromepath);
			wd=new ChromeDriver();
			wd.get(baseUrl);
			wd.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
			wd.manage().window().maximize();
			String expecttitle = "Java Cheat Sheet | OverAPI.com";
			String actualtitle = wd.getTitle();
			Assert.assertEquals(actualtitle, expecttitle);
		}
		@AfterTest
		void aftertest() 
		{
			System.out.println("aftertest");
		}
}
