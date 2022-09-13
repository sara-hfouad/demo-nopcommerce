package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class D04_searchStepDef {

    P03_homePage homePage = new P03_homePage();

    @When("user searches for {string}")
    public void gotoSearch(String productname) throws InterruptedException{
        homePage.searchBox().click();
        Thread.sleep(200);
        homePage.searchBox().sendKeys(productname);
        Thread.sleep(1000);
    }

    @And("user clicks search")
    public void search() throws InterruptedException{
        homePage.searchBtn().click();
        Thread.sleep(1000);
    }

    @Then("user find {string} relative results")
    public void chechRelative(String productname){
        List<WebElement> itemsNames = homePage.itemsNames();

        String txt;
        for(int i=0;i< itemsNames.size();i++){
            txt= itemsNames.get(i).getText().toLowerCase();
            Assert.assertTrue(txt.contains(productname));
        }
    }

    @And("user clicks on the product")
    public void selectProduct() throws InterruptedException{
        homePage.getProduct().click();
        Thread.sleep(1000);
    }

    @Then("user find {string} in product page")
    public void  checkSku(String sku){
        String actual = homePage.productSku().getText();
        Assert.assertEquals(actual,sku);
    }
}
