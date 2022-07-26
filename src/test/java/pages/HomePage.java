package pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

//import java.util.List;

public class HomePage {


    @FindBy(xpath = "//div[contains(@class, 'header-lower')]//nav")
   public WebElement Button;


    public HomePage()
    { PageFactory.initElements(WebDriverManager.getDriver(), this);}


    @FindBy(xpath = "//div[@class='header-upper']")
    public WebElement upperHeader;

    @FindBy(xpath = "//strong[contains (text(), ',')]")
    public WebElement addressBlock;

    @FindBy(xpath = "//strong[contains (text(), '+')]")
    public WebElement phoneBlock;

    @FindBy(xpath = "//section[@class='services-section']//p")
    public WebElement descriptionTxt;

    @FindBy(xpath = "(//h2[@class='white-heading'])[1]")
    public WebElement ParallaxHeaderOne;

    @FindBy(xpath = "(//div[@class='tp-mask-wrap']//div[@class='text'])[1]")
    public WebElement HeaderOneTxt;

    @FindBy(xpath = "//section[contains (@class, 'testimonial')]//h2")
    public WebElement testimonialHeader;

    @FindBy(xpath = "//div[@class='page-wrapper']")
    public WebElement copyright;


    @FindBy(xpath = "//div[@class='nav-outer clearfix']")
    public WebElement navigationBar;

    @FindBy(xpath = "//div[@class='sticky-header']//nav[@class='main-menu']")
    public WebElement movableNavigationBar;


    @FindBy(xpath = "//*[@class='main-footer']")
    public WebElement footerSection;

    @FindBy(xpath = "//*[@class='scroll-to-top scroll-to-target']")
    public WebElement scrollUpButton;

    @FindBy(xpath = "//*[@class='header-top-one']")
    public WebElement topHeaderOne;

    @FindBy(xpath = "//*[@class='footer-copyright']")
    public WebElement footerCopyright;


}