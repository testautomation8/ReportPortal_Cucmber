package demo.stepDefinitions;


import com.applitools.eyes.selenium.Eyes;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.Framework.BaseSharedClass;
import demo.Framework.Initialization;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class SeleniumForms{

    WebDriver driver;
    BaseSharedClass baseShrCls;
    Initialization init;
    Eyes eyes;

    public SeleniumForms( BaseSharedClass baseShrCls){
        this.baseShrCls=baseShrCls;
        init = baseShrCls.getInit();
        driver = baseShrCls.getDriver();
        eyes = baseShrCls.getEyes();

    }

    int int1;
    int int2;

    @Given("I am on sample page")
    public void i_am_on_sample_page(DataTable dt) {
        List<String> list=dt.asList(String.class);
        String compURL = init.getPropValue("URL")+list.get(0)+ ".html";
        driver.get(compURL);
        if (Boolean.valueOf(init.getPropValue("LOOK_FEEL_Testing"))) {
            eyes.checkWindow(driver.getTitle());
        }
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




}

