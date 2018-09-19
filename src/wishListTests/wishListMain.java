package wishListTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//comment the line above and uncomment line below to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;

import wishListPages.pageObjects;
import wishListPages.testData;


public class wishListMain {

	 public static void main(String[] args) {
		       // declaration and instantiation of objects/variables
			  
			   // Uncomment the line below if using Firefox and Gecko is not in your system path.  Change path to the location of your Gecko install.
			   // System.setProperty("webdriver.firefox.marionette","C:\\Users\\OEM\\Documents\\Selenium\\gecko\\geckodriver.exe");
			   
			   // Suppress logs with warning
		   System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
		   
		   WebDriver driver = new FirefoxDriver();          
   	        
	        	// launch browser and direct it to the Base URL
	        driver.get(testData.baseUrl);

	        	// Click on a product and go to product page
	        pageObjects.clickOnElment(driver, testData.prodToClick);
	        
	        	// Wait for page to load
	    	 
	    	try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	        
	         	// Add product to Wish List
	        pageObjects.clickOnElment(driver, testData.addToList);

	        	// Wait for page to load
    	 
	    	try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	         
	    		// Click Wish List link and go to Wish List page
	        pageObjects.clickOnElment(driver, testData.goToWishList);
    
	         	// See if a value is returned and print result as "Passed" or "Failed"
	         
	         if (pageObjects.returnElement(driver, testData.prodName) != null){
	             System.out.printf("Test Passed! ");
	         } else {
	             System.out.println("Test Failed");
	         }   
	         
	         	//close browser
	         driver.close();
	       
	   }
  
}