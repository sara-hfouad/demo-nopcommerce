package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {

    P03_homePage homePage = new P03_homePage();

    @When("user opens facebook link")
    public void facebook() throws InterruptedException {
        homePage.facebook().click();
        Thread.sleep(2500);
    }

    @When("user opens twitter link")
    public void twitter() throws InterruptedException {
        homePage.twitter().click();
        Thread.sleep(2500);
    }

    @When("user opens rss link")
    public void rss() throws InterruptedException {
        homePage.rss().click();
        Thread.sleep(2500);
    }

    @When("user opens youtube link")
    public void youtube() throws InterruptedException {
        homePage.youtube().click();
        Thread.sleep(1000);
    }

    @Then("^\"(.*)\" is opened in new tab")
    public void checkUrl(String expected) throws InterruptedException {

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(500);
        String actual = Hooks.driver.getCurrentUrl();

        Assert.assertEquals(actual,expected);
    }
}
