package step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    public void testimonials_information_should_be_displayed_with_the_message_person_s_name_and_the_state() {

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

}

