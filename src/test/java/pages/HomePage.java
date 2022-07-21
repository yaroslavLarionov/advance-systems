package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }

    @FindBy(xpath = "(//h2[@class='white-heading'])[1]")
    public WebElement ParallaxHeaderOne;

    @FindBy(xpath = "(//h2[@class='white-heading'])[2]")
    public WebElement ParallaxHeaderTwo;


}
