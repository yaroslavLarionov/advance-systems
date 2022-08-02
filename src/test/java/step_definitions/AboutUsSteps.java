package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
}
