package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {

    public WebElement registerLink(){
        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement genderFemale(){
        return Hooks.driver.findElement(By.id("gender-female"));
    }

    public WebElement firstName(){
        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lastName(){
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement dayOfBirth(){
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement monthOfBirth(){
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement yearOfBirth(){
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement email(){
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement password(){
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword(){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registerBtn(){
        return Hooks.driver.findElement(By.id("register-button"));
    }

    public WebElement successMsg(){
        return Hooks.driver.findElement(By.className("result"));
    }
}
