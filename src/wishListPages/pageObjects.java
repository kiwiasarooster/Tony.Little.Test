package wishListPages;

import org.openqa.selenium.*;

public class pageObjects {

	   public static WebElement element = null;

  			// Click on element
	    
	  public static WebElement clickOnElment(WebDriver driver, By elementToClick) {
		    driver.findElement(elementToClick).click();
			return null;
	  }
  	
	  		// Return element

	   public static WebElement returnElement(WebDriver driver, By prodName) {
			element = driver.findElement(prodName);
			return element;
	   }

}
