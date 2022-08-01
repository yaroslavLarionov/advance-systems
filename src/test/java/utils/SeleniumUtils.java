package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumUtils {

    public static void sleep(Long milliSeconds){
        try{
            Thread.sleep(milliSeconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

//    public void click(WebElement element){
//        moveIntoView(element);
//        highlightElement(element);
//        waitForElementClickability(element);
//        element.click();
//    }
//
//    public void sendKeys(WebElement element, String inputText){
//        moveIntoView(element);
//        highlightElement(element);
//        waitForElementVisibility(element);
//        element.sendKeys(inputText);
//    }
//
//    public String getText(WebElement element){
//        moveIntoView(element);
//        highlightElement(element);
//        waitForElementVisibility(element);
//        return element.getText();
//    }

    public static void waitForElementClickability(WebElement element){
        WebDriverWait wait = new WebDriverWait(WebDriverManager.getDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitForElementVisibility(WebElement element){
        WebDriverWait wait = new WebDriverWait(WebDriverManager.getDriver(), 15);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElementVisibility(By by){
        WebDriverWait wait = new WebDriverWait(WebDriverManager.getDriver(), 15);
        wait.until(ExpectedConditions.visibilityOf(WebDriverManager.getDriver().findElement(by)));
        highlightElement(WebDriverManager.getDriver().findElement(by));
    }

    public static void moveIntoView(WebElement element){
        ((JavascriptExecutor)WebDriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void moveIntoView(By by){
        ((JavascriptExecutor)WebDriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", WebDriverManager.getDriver().findElement(by));
    }



    public static void highlightElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) WebDriverManager.getDriver();

        for(int i = 0; i < 4; i++){
            try{
                if(i % 2 == 0){
                    js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: black;" +
                            "border: 3px solid red; background: yellow");
                }else {
                    sleep(500L);
                    js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    /**
     * Method will switch to the next window
     * NOTE: Method works only with 2 windows at a time
     */
    public static void switchToNextWindow(){
        String currentWindowID = WebDriverManager.getDriver().getWindowHandle();
        Set<String> allWindowIDs = WebDriverManager.getDriver().getWindowHandles();

        for(String each: allWindowIDs){
            if (!each.equals(currentWindowID))
                WebDriverManager.getDriver().switchTo().window(each);
        }
    }

    public static void switchToParticularWindow(String title){
        String currentWindowID = WebDriverManager.getDriver().getWindowHandle();
        Set<String> allWindowIDs = WebDriverManager.getDriver().getWindowHandles();

        for(String each : allWindowIDs){
            if (WebDriverManager.getDriver().switchTo().window(each).getTitle().equals(title)) {
                break;
            } else {
                WebDriverManager.getDriver().switchTo().window(currentWindowID);
            }
        }
    }


}
