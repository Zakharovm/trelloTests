package core;

import org.openqa.selenium.WebDriver;
import utils.Utils;

public class MethodsFactory extends Utils {

    static ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();

    public static WebDriver driver() {
        return DRIVER.get();
    }

    public boolean isElementPresent(Elem element) {
        return element.isDisplayed();
    }

    public void clearCookie() {
        driver().manage().deleteAllCookies();
    }


}
