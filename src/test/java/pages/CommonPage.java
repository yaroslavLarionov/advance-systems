package pages;

public interface CommonPage {

    String XPATH_TEMPLATE_BUTTON = "//button[text()='%s']";
    String XPATH_TEMPLATE_LINKTEXT = "//a[text()='%s']";
    String XPATH_TEMPLATE_TEXT = "//*[text()='%s']";
    String XPATH_TEMPLATE_TEXT_CONTAINS = "//*[contains(text(), '%s')]";
    String XPATH_TEMPLATE_INPUT_FIELD = "//input[@placeholder='%s']";


    String XPATH_TEMPLATE_NAVIGATION_BUTTON = "//div[@class='sticky-header']//nav[@class='main-menu']//a[text()='%s']";
    String XPATH_TEMPLATE_PERSON = "//h3[text()='%s']/ancestor::div[contains (@class,'active')]";
    String XPATH_TEMPLATE_PERSON_MESSAGE = "//h3[text()='%s']/ancestor::section[contains (@class,'testimonial')]//div[contains (@class,'active')]";

    String XPATH_TEMPLATE_FOOTER_BUTTON = "//ul[@class='social-icon-six']//a[contains (@href,'%s')]";


}
