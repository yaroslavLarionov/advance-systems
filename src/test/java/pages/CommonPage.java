package pages;

public interface CommonPage {

    String XPATH_TEMPLATE_BUTTON = "//div[contains(@class, 'header-lower')]//nav";
    String XPATH_TEMPLATE_LINKTEXT = "//a[text()='%s']";
    String XPATH_TEMPLATE_TEXT = "//*[text()='%s']";
    String XPATH_TEMPLATE_TEXT_CONTAINS = "//*[contains(text(), '%s')]";
    String XPATH_TEMPLATE_INPUT_FIELD = "//input[@placeholder='%s']";

}
