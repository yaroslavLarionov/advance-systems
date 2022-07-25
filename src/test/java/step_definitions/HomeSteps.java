package step_definitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HomePage;
import utils.SeleniumUtils;
import utils.WebDriverManager;

import java.util.List;


public class HomeSteps implements CommonPage {

    HomePage homePage;

    public HomeSteps() {
        homePage = new HomePage();
    }


    @When("User is browsing in the main navigation bar")
    public void user_is_browsing_in_the_main_navigation_bar() {
        SeleniumUtils.waitForElementVisibility(homePage.upperHeader);
    }

    @Then("Verify address is displayed")
    public void verify_address_is_displayed() {
        Assert.assertTrue(homePage.addressBlock.isDisplayed());
    }

    @Then("Verify phone is displayed")
    public void verify_phone_is_displayed() {
        Assert.assertTrue(homePage.phoneBlock.isDisplayed());
        }

    @When("User navigates to main header section")
    public void user_navigates_to_main_header_section() {
        SeleniumUtils.moveIntoView(homePage.descriptionTxt);
    }

    @Then("Verify header with {string} text is displayed")
    public void verify_header_with_text_is_displayed(String txt) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, txt))));
    }

    @Then("The description text under headers should be displayed as well")
    public void the_description_text_should_be_displayed_as_well() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homePage.descriptionTxt));
    }

    @When("Information is displayed to the user in the parallax section")
    public void information_is_displayed_to_the_user_in_the_parallax_section() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homePage.ParallaxHeaderOne));
    }
    @Then("Header and description content should update automatically")
    public void header_and_description_content_should_update_automatically() {
        SeleniumUtils.waitForElementVisibility(homePage.ParallaxHeaderOne);
        String descriptionTxtOne = homePage.HeaderOneTxt.getText();
        for (int i = 0; i < 16000; i++) {
            if (descriptionTxtOne.equals(homePage.HeaderOneTxt.getText()) && homePage.ParallaxHeaderOne.isDisplayed()) {
                SeleniumUtils.sleep(1000L);
            } else if (!descriptionTxtOne.equals(homePage.HeaderOneTxt.getText())){
                Assert.assertNotEquals(descriptionTxtOne, homePage.HeaderOneTxt.getText());
            } else {
                Assert.fail("Max wait time reached");
            }
            i += 1000;
        }
    }

    @When("User scrolls down page to testimonials section")
    public void user_scrolls_down_page_to_testimonials_section() {
        SeleniumUtils.moveIntoView(homePage.testimonialHeader);
    }
    @Then("This section should have a header {string}")
    public void this_section_should_have_a_header(String headerTxt) {
        Assert.assertEquals(homePage.testimonialHeader.getText(), headerTxt);
    }
    @Then("Testimonials information should be displayed with the message, person's name and the state")
    public void testimonials_information_should_be_displayed_with_the_message_person_s_name_and_the_state(List<String> data) {
        for (String each : data) {
            SeleniumUtils.waitForElementVisibility(By.xpath(String.format(XPATH_TEMPLATE_PERSON, each)));
            boolean nameAndStateDisplayed = WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_PERSON, each))).isDisplayed();
            boolean messageDisplayed = WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_PERSON_MESSAGE, each))).isDisplayed();
            Assert.assertTrue(nameAndStateDisplayed && messageDisplayed);
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


    @When("User open the home page")
    public void user_open_the_home_page() {
        WebDriverManager.getDriver();

    }

    @Then("title should be {string}")
    public void title_should_be(String title) {
      Assert.assertTrue(title.contains("Advance Systems - Home"));
    }


    @Then("Verify {string} link is displayed")
    public void verify_link_is_displayed(String linkName) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, linkName))));
    }

    @Then("Verify {string} link is displaed")
    public void verify_link_is_displaed(String linkLanguage) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, linkLanguage)));
    }

    @Then("Verify {string} are displayed")
    public void verify_are_displayed(String WhatToExpectItems) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, WhatToExpectItems)));
    }

    @Given("Secondary navigation bar is visible to the user")
    public void secondary_navigation_bar_is_visible_to_the_user() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homePage.navigationBar));
    }

    @Then("Navigation bar should remain visible")
    public void navigation_bar_should_remain_visible() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homePage.movableNavigationBar));
    }

    @Then("Verify navigation buttons are displayed")
    public void verify_navigation_bar_buttons_are_displayed(List<String> buttons) {
        for (String each : buttons) {
            Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_NAVIGATION_BUTTON, each))));
        }
    }

    @Then("Verify navigation {string} takes user to the corresponding page")
    public void verifyNavigationTakesUserToTheCorrespondingPage(String button) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_TEXT, button)));
        Assert.assertTrue(WebDriverManager.getDriver().getTitle().contains(button));
    }




}







