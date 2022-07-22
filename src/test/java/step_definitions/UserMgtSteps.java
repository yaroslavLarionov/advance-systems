package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.UserMgtPage;
import utils.SeleniumUtils;
import utils.WebDriverManager;

import java.util.List;

public class UserMgtSteps implements CommonPage {
    UserMgtPage userMgtPage;

    public UserMgtSteps() {

        userMgtPage = new UserMgtPage();
    }
    @When("user should scroll to Welcome page")
    public void usershouldscrolltowelcomepage() {
        SeleniumUtils.moveIntoView(userMgtPage.Welcome);
    }

    @When("Verify Main header is displayed")
    public void VerifyMainheaderisdisplayed() {
        Assert.assertTrue(WebDriverManager.isDisplayed(UserMgtPage.Main));
    }

    @Then("Print Header")
    public void PrintHeader() {
        if (WebDriverManager.isDisplayed(UserMgtPage.Main)) {
            System.out.println("print header");
        }
    }

    @When("Header is displyed to the user")
    public void Headerisdisplyedtotheuser() {
        Assert.assertTrue(WebDriverManager.isDisplayed(UserMgtPage.Header));
    }
        @Then("Header should print")
        public void Headershouldprint() {
            if (WebDriverManager.isDisplayed(UserMgtPage.Header)) {
                System.out.println("print header");
            }
        }
}

