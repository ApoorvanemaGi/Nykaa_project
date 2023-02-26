package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    private WebDriver driver;

    public HomePage( WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }
    public WebElement getSearchBox() {
        return searchBox;
    }
    public WebElement getSearchResult() {
        return searchResult;
    }


    @FindBy(xpath = "//input[@class=\"css-1upamjb\"]")
    WebElement searchBox;

    @FindBy(xpath = "//h1[@class=\"page-title-search\"]")
    WebElement searchResult;

    @FindBy(xpath = "//a[@class=\"css-1mavm7h\"]")
    WebElement searchBrand;

    public WebElement getSearchBrand() {
        return searchBrand;
    }
    @FindBy(xpath = "//input[@placeholder=\"search brands\"]")
    WebElement searchBrandResult;

    public WebElement getSearchBrandResult() {
        return searchBrandResult;
    }
}

