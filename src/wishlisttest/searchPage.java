package wishlisttest;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class searchPage {

	   private static WebElement element = null;
	   
	   static By prodToClick = By.xpath("/html/body/form/div[6]/div/div[2]/div[3]/div/div/section/div[3]/div/div[1]/section[1]/article[4]/a/div[1]");

	   WebDriver driver = new FirefoxDriver();    

	   public static WebElement clickOnProd(WebDriver driver) {
			
	        // Click on a random product and go to product page
	    	element = driver.findElement(prodToClick);
			return element;
	   }
}
