package wishlisttest;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pageObjects {

	   private static WebElement element = null;
	   
	   	static By prodToClick = By.xpath("/html/body/form/div[6]/div/div[2]/div[3]/div/div/section/div[3]/div/div[1]/section[1]/article[4]/a/div[1]");
		static By addToList = By.xpath("/html/body/form/div[6]/div/div[2]/div[1]/section/div/div[2]/div[3]/div[2]");
		static By goToWishList = By.xpath("/html/body/form/div[5]/header/div[3]/div/div[2]/ul/li[2]/a/span");
		static By prodName = By.xpath("/html/body/form/div[6]/div/div[2]/div[1]/section[2]/table/tbody/tr[1]/td[2]/a[2]/strong");

		WebDriver driver = new FirefoxDriver();    

		public static WebElement clickOnProd(WebDriver driver) {
		
	        // Click on a random product and go to product page
	    	element = driver.findElement(prodToClick);
			return element;
		}
		
		
		public static WebElement addToWishList(WebDriver driver) {
			
	         // Add product to Wish List
			element = driver.findElement(addToList);
			return element;
		}
			

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

