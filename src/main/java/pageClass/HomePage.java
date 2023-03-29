package pageClass;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "twotabsearchtextbox")
	WebElement txtSearch;

	@FindBy(how = How.ID, using = "nav-search-submit-button")
	WebElement btnSubmit;

	@FindBys(@FindBy(xpath = "//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/a/span"))
	List<WebElement> txtProductList;

	public void setSearchText(String text) {
		txtSearch.sendKeys(text);
	}

	public void clickSubmitButton() {
		btnSubmit.click();
	}

	public void getSearchResultProductList() {

		System.out.println("Number of Products in Search Result: " + txtProductList.size());

		for (int i = 0; i < txtProductList.size(); i++) {
			System.out.println("Product Name: " + txtProductList.get(i).getText());
		}
	}

	public void sleep() {
		try {
			Thread.sleep(5000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
