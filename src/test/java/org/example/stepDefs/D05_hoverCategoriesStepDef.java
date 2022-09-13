package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class D05_hoverCategoriesStepDef {

    P03_homePage homePage = new P03_homePage();
    int categoryNum;
    int subcatNum;
    String subcategory;


    @When("user hover over category and select subcategory")
    public void selectSubcategory() throws InterruptedException{
        int categoriesCount = 3;
        int min=0;
        int max=categoriesCount-1;
        categoryNum = (int)Math.floor(Math.random()*(max-min+1)+min);

        Actions action = new Actions(Hooks.driver);
        action.moveToElement(homePage.categories().get(categoryNum)).perform();

        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        System.out.println("category num "+categoryNum);

        if(!homePage.subcategories(categoryNum+1).isEmpty()){
            max=homePage.subcategories(categoryNum).size()-1;
            subcatNum = (int)Math.floor(Math.random()*(max-min+1)+min);

            System.out.println("subcat num "+subcatNum);

            action.moveToElement(homePage.subcategories(categoryNum+1).get(subcatNum)).perform();

            Hooks.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

            subcategory=homePage.subcategory(categoryNum+1,subcatNum+1).getText().toLowerCase().trim();
            homePage.subcategory(categoryNum+1,subcatNum+1).click();
        }
    }

    @Then("check page title")
    public void checkPagetitle(){
        System.out.println("sub "+ subcategory);
        String pageTitle=homePage.pageTitle().getText().toLowerCase().trim();
        System.out.println("title " +pageTitle);
        Assert.assertEquals(subcategory,pageTitle);

    }
}
