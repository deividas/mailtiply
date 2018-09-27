package com.github.deividasp.mailtiply.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

abstract class Browser {

    private final WebDriver driver;

    Browser(WebDriver driver) {
        this.driver = Objects.requireNonNull(driver);
    }

    private WebElement findElement(String cssSelector) {
        return driver.findElement(By.cssSelector(cssSelector));
    }

    void open(String url) {
        driver.get(url);
    }

    void enter(String fieldSelector, String text) {
        findElement(fieldSelector).sendKeys(text);
    }

}
