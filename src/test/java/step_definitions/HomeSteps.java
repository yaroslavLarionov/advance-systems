package step_definitions;

import pages.CommonPage;
import pages.HomePage;

public class HomeSteps implements CommonPage {
    HomePage homePage;

    public HomeSteps() {
        homePage = new HomePage();
    }

}