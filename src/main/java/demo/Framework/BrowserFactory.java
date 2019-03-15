package demo.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {

    WebDriver driver;

    //Method to invoke URL in the  Browser of choice
    public static WebDriver OpenBrowser(WebDriver driver, String Browser) {


        switch (Browser) {
            case "CHROME":

                System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;

            case "CHROME_HEADLESS":

                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
                driver = new ChromeDriver(options);
                break;
        }

        return driver;

    }

    //Method to Close the Browser
    public static void Browser_Quit(WebDriver driver){

        driver.quit();

    }

}
