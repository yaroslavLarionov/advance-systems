package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
            } else if (!descriptionTxtOne.equals(homePage.HeaderOneTxt.getText())) {
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


    @When("User clicks on {string} button")
    public void user_clicks_on_button(String btn) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, btn)));
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
        Assert.assertEquals(WebDriverManager.getDriver().getTitle(), title);

    }

    @Then("Verify {string} link is displayed")
    public void verify_link_is_displayed(String linkName) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, linkName))));
    }

    @Then("Verify {string} link is enabled")
    public void verify_link_is_enabled(String linkLanguage) {
        // WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, linkLanguage)));
        WebDriverManager.getDriver().findElement(By.xpath("//a[@id='dropdownMenu1']")).click();

    }

    @When("user clicks on {string} button")
    public void user_clicks_on_button1(String pageLink) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, pageLink)));
    }

    @When("User switches to the next window")
    public void user_switches_to_the_next_window() {
        SeleniumUtils.switchToNextWindow();

    }

    @Then("Verify {string} are displayed")
    public void verify_are_displayed(String WhatToExpectItems) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, WhatToExpectItems))));
    }


    @When("User scrolls down to {string}")
    public void user_scrolls_down_to(String btn) {
        SeleniumUtils.moveIntoView(WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, btn))));
    }

    @Then("Verify email box with placeholder {string} is displayed")
    public void verify_email_box_with_placeholder_is_displayed(String text) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, text))));
    }

    @Given("Secondary navigation bar is visible to the user")
    public void secondary_navigation_bar_is_visible_to_the_user() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homePage.navigationBar));
    }


    @When("User navigates to footer section")
    public void User_navigates_to_footer_section() {
        SeleniumUtils.moveIntoView(homePage.copyright);
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

    @Then("Verify button is displayed")
    public void verify_button_is_displayed(List<String> buttons) {
        for (String each : buttons) {
            Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_FOOTER_BUTTON, each))));
        }
    }

    @Then("User should see corresponding page displayed after clicking that button")
    public void user_should_see_corresponding_page_displayed_After_clicking_that_button(List<String> buttons) {
        for (String each : buttons) {
            WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_FOOTER_BUTTON, each)));
            SeleniumUtils.switchToNextWindow();
            try {
                Assert.assertTrue(WebDriverManager.getDriver().getTitle().toLowerCase().contains(each));
            } catch (AssertionError e) {
                SeleniumUtils.sleep(2000L);
                Assert.assertTrue(WebDriverManager.getDriver().getTitle().toLowerCase().contains(each));
            }
            SeleniumUtils.switchToParticularWindow(homePage.homePageTitle);
        }
    }


    @Then("Verify title with {string} text is displayed")
    public void verifyTitleWithTextIsDisplayed(String updated) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, updated))));
    }

    @Then("Verify company names are displayed")
    public void verifyCompanyNamesAreDisplayed() {
        List<WebElement> companyName = WebDriverManager.getDriver().findElements(By.xpath("//div[contains(@class,'active')]//*[@class='item']"));
        for (WebElement each : companyName) {
            Assert.assertTrue(WebDriverManager.isDisplayed(each));
        }
    }

    @When("User navigates to copyright section")
    public void user_navigates_to_copyright_section() {
        SeleniumUtils.moveIntoView(homePage.footerCopyright);
    }

    @Then("Verify scroll up button is displayed")
    public void verifyScrollUpButtonIsDisplayed() {
        SeleniumUtils.waitForElementVisibility(homePage.scrollUpButton);
        Assert.assertTrue(WebDriverManager.isDisplayed(homePage.scrollUpButton));
    }

    @Then("User clicks on scroll up button")
    public void userClicksOnScrollUpButton() {
        WebDriverManager.click(homePage.scrollUpButton);
    }

    @Then("Verify window is scrolled up to show top content")
    public void verifyWindowIsScrolledUpToTopContent() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homePage.topHeaderOne));

    }

        @When("User scrolls down to footer")
        public void user_scrolls_down_to_footer () {
            SeleniumUtils.moveIntoView(homePage.footerSection);
        }

        @Then("Verify following {string} and {string} is displayed")
        public void verify_following_and_is_displayed (String string, String num){
            String actualCI = WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_FOOTER_CINFO, num))).getText().trim();
            Assert.assertEquals(string.trim(), actualCI);
        }

        @When("User clicks on {string} button of that page")
        public void user_clicks_on_button_of_that_page (String link){
            WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_FOOTER_LINKTEXT, link)));
        }

        @Then("Verify {string} work as expected")
        public void verify_work_as_expected (String link){
            Assert.assertTrue(WebDriverManager.getDriver().getTitle().contains(link));
        }


    @Given("User verifies {string} buttons are displayed in main menu")
    public void verifyButtonsAreDisplayedInMainMenu(String btn) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_SOCIAL_MEDIA, btn))));
    }

    @Then("User clicks {string} button")
    public void userClicksButton(String btn) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_SOCIAL_MEDIA, btn)));
    }

    @Then("Verify {string} button redirects to corresponding page")
    public void verifyButtonToCorrespondingPage(String btn) {
        Assert.assertTrue(WebDriverManager.getDriver().getCurrentUrl().contains(btn));
    }
}











>>>>>>> master
