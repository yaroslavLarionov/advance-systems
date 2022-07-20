package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }

    @FindBy(xpath = "//h2[contains (text(),'bright career')]")
    public WebElement ParallaxHeaderCareer;

    @FindBy(xpath = "//h2[contains (text(),'Big')]")
    public WebElement ParallaxHeaderThinkBig;


}
