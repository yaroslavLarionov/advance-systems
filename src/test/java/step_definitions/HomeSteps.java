package step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import pages.CommonPage;
import pages.HomePage;
import utils.SeleniumUtils;
import utils.WebDriverManager;

public class HomeSteps implements CommonPage {
    HomePage homePage;

    public HomeSteps() {
        homePage = new HomePage();
    }

    @When("Information is displayed to the user in the parallax section")
    public void information_is_displayed_to_the_user_in_the_parallax_section() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homePage.ParallaxHeaderOne));
    }
    @Then("Header and description content should update automatically")
    public void header_and_description_content_should_update_automatically() {
        for (int i = 1; i < 4; i++) {
            if (i == 1) {
                Assert.assertTrue(WebDriverManager.isDisplayed(homePage.ParallaxHeaderOne));
            } else if (i == 2) {
                SeleniumUtils.sleep(10000L);
                Assert.assertTrue(WebDriverManager.isDisplayed(homePage.ParallaxHeaderTwo));
            } else {
                SeleniumUtils.sleep(10000L);
                Assert.assertTrue(WebDriverManager.isDisplayed(homePage.ParallaxHeaderOne));
            }
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


}