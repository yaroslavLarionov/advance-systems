package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class UserMgtPage {

    public UserMgtPage(){
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }

    @FindBy(className="page-wrapper")
    public static WebElement Welcome;

    @FindBy(xpath = "//section[contains(@class, 'services')]//h2")
    public static WebElement Main;

    @FindBy(className= "row")
    public static WebElement Header;
}
