package flipkartpages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FlipkartPage {
	
	WebDriver driver;
	//locators
	By closeBtn = By.xpath("//button[text()='✕']");
	By electronicsBtn=By.xpath("//div[text()='Electronics']");
	By blueToothBtn = By.xpath("//a[text()='Bluetooth Headphones']");
	By listElements=By.xpath("//div[@class='_4ddWXP']");
	
	public FlipkartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickClose()
	{
		WebElement closeLnk=driver.findElement(closeBtn);
		if(closeLnk.isDisplayed())
		{
			closeLnk.click();
		}
		
	}
	
	public void clickElectronicsBlueTooth()
	{
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(electronicsBtn)).build().perform();
		driver.findElement(blueToothBtn).click();
		
	}
	public void clickBlueTooth()
	{
		driver.findElement(blueToothBtn).click();
	}
	public void selectTheElement()
	{
		List<WebElement> listAll=driver.findElements(listElements);
		String name =listAll.get(0).getAttribute("textContent");
		System.out.println(name);
		boolean str=name.contains("AdAroma NB120B Dhoom");
		System.out.println(str);
		Assert.assertTrue(str);
		
	}

}
