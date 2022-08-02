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


    @FindBy(xpath = "//div[contains (@class,'services-block-five')]//div[@class='text']")
    public List<WebElement> sectionDescrList;

    @FindBy(xpath = "//section[contains (@ class, 'working')]//h5")
    public WebElement subtitle;

    @FindBy(xpath = "//section[@class='feature-section sp-two']//div[@class='text']")
    public List<WebElement> whyUsDescriptionList;

    @FindBy(xpath = "//*[@class='link']//*[text()='Our Services']")
    public WebElement ourServicesBtn;

    @FindBy(xpath = "//*[@class='link']//*[text()='We are Recruitment Experts']")
    public WebElement recruitHeader;



}
