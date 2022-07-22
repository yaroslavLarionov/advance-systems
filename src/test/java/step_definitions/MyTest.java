package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyTest {
    @When("User clicks on {string} button")
    public void user_clicks_on_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should be able to see\"Home\" page is displayed")
    public void user_should_be_able_to_see_home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should be able to see {string} page is displayed")
    public void userShouldBeAbleToSeePageIsDisplayed(String arg0) {
    }
}