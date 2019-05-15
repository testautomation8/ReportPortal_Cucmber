package demo.Framework;

import com.applitools.eyes.selenium.Eyes;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import java.lang.management.ManagementFactory;


public class BaseSharedClass {

    WebDriver driver;
    BrowserFactory browFact;
    public Initialization init;
    Eyes eyes;


    public BaseSharedClass(){

        init = new Initialization();
        browFact= new BrowserFactory();

    }

    @Before
    public void beforeScenario(Scenario scenario){

        driver = browFact.OpenBrowser(driver,init.getPropValue("Browser"));

        if (Boolean.valueOf(init.getPropValue("LOOK_FEEL_Testing"))){
            eyes = new Eyes();
            eyes.setApiKey(init.getPropValue("APPLITOOLS_API_KEY"));
            eyes.open(driver, "Demo",scenario.getName());
        }

        long threadId = Thread.currentThread().getId();
        String processName = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println("Started in thread: " + threadId + ", in JVM: " + processName);


    }

    @After
    public void afterScenario(){
        if (Boolean.valueOf(init.getPropValue("LOOK_FEEL_Testing"))) {
            eyes.close();
        }
        browFact.Browser_Quit(driver);
    }

    public Initialization getInit(){
        return init;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public Eyes getEyes(){ return eyes; }


}
