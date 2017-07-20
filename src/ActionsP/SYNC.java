package ActionsP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SYNC {

	private WebDriver driver;
	
	
	public SYNC(WebDriver driver) {
		this.driver=driver;
	}
//null timeout
	
	public void nullifyImplicitWait()
	{
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); //nullify implicitlyWait()
	}
	//implicty timeout depend on the parameter
	public void setImplicitWait(int waitTimeInSeconds)
	{
		driver.manage().timeouts().implicitlyWait(waitTimeInSeconds, TimeUnit.SECONDS);
	}
	
	public boolean isElementPresent(By locator, int waitTime)
	{    	
    	boolean bFlag = false;	
    	
    	//log.info("Waiting for presence of element " + locator);
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator)); 			
			if(driver.findElement(locator).isDisplayed()||driver.findElement(locator).isEnabled())
			{
				bFlag = true;
				//log.info("Element " + locator + " is displayed");
			}
		}		
		catch (NoSuchElementException e)
		{
			//log.info("Element " + locator + " was not found in DOM");			
		}
		catch (TimeoutException e)
		{
			//log.info("Element " + locator + " was not displayed in time - "+waitTime+UtilityMethods.getStackTrace());
		}
		catch (Exception e)
		{
			//log.error("Element " + locator + " is not displayed"+UtilityMethods.getStackTrace());
			
		}
		//setImplicitWait(IMPLICITWAIT);
		return bFlag;
	}
	
	public boolean isAlertPresent(int waitTime)
	{    	
    	boolean bFlag = false;	
    	nullifyImplicitWait();
    	//log.info("Waiting for presence of alert");
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			wait.until(ExpectedConditions.alertIsPresent());//presenceOfElementLocated(locator)); 			
			Alert alert=driver.switchTo().alert();
				bFlag = true;
			//	log.info("Alert with text '"+alert.getText()+"' is displayed");
		}		
		catch (NoAlertPresentException e)
		{
			//log.info("alert not present"+UtilityMethods.getStackTrace());			
		}
		catch (TimeoutException e)
		{
			//log.info("alert not present"+UtilityMethods.getStackTrace());
		}
		catch (Exception e)
		{
			//log.info("alert not present"+UtilityMethods.getStackTrace());
			
		}
	//	setImplicitWait(IMPLICITWAIT);
		return bFlag;
	}
	public boolean waitUntilClickable(By locator, int... optionWaitTime)
	{    	
		//int waitTime =  getWaitTime(optionWaitTime);
		boolean bFlag = false;
    	nullifyImplicitWait();
		try
		{
			//log.info("Waiting until element " + locator+" is clickable");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			 
			if(driver.findElement((locator)).isDisplayed())
			{
				bFlag = true;
				//log.info("Element " + locator + " is displayed and is clickable");
			}
		}
		
		catch (NoSuchElementException e)
		{
		//	log.error("Element " + locator + " was not displayed"+UtilityMethods.getStackTrace());
			
		}
		catch (TimeoutException e)
		{
			//log.error("Element " + locator + " was not clickable in time - "+waitTime+UtilityMethods.getStackTrace());
			
		}
		catch (Exception e)
		{
			//log.error("Element " + locator + " was not clickable"+"\n"+UtilityMethods.getStackTrace());		
	
		}
	//	setImplicitWait(IMPLICITWAIT);
		return bFlag;
	}
	
	 public boolean isElementPresent(By locator)
	    {
	    	//log.info("Waiting for presence of element " + locator);
	    	//setImplicitWait(IMPLICITWAIT);
	    	return driver.findElements(locator).size()>0;	
	    }
		
	    public boolean isElementDisplayed(By locator)
	    {
	    	//log.info("Verifying if element " + locator+ " is displayed");
	    	boolean isDisplayed = false;
	    	//setImplicitWait(IMPLICITWAIT);
	    	
	    	try
	    	{
	    		if(isElementPresent(locator))
		    	{
		    		isDisplayed = driver.findElement(locator).isDisplayed();	
		    	}
	    	} 
	 		catch (Exception e)
	 		{
	 		//	log.error("Exception occured while determining state of " + locator +UtilityMethods.getStackTrace());			
	 		}	
	    	return isDisplayed;
	    }
	    
	    public boolean isElementEnabled(By locator)
	    {
	    	//log.info("Verifying if element " + locator+ " is enabled");
	    	boolean isEnabled = false;
	    	//setImplicitWait(IMPLICITWAIT);
	    	try
	    	{
	    		if(isElementPresent(locator))
	        	{
	    			isEnabled = driver.findElement(locator).isEnabled();
	        	}
	    	} 
	 		catch (Exception e)
	 		{
	 		//	log.error("Exception occured while determining state of " + locator +UtilityMethods.getStackTrace());			
	 		}
	    	return isEnabled;
	    }
	    
	    public boolean isElementSelected(By locator)
	    {
	    	//log.info("Verifying if element " + locator+ " is selected");
	    	boolean isSelected = false;
	    	//setImplicitWait(IMPLICITWAIT);
	    	try
	    	{
	    		if(isElementPresent(locator))
	        	{
	    			isSelected = driver.findElement(locator).isSelected();
	           	}
	    	}
	 		catch (Exception e)
	 		{
	 			//log.error("Exception occured while determining state of " + locator +UtilityMethods.getStackTrace());	
	 		}
	    	return isSelected;
	    }

	
}
