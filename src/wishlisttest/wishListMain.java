package wishlisttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//comment the line above and uncomment line below to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;

public class wishListMain {

	 private static WebDriver driver = null;
	 
	 public static void main(String[] args) {
	       // declaration and instantiation of objects/variables
		  
		   // Uncomment the line below if using Firefox and Gecko is not in you system path.  Change path to the location of your Gecko install.
		   // System.setProperty("webdriver.firefox.marionette","C:\\Users\\OEM\\Documents\\Selenium\\gecko\\geckodriver.exe");
		   
		   // Suppress logs with warning
		   System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
		   
		   driver = new FirefoxDriver();
	       
		   // Change baseurl below to change between environments, e.g. Test, Staging, or Production 
	        String baseUrl = "https://www.bunnings.com.au/search/products?q=paint&redirectFrom=Any";
		   	        
	        // launch browser and direct it to the Base URL
	        driver.get(baseUrl);

	        // Click on a random product and go to product page
	        pageObjects.clickOnProd(driver).click();
	        
	        // Wait for page to load
	    	 
	    	try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	        
	         // Add product to Wish List
	    	pageObjects.addToWishList(driver).click();

	        // Wait for page to load
    	 
	    	try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	         
	    	// Click Wish List link and go to Wish List page
	    	pageObjects.checkWishList(driver).click();
	              
	         /*
	          * compare the wish list with the expected one and print
	          * the result as "Passed" or "Failed"
	         */
	         if (pageObjects.verifyWishList(driver) != null){
	             System.out.println("Test Passed!");
	         } else {
	             System.out.println("Test Failed");
	         }   
	         
	         //close browser
	         driver.close();
	       
	   }  
	    
}