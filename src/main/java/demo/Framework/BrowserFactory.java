package demo.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

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

            case "SAUCE_LABS":

                String sauceUserName = "rahultripathi8";
                String sauceAccessKey = "f19a69a7-55c8-4c70-aff7-c0483b0a9353";
                String sauceURL = "http://" + sauceUserName + ":" + sauceAccessKey + "@ondemand.eu-central-1.saucelabs.com/wd/hub";
                System.out.println("URL=" + sauceURL);
                DesiredCapabilities capabilities = new DesiredCapabilities();

                //set browser
                capabilities.setCapability("browserName", "chrome");
                //set operating system version
                capabilities.setCapability("platform", "macOS 10.13");
                //set the browser version to 11.1
                capabilities.setCapability("version", "70");
                //set the build name of the application
                capabilities.setCapability("build", "Onboarding Sample App - Java");
                //set your test case name so that it shows up in Sauce Labs
                capabilities.setCapability("name", "1-first-test");
                try {
                    driver = new RemoteWebDriver(new URL(sauceURL), capabilities);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }

        }

        return driver;

    }

    //Method to Close the Browser
    public void Browser_Quit(WebDriver driver){

        driver.quit();

    }

}
