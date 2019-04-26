package demo.stepDefinitions;

import com.applitools.eyes.selenium.Eyes;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.Framework.BaseSharedClass;
import demo.Framework.Initialization;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class SeleniumDatePickers {


    WebDriver driver;
    BaseSharedClass baseShrCls;
    Initialization init;
    Eyes eyes;
    String tempDate;

    public SeleniumDatePickers( BaseSharedClass baseShrCls){
        this.baseShrCls=baseShrCls;
        init = baseShrCls.getInit();
        driver = baseShrCls.getDriver();
        eyes = baseShrCls.getEyes();
    }


    @When("I select date on input field")
    public void i_select_date_on_input_field(DataTable dt) {
        List<String> list = dt.asList(String.class);
        tempDate = list.get(0);
        driver.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']")).sendKeys(tempDate);
    }

    @Then("Field should have the selected date")
    public void field_should_have_the_selected_date() {
        Assert.assertTrue(tempDate + " is not selected.",driver.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']")).getAttribute("value").contains(tempDate));
    }

}
