package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class HomePage {
    public HomePage(){ PageFactory.initElements(WebDriverManager.getDriver(), this);}

        @FindBy(className = "info-box-one")
          public WebElement contactinfo;

    }

