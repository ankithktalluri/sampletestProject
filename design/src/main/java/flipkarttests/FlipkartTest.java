package flipkarttests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import flipkartpages.FlipkartPage;

public class FlipkartTest {

	WebDriver driver;
	FlipkartPage fk;
	@BeforeTest
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void launchBrowser()
	{
		System.out.println("Chrome Browser is launched successful");
		 fk = new FlipkartPage(driver);
		 fk.clickClose();
		 fk.clickElectronicsBlueTooth();
		 fk.selectTheElement();
	}
	
	@AfterTest()
	public void close()
	{
		driver.close();
	}
}
