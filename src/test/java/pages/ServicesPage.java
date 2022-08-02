package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class ServicesPage {

    public ServicesPage() {
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }

    @FindBy(xpath = "//strong[text()='Call Us:']/ancestor::div[@class='info-box-three']")
    public WebElement divisionsPhone;

    @FindBy(xpath = "//strong[text()='Address:']/ancestor::div[@class='info-box-three']")
    public WebElement divisionsAddress;
}
