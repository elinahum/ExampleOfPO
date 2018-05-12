package PageObjects;

import org.openqa.selenium.support.PageFactory;

import Utilities.base;

public class managePages extends base
{
  public static void init()
  {
    mp = PageFactory.initElements(driver, mainPage.class);
	sr = PageFactory.initElements(driver, searchResults.class);
  }
}
