package pages;

import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class ServicesPage {

    public ServicesPage() {
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }


}
