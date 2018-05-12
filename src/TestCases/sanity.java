package TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.SAXException;

import PageObjects.mainPage;
import PageObjects.searchResults;
import Utilities.base;
import Utilities.commonOps;


public class sanity extends base
{	  
	
 	//WebDriverWait wait = new WebDriverWait(driver, 10);
 	
	@Test
	public void test01_VerifySeleniumWebDriverNotExistsinWikipedia() throws ParserConfigurationException, SAXException, IOException
	{
	   	//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("searchInput")));
	   	commonOps.verifyImageExists("wikiheader.PNG");
		mp.searchAction("Selenium WebDriver");
		commonOps.verifyElementExists(sr.searchResult);
		commonOps.verifyValueExists(sr.searchResult , "There were no results matching the query.");

	}
	@Test
	public void test02_ShouldFail() throws ParserConfigurationException, SAXException, IOException
	{
		mp.searchAction("Selenium WebDriver");
	}

}
