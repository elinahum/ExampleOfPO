 package PageObjects;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.xml.sax.SAXException;

import com.relevantcodes.extentreports.LogStatus;

import Utilities.base;
import Utilities.commonOps;

public class mainPage extends base
{
	
	   public WebDriver driver;
	   
	   commonOps comOps = new commonOps();
	   
	   
	   @FindBy(id="searchInput")
	   public WebElement searchBox;
	   
	   @FindBy (id="searchLanguage")
	   public WebElement searchLanguge;
	   
	   @FindBy (css="button[type = 'submit']")
	   public WebElement searchButton;
	   
	 
	   public mainPage(WebDriver driver)
	   {
           this.driver = driver;
	   }
           
	   public void searchAction(String searchValue) throws ParserConfigurationException, SAXException, IOException
	   {
		   comOps.selectDropDown(searchLanguge, "simple");
		   searchBox.sendKeys(searchValue);
		   test.log(LogStatus.PASS, searchValue + " Inserted");
           searchButton.click();
    	   test.log(LogStatus.PASS, "Element Clicked");
	   }
}
