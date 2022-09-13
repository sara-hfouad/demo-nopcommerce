package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {

    public WebElement loginPg(){
        return Hooks.driver.findElement(By.partialLinkText("Log in"));
    }

    public WebElement email(){
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement password(){
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement loginBtn(){
        return Hooks.driver.findElements(By.xpath("//button[@type=\"submit\"]")).get(1);
    }

    public WebElement myAcc(){
        return Hooks.driver.findElement(By.xpath("//a[@href=\"/customer/info\"]"));
    }

    public WebElement errMsg(){
        return Hooks.driver.findElement(By.className("message-error"));
    }


}
