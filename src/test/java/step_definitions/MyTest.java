package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.WebDriverManager;

import static pages.CommonPage.XPATH_TEMPLATE_BUTTON;
import static pages.CommonPage.XPATH_TEMPLATE_TEXT_CONTAINS;

public class MyTest {

    @Then("Verify {string} links are displayed")
    public void verifyLinksAreDisplayed(String Buttons) {

        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_BUTTON,Buttons))));
}}