package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {

    public WebElement currency(){
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> prices(){
        return Hooks.driver.findElements(By.className("price"));
    }

    public WebElement searchBox(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchBtn(){
        return Hooks.driver.findElement(By.xpath("//button[@type=\"submit\"]"));
    }

    public List<WebElement> itemsNames(){

        return Hooks.driver.findElements(By.xpath("//div/h2/a"));
    }

    public WebElement getProduct(){

        return Hooks.driver.findElement(By.xpath("//div/h2/a"));
    }

    public WebElement productSku(){

        return Hooks.driver.findElement(By.xpath("//div[@class=\"sku\"]/span[@class=\"value\"]"));
    }

    public List<WebElement> categories(){
        return Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
    }

    public List<WebElement> subcategories(int category){
        return Hooks.driver.findElements(By.xpath(" //ul[@class=\"top-menu notmobile\"]/li["+(category)+"]"));

    }

    public WebElement subcategory(int cat, int subcat){
        return Hooks.driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//li["+(cat)+"]//ul//li["+(subcat)+"]/a"));
    }

    public WebElement pageTitle(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"page-title\"]/h1"));
    }

    public List<WebElement> slider(){
        return Hooks.driver.findElements(By.xpath("//div[@id=\"nivo-slider\"]/a"));
    }

    public WebElement facebook(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"footer-block follow-us\"]//li[@class=\"facebook\"]/a"));
    }

    public WebElement twitter(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"footer-block follow-us\"]//li[@class=\"twitter\"]/a"));
    }

    public WebElement rss(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"footer-block follow-us\"]//li[@class=\"rss\"]/a"));
    }

    public WebElement youtube(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"footer-block follow-us\"]//li[@class=\"youtube\"]/a"));
    }

    public WebElement addToWishlist(){
        return Hooks.driver.findElements(By.xpath("//button[@class=\"button-2 add-to-wishlist-button\"]")).get(2);
    }

    public WebElement successBox(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"bar-notification success\"]"));
    }

    public WebElement successMsg(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"bar-notification success\"]/p"));
    }

    public WebElement wishlistBtn(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"header-links\"]//a[@href=\"/wishlist\"]"));
    }

    public WebElement quantity(){
        return Hooks.driver.findElement(By.xpath("//td[@class=\"quantity\"]//input"));
    }



}
