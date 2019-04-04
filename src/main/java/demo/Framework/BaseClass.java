package demo.Framework;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;


public class BaseClass {

    WebDriver driver;
    BrowserFactory browFact;
    public Initialization init;

    public BaseClass(){

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


}
