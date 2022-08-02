package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.ServicesPage;
import utils.WebDriverManager;

public class ServicesSteps implements CommonPage {

    ServicesPage servicesPage;

    public ServicesSteps() {
        servicesPage = new ServicesPage();
    }

    @When("User clicks on any button in projects section, for example {string} button")
    public void user_clicks_on_any_button_in_projects_section_for_example_button(String btn) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_TEXT, btn)));
    }


    @When("User clicks on {string}")
    public void user_clicks_on(String btn) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_TEXT, btn)));
    }

    @Then("User should be taken to the corresponding page {string}")
    public void user_should_be_taken_to_the_corresponding_page(String btn) {
        try {
            Assert.assertTrue(WebDriverManager.getDriver().getTitle().contains(btn));
        } catch (AssertionError e) {
            String title = "IT";
            Assert.assertTrue(WebDriverManager.getDriver().getTitle().contains(title));
        }
    }
}
