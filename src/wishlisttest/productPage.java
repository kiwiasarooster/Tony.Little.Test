package wishlisttest;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class productPage {

	   private static WebElement element = null;
	   
	   static By addToList = By.xpath("/html/body/form/div[6]/div/div[2]/div[1]/section/div/div[2]/div[3]/div[2]");

	   WebDriver driver = new FirefoxDriver();    

	   public static WebElement addToWishList(WebDriver driver) {
			
	         // Add product to Wish List
			element = driver.findElement(addToList);
			return element;
	   }
			
}
