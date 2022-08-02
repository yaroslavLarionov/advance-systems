package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import okhttp3.internal.http2.Header;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AboutUsPage;
import pages.CommonPage;
import utils.SeleniumUtils;
import utils.WebDriverManager;

import java.util.List;

public class AboutUsSteps implements CommonPage {

    AboutUsPage aboutUsPage;

    public AboutUsSteps() {
        aboutUsPage = new AboutUsPage();
    }

    @When("User scrolls down to {string} section")
    public void user_scrolls_down_to_section(String headerTxt) {
        SeleniumUtils.moveIntoView(By.xpath(String.format(XPATH_TEMPLATE_TEXT, headerTxt)));
    }

    @When("User should see {string} header")
    public void user_should_see_header(String headerTxt) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, headerTxt))));
    }

    @Then("User should see a picture, title and a quote of each team member")
    public void user_should_see_a_picture_title_and_a_quote_of_each_team_member() {
        for (int i = 0; i < aboutUsPage.imagesList.size(); i++) {
            Assert.assertTrue(WebDriverManager.isDisplayed(aboutUsPage.imagesList.get(i)));
            Assert.assertTrue(WebDriverManager.isDisplayed(aboutUsPage.titlesList.get(i)));
            Assert.assertTrue(WebDriverManager.isDisplayed(aboutUsPage.descriptionList.get(i)));
        }
    }

    @When("User clicks on social media {string}")
    public void user_clicks_on_social_media(String btn) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_MEDIA_LINKS, btn))).click();
    }

    @Then("Verify {string} takes user to the corresponding page")
    public void verify_takes_user_to_the_corresponding_page(String btn) {
        try {
            Assert.assertTrue(WebDriverManager.getDriver().getTitle().toLowerCase().contains(btn));
        } catch (AssertionError e) {
            SeleniumUtils.sleep(2000L);
            Assert.assertTrue(WebDriverManager.getDriver().getTitle().toLowerCase().contains(btn));
        }
    }

    @When("User scrolls down to {string} header")
    public void userScrollsDownToHeader(String subtitle) {
        SeleniumUtils.moveIntoView(aboutUsPage.subtitle);
    }

    @Then("Verify {string} and {string} are displayed in that area")
    public void verify_and_are_displayed_in_that_area(String section, String text) {
        boolean sectionIsDisplayed = WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, section)));
        boolean textIsDisplayed = WebDriverManager.isDisplayed(aboutUsPage.sectionDescrList.get(Integer.parseInt(text)));
        Assert.assertTrue(sectionIsDisplayed && textIsDisplayed);
    }
}
