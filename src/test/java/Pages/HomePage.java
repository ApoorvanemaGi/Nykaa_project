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

    @FindBy(xpath = "//ul[@class=\"HeaderNav css-f7ogli\"][1]")
    WebElement searchBrand;

    public WebElement getSearchBrand() {
        return searchBrand;
    }
    @FindBy(xpath = "//input[@placeholder=\"search brands\"]")
    WebElement searchBrandResult;

    public WebElement getSearchBrandResult() {
        return searchBrandResult;
    }
    @FindBy(xpath = "//ul[@class=\"HeaderNav css-f7ogli\"]")
    WebElement clickNykaaFashion;

    public WebElement getClickNykaaFashion() {
        return clickNykaaFashion;
    }
    @FindBy(xpath = "//div[@class=\"css-vqypwr\"]")
    WebElement searchNykaaFashion;

    public WebElement getSearchNykaaFashion() {
        return searchNykaaFashion;
    }
}

