package steps;

import Pages.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utils.BrowserManager;
import utils.QaProps;
import utils.TestDataReader;

import java.util.HashMap;

public class StepDefinations{
    private WebDriver driver;
    HomePage homePage;

    String url;
    HashMap<String , String> data;
    Scenario scenario;
    public StepDefinations (BrowserManager browserManager)
    {
        this.driver = browserManager.getDriver();
    }
    @Before(order = 1)
    public void before(Scenario scenario){
        this.scenario = scenario;

    }

    @Given(": User is able to access the home page.")
    public void user_is_able_to_access_the_home_page() {
        System.out.println("User is able to access the home page");


    }

    @Given(": The user navigates to the home page")
    public void the_user_navigates_to_the_home_page() {
        url = QaProps.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());

    }
    @When(": the user enter the product name")
    public void the_user_enter_the_product_name() {
        homePage = new HomePage(driver);
        homePage.getSearchBox().sendKeys("Nykaa cosmetics");
        homePage.getSearchBox().sendKeys(Keys.ENTER);

    }
    @Then(": the products results should be displayed")
    public void the_products_results_should_be_displayed() {
        String text = homePage.getSearchResult().getText();
        Assert.assertEquals(text, "Nykaa cosmetics");

    }


    @When(": the user click on cart")
    public void the_User_Click_On_Cart() {

    }

    @Then(": User can successfully add a product to cart")
    public void user_Can_Successfully_Add_A_Product_To_Cart() {
    }

    @When(": the user clicks on searchbar and enters {string}")
    public void the_User_Clicks_On_Searchbar_And_Enters(String arg0) {

    }

    @Then(": Products gets displayed")
    public void products_Gets_Displayed() {
    }
}
