package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    P01_register register = new P01_register();

    @Given("user go to register page")
    public void goRegisterPage() throws InterruptedException {
        register.registerLink().click();
        Thread.sleep(1000);
    }


    @When("user select gender type")
    public void selectGender() throws InterruptedException {
        register.genderFemale().click();
        Thread.sleep(500);
    }

    @And("^user enter \"(.*)\" and \"(.*)\"$")
    public void enterNames(String firstName, String lastName) throws InterruptedException {

        register.firstName().sendKeys(firstName);
        Thread.sleep(500);
        register.lastName().sendKeys(lastName);
        Thread.sleep(1000);
    }

    @And("user enter date of birth")
    public void dateOfBirth() throws InterruptedException {

        Select select = new Select(register.dayOfBirth());
        select.selectByIndex(10);
        Thread.sleep(500);
        select=new Select(register.monthOfBirth());
        select.selectByIndex(5);
        Thread.sleep(500);
        select=new Select(register.yearOfBirth());
        select.selectByValue("1999");
        Thread.sleep(1000);
    }

    @And("^user enter email \"(.*)\"$")
    public void email(String email) throws InterruptedException {

        register.email().sendKeys(email);
        Thread.sleep(1000);
    }

    @And("^user fills Password \"(.*)\" \"(.*)\"$")
    public void enterPasswords(String password, String confirmPassword) throws InterruptedException {

        register.password().sendKeys(password);
        Thread.sleep(500);
        register.confirmPassword().sendKeys(confirmPassword);
        Thread.sleep(500);
    }

    @And("user clicks on register button")
    public void register() throws InterruptedException {

        register.registerBtn().click();
        Thread.sleep(500);
    }

    @Then("success message is displayed")
    public void success() throws InterruptedException{

        SoftAssert soft = new SoftAssert();

        String actual = register.successMsg().getText();
        String expected="Your registration completed";
        soft.assertTrue(actual.contains(expected));

        String actualColor = register.successMsg().getCssValue("color");
        soft.assertEquals(actualColor,"rgba(76, 177, 124, 1)");
        soft.assertAll();
    }
}
