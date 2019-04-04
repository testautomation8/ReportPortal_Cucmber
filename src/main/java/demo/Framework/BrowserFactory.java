package demo.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {

    WebDriver driver;

    //Method to invoke URL in the  Browser of choice
    public WebDriver OpenBrowser(WebDriver driver, String Browser) {

        String OSType = System.getProperty("os.name").toUpperCase();
        switch (Browser) {
            case "CHROME":
                if(OSType.contains("WIN")){
                    System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
                }
                else if(OSType.contains("MAC")){
                    System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");
                }
                else{
                    System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");
                }
                driver = new ChromeDriver();
                break;

            case "CHROME_HEADLESS":

                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                if(OSType.contains("WIN")){
                    System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
                }
                else if(OSType.contains("MAC")){
                    System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");
                }
                else{
                    System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");
                }
                driver = new ChromeDriver(options);
                break;
        }

        return driver;

    }

    //Method to Close the Browser
    public void Browser_Quit(WebDriver driver){

        driver.quit();

    }

}
