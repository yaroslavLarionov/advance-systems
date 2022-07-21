package step_definitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import pages.HomePage;
import utils.WebDriverManager;

public class HomeSteps implements CommonPage {

    HomePage homePage;

    public HomeSteps() {
        homePage = new HomePage();
    }

    @When("Verify user can see address")
    public void verify_user_can_see_address() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homePage.contactinfo));
    }

    @Then("address should print")
    public void addressshouldprint() {
        if (WebDriverManager.isDisplayed(homePage.contactinfo)) {
            System.out.println("print address");
        }
    }
}