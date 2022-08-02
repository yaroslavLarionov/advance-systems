package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

import java.util.List;

public class AboutUsPage {

    public AboutUsPage() {
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }
    @FindBy(xpath = "//div[contains (@class, 'team-member-one')]//img")
    public List<WebElement> imagesList;

    @FindBy(xpath = "//div[contains (@class, 'team-member-one')]//div[@class='designation']")
    public List<WebElement> titlesList;

    @FindBy(xpath = "//div[contains (@class, 'team-member-one')]//div[@class='text']")
    public List<WebElement> descriptionList;

    @FindBy(xpath = "//div[@class='services-block-five col-lg-3 col-md-6 col-sm-12']")
    public static WebElement Header;

}
