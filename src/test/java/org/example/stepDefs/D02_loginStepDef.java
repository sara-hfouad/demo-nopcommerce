package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_login login = new P02_login();

    @Given("user go to login page")
    public void login() throws InterruptedException {
        login.loginPg().click();
        Thread.sleep(1000);
    }

    @When("^user login with valid \"(.*)\" and \"(.*)\"$")
    public void enterFields(String email,String password) throws InterruptedException {
        login.email().sendKeys(email);
        Thread.sleep(500);
        login.password().sendKeys(password);
        Thread.sleep(500);
    }

    @And("user press on login button")
    public void pressLogin() throws InterruptedException {
        login.loginBtn().click();
        Thread.sleep(500);
    }

    @Then("user login to the system successfully")
    public void success(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(login.myAcc().isDisplayed());
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        soft.assertAll();
    }

    @When("^user login with invalid \"(.*)\" and \"(.*)\"$")
    public void enterInvalidFields(String email,String password) throws InterruptedException {
        login.email().sendKeys(email);
        Thread.sleep(500);
        login.password().sendKeys(password);
        Thread.sleep(500);
    }

    @Then("user could not login to the system")
    public void fail(){
        SoftAssert soft = new SoftAssert();
        String msg=login.errMsg().getText();
        soft.assertTrue(msg.contains("Login was unsuccessful."));
        String hex= Color.fromString(login.errMsg().getCssValue("color")).asHex();
        soft.assertEquals(hex,"#e4434b");
        soft.assertAll();
    }
}
