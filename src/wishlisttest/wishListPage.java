package wishlisttest;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wishListPage {

	   private static WebElement element = null;
	   
	   static By goToWishList = By.xpath("/html/body/form/div[5]/header/div[3]/div/div[2]/ul/li[2]/a/span");
	   static By prodName = By.xpath("/html/body/form/div[6]/div/div[2]/div[1]/section[2]/table/tbody/tr[1]/td[2]/a[2]/strong");

	   WebDriver driver = new FirefoxDriver();    

	   public static WebElement checkWishList(WebDriver driver) {
			
	         // Click Wish List link and go to Wish List page
			element = driver.findElement(goToWishList);
			return element;
	   }
		
	   public static WebElement verifyWishList(WebDriver driver) {
			
	         // Click Wish List link and go to Wish List page
			element = driver.findElement(prodName);
			return element;
	   }
}
