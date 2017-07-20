package ActionsP;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class SafeActions extends SYNC {

	static WebDriver driver;
	
	public SafeActions(){
		super(driver);
		driver = new FirefoxDriver();
		
	}
	
	public void safeClick(By locator, int... optionWaitTime){
		try
		{
			WebElement element = driver.findElement(locator);
			element.click();
		}
		catch(StaleElementReferenceException e)
		{
			//log.error("Element with " + locator + " is not attached to the page document");
		}
		catch(NoSuchElementException e)
		{
			//log.error("Element " + locator + " was not found in DOM");
		}
		catch(Exception e)
		{
			//log.error("Element " + locator + " was not clickable");
		}
	}
	
	public void safeActionsClick(By locator,int waitTime){
		try
		{
			WebElement element=driver.findElement(locator);
	    
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element).click().build().perform();
		}
		catch(StaleElementReferenceException e)
		{
			//log.error("Element with " + locator + " is not attached to the page document");
		}
		catch(NoSuchElementException e)
		{
			//log.error("Element " + locator + " was not found in DOM");
		}
		catch(Exception e)
		{
			//log.error("Element " + locator + " was not clickable");
		}
	
	}
	public void safeDblClick(By locator, int... optionWaitTime){
		try
		{
			WebElement element=driver.findElement(locator);
	    
			Actions userAction = new Actions(driver).doubleClick(element);
			userAction.build().perform();
		}
		catch(StaleElementReferenceException e)
		{
			//log.error("Element with " + locator + " is not attached to the page document");
		}
		catch(NoSuchElementException e)
		{
			//log.error("Element " + locator + " was not found in DOM");
		}
		catch(Exception e)
		{
			//log.error("Element " + locator + " was not clickable");
		}
	}
	public void safeClearAndType(By locator, String text, int... optionWaitTime){
		try
		{
			WebElement element=driver.findElement(locator);
	    
			element.clear();
			element.sendKeys(text);
		}
		catch(StaleElementReferenceException e)
		{
			//log.error("Element with " + locator + " is not attached to the page document");
		}
		catch(NoSuchElementException e)
		{
			//log.error("Element " + locator + " was not found in DOM");
		}
		catch(Exception e)
		{
			//log.error("Element " + locator + " was not clickable");
		}
	
	}
	public void safeType(By locator, String text, int... optionWaitTime){
		try
		{
			WebElement element=driver.findElement(locator);
			element.sendKeys(text);
		}
		catch(StaleElementReferenceException e)
		{
			//log.error("Element with " + locator + " is not attached to the page document");
		}
		catch(NoSuchElementException e)
		{
			//log.error("Element " + locator + " was not found in DOM");
		}
		catch(Exception e)
		{
			//log.error("Element " + locator + " was not clickable");
		}
	
	
	}
	public void safeSelectRadioButton(By locator, int... optionWaitTime){
		try
		{
			WebElement element=driver.findElement(locator);
			element.click();
		}
		catch(StaleElementReferenceException e)
		{
			//log.error("Element with " + locator + " is not attached to the page document");
		}
		catch(NoSuchElementException e)
		{
			//log.error("Element " + locator + " was not found in DOM");
		}
		catch(Exception e)
		{
			//log.error("Element " + locator + " was not clickable");
		}
	}
	public void safeCheck(By locator, int... optionWaitTime){
		try
		{
			WebElement checkBox = driver.findElement(locator);
			
			if(checkBox.isSelected()){
				//log.info("CheckBox " + locator + "is already selected");
			}
			else
				checkBox.click();
		}
		catch(StaleElementReferenceException e)
		{
			//log.error("Element with " + locator + " is not attached to the page document");
		}
		catch(NoSuchElementException e)
		{
			//log.error("Element " + locator + " was not found in DOM");
		}
		catch(Exception e)
		{
			//log.error("Element " + locator + " was not clickable");
		}
	}
	
	
	
}
