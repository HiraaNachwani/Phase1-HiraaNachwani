package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commonClass.BaseTest;
import pageClass.HomePage;

public class ProductListPageTest extends BaseTest {

	WebDriver driver;
	String url = "https://www.amazon.in/";

	public void T01_verifyProductList(String browser) {

		driver = setDriver(browser);
		HomePage homePage = new HomePage(driver);

		// PageFactory is used to find elements with @FindBy specified
		PageFactory.initElements(driver, homePage);

		homePage.launchApplication(url);
		homePage.setSearchText("Iphone14");
		homePage.clickSubmitButton();
		homePage.getSearchResultProductList();
		homePage.sleep();
		homePage.quitDriver();

	}

}
