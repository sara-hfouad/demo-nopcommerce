package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D08_WishlistStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("user adds item to wishlist")
    public void addItem() throws InterruptedException{
        homePage.addToWishlist().click();
        Thread.sleep(1000);
    }

    @Then("success message wishlist is displayed")
    public void succesMsg(){
        SoftAssert soft = new SoftAssert();

        soft.assertTrue(homePage.successMsg().getText().contains("The product has been added to your "));

        String hex= Color.fromString(homePage.successBox().getCssValue("background-color")).asHex();
        soft.assertEquals(hex,"#4bb07a");
        soft.assertAll();
    }

    @Then("wishlist is updated")
    public void checkWishlist() throws InterruptedException {
        Thread.sleep(4000);
        homePage.wishlistBtn().click();
        Thread.sleep(1000);

        //System.out.println("QTY: "+Integer.parseInt(homePage.quantity().getText()));

        Assert.assertTrue(Integer.parseInt(homePage.quantity().getAttribute("value"))>0);
    }
}
