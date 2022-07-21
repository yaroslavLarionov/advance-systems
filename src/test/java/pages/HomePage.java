package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class HomePage {
    public HomePage(){ PageFactory.initElements(WebDriverManager.getDriver(), this);}


    @FindBy(className = "info-box-one")
    public WebElement contactinfo;

    @FindBy(xpath = "(//h2[@class='white-heading'])[1]")
    public WebElement ParallaxHeaderOne;

    @FindBy(xpath = "(//div[@class='tp-mask-wrap']//div[@class='text'])[1]")
    public WebElement HeaderOneTxt;

    @FindBy(xpath = "//section[contains (@class, 'testimonial')]//h2")
    public WebElement testimonialHeader;


}