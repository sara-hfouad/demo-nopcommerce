package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D03_currenciesStepDef {

    P03_homePage homePage = new P03_homePage();

    @Given("user change currency to Euro")
    public void changeCurrency() throws InterruptedException {
        Select select = new Select(homePage.currency());
        select.selectByIndex(1);
        Thread.sleep(1500);
    }

    @Then("check all currencies changed to Euro")
    public void check() throws InterruptedException {
        List<WebElement> prices=homePage.prices();

        String txt;
        for(int i=0;i< prices.size();i++){
            txt= prices.get(i).getText();
            Assert.assertTrue(txt.contains("€"));
        }
    }
}
