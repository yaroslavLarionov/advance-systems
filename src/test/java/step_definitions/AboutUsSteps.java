package step_definitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.AboutUsPage;
import pages.CommonPage;
import utils.SeleniumUtils;
import utils.WebDriverManager;


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

    @Then("User should see {string} header under Our Expert section")
    public void userShouldSeeHeader(String txt) {
        SeleniumUtils.moveIntoView(By.xpath(String.format(XPATH_TEMPLATE_TEXT, txt)));
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, txt))));
    }
    @Then("Verify {string} button is displayed")
    public void verifyButtonIsDisplayed(String btn) {
        SeleniumUtils.moveIntoView(By.xpath(String.format(XPATH_TEMPLATE_TEXT, btn)));
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, btn))));
    }
    @Then("Verify {string} button is clickable")
    public void verifyButtonIsClickable(String btn) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_TEXT, btn)));
    }
    @Then("Verify button redirects to {string} page")
    public void userShouldVerifyButtonRedirectsToCorrespondingPage(String page) {
        Assert.assertTrue(WebDriverManager.getDriver().getCurrentUrl().contains(page));
    }

    @Then("Verify {string} and {string} are displayed")
    public void verify_and_are_displayed(String section, String num) {
        boolean sectionIsDisplayed = WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, section)));
        boolean descriptionIsDisplayed = WebDriverManager.isDisplayed(aboutUsPage.whyUsDescriptionList.get(Integer.parseInt(num)));
        Assert.assertTrue(sectionIsDisplayed && descriptionIsDisplayed);
    }








}
