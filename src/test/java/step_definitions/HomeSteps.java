package step_definitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import pages.CommonPage;
import pages.HomePage;
import utils.WebDriverManager;

public class HomeSteps implements CommonPage {
    HomePage homePage;

    public HomeSteps() {
        homePage = new HomePage();
    }

    @When("Information is displayed to the user in the parallax section")
    public void information_is_displayed_to_the_user_in_the_parallax_section() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homePage.ParallaxHeaderCareer));
    }
    @Then("Header and description content should update automatically")
    public void header_and_description_content_should_update_automatically() {
        if (WebDriverManager.isDisplayed(homePage.ParallaxHeaderThinkBig)) {
            Assert.assertFalse(homePage.ParallaxHeaderCareer.isDisplayed());
        } else {
            throw new NoSuchElementException("Element not visible");
        }
    }

    @When("User clicks on {string} button in parallax section")
    public void user_clicks_on_button_in_parallax_section(String btn) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, btn)));
    }
    @Then("User should see the {string} page displayed")
    public void user_should_see_the_page_displayed(String page) {
        Assert.assertTrue(WebDriverManager.getDriver().getTitle().contains(page));
    }

    @When("User clicks on {string} button")
    public void userClicksOnButton(String arg0) {
        
    }

    @Then("User should be able to see{string}page is displayed")
    public void userShouldBeAbleToSeePageIsDisplayed(String arg0) {
    }
}