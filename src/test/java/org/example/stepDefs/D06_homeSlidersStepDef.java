package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("user click on nokia slider")
    public void nokiaClick(){
        homePage.slider().get(0).click();

    }

    @Then("check nokia url")
    public void nokiaCheck(){
        String expected="https://demo.nopcommerce.com/nokia-lumia-1020";
        String actual=Hooks.driver.getCurrentUrl();

        Assert.assertEquals(actual,expected);
    }

    @When("user click on iphone slider")
    public void iphoneClick() throws InterruptedException{
        Thread.sleep(4000);
        homePage.slider().get(1).click();
    }

    @Then("check iphone url")
    public void iphoneCheck(){
        String expected="https://demo.nopcommerce.com/iphone-6";
        String actual=Hooks.driver.getCurrentUrl();

        Assert.assertEquals(actual,expected);
    }
}
