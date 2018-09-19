package wishListPages;

import org.openqa.selenium.By;

public class testData {

// Change baseurl below to change between environments, e.g. Test, Staging, or Production 
	public static String baseUrl = "https://www.bunnings.com.au/search/products?q=paint&redirectFrom=Any";
	public static By prodToClick = By.xpath("/html/body/form/div[7]/div/div[2]/div[3]/div/div/section/div[3]/div/div[1]/section[1]/article[4]/a");
	public static By addToList = By.xpath("/html/body/form/div[7]/div/div[2]/div[1]/section/div/div[2]/div[3]/div[2]");
	public static By goToWishList = By.xpath("/html/body/form/div[5]/header/div[3]/div/div[2]/ul/li[2]/a/span");
	public static By prodName = By.xpath("/html/body/form/div[7]/div/div[2]/div[1]/section[2]/table/tbody/tr[1]/td[2]/a[2]");

}
