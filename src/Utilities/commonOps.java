package Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.xml.sax.SAXException;

import com.relevantcodes.extentreports.LogStatus;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;



public class commonOps extends base
{
       public static void verifyElementExists(WebElement elem) throws ParserConfigurationException, SAXException, IOException
       {
    	   try
    	   {
    		   elem.isDisplayed();
    		   System.out.println("Element Exists !");
    		   test.log(LogStatus.PASS, "Element Exists !");
    	   }
    	   catch (Exception e)
    	   {
    		   System.out.println("Element NOT Exists !");
    		   test.log(LogStatus.FAIL, "Element NOT Exists !" , "see Screen Shot:" + test.addScreenCapture(takeSS()));
    		   fail("Element NOT Exists !");
    	   }
       }
       
       public static void verifyValueExists(WebElement elem , String expectedValue) throws ParserConfigurationException, SAXException, IOException
       {
    	   try
    	   {
    		   String actual = elem.getText();
    		   assertEquals(expectedValue, actual);
    		   System.out.println("Value Exists !");
    		   test.log(LogStatus.PASS, "Value Exists !");
    	   }
    	   catch (Exception e)
    	   {
    		   System.out.println("Value NOT Exists !" + e.getMessage());
    		   test.log(LogStatus.FAIL, "Element NOT Exists !" , "see Screen Shot:" + e.getMessage() + test.addScreenCapture(takeSS()));
    		   fail("Value NOT Exists !");
    	   }
    	   catch (AssertionError ae)
    	   {
    		   System.out.println("Assert Failed " +ae.getMessage());
    		   test.log(LogStatus.FAIL, "Assert Failed: " + ae.getMessage() + test.addScreenCapture(takeSS()));
    		   fail("Assert Failed !");
    	   }
       }
       
       public static void selectDropDown(WebElement elem, String valueLanguage) throws ParserConfigurationException, SAXException, IOException
       {
    	   try
    	   {  
    	       Select myValue = new Select (elem);
    	       myValue.selectByValue(valueLanguage);
		       System.out.println("Element Selected"); 
    		   test.log(LogStatus.PASS, "Element Selected");

    	   }
    	   catch (Exception e)
    	   {
    		   System.out.println("Element NOT Selected !");
    		   test.log(LogStatus.FAIL, "Element NOT Selected !" + e.getMessage() + test.addScreenCapture(takeSS()));
    		   fail("Element NOT Selected !");
    	   }
    	   
    	   
    	   }
       
        public static void verifyImageExists(String ImageName) throws ParserConfigurationException, SAXException, IOException
        {
    	   try
 	       {
 		        screen.find(getData("ImagePath") + ImageName);
 		        System.out.println("Element Exists !");
 		        test.log(LogStatus.PASS, "Element Exists !");
 	       }
 	       catch (Exception e)
 	      {
 		        System.out.println("Element NOT Exists !");
 		        test.log(LogStatus.FAIL, "Element NOT Exists !" , "see Screen Shot:" + test.addScreenCapture(takeSS()));
 		        fail("Element NOT Exists !");
 	   }
    	
     }
}

