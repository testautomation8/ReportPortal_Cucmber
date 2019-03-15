package demo.stepDefinitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.Framework.BrowserFactory;
import demo.Framework.Initialization;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SeleniumForms extends BrowserFactory {

    WebDriver driver;
    Initialization init;
    int int1;
    int int2;

    @Before
    public void beforeScenario(){

       init = new Initialization();
       driver = OpenBrowser(driver,init.getPropValue("Browser"));

    }

    @Given("I am on sample website")
    public void i_am_on_sample_website() {

        driver.get(init.getPropValue("URL"));
    }

    @When("I enter value on input field")
    public void i_enter_value_on_input_field() {
        driver.findElement(By.id("user-message")).sendKeys("This is test for single field");
    }

    @When("I click on Show Message")
    public void i_click_on_Show_Message() throws InterruptedException {
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@onclick='showInput();']")).click();
        //Thread.sleep(3000);
    }

    @Then("My message should be displayed")
    public void my_message_should_be_displayed() {
        Assert.assertTrue("Message is incorrect",driver.findElement(By.id("display")).getText().contains("This is test for single field"));
    }

    @When("I enter value {int} and {int}")
    public void i_enter_value_on_field_and_field(int val_1, int val_2) {

        int1 = val_1;
        int2 = val_2;
        driver.findElement(By.id("sum1")).sendKeys(Integer.toString(int1));
        driver.findElement(By.id("sum2")).sendKeys(Integer.toString(int2));

    }

    @When("I click on GetTotal")
    public void i_click_on_GetTotal() throws InterruptedException {
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@onclick='return total()']")).click();
        //Thread.sleep(3000);
    }

    @Then("I should be able to see the sum on screen")
    public void i_should_be_able_to_see_the_sum_on_screen() {
        Assert.assertTrue("Sum is incorrect", driver.findElement(By.id("displayvalue")).getText().contains(Integer.toString(int1+int2)));
    }

    @After
    public void afterScenario(){

        Browser_Quit(driver);

    }


}

