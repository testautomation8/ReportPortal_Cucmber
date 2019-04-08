package demo.Framework;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;


public class BaseSharedClass {

    WebDriver driver;
    BrowserFactory browFact;
    public Initialization init;

    public BaseSharedClass(){

        init = new Initialization();
        browFact= new BrowserFactory();
    }

    @Before
    public void beforeScenario(){
       driver = browFact.OpenBrowser(driver,init.getPropValue("Browser"));
    }

    @After
    public void afterScenario(){
        browFact.Browser_Quit(driver);
    }

    public Initialization getInit(){
        return init;
    }

    public WebDriver getDriver(){
        return driver;
    }


}
