package com.github.deividasp.mailtiply.browser;

import org.openqa.selenium.WebDriver;

import java.util.Objects;

abstract class Browser {

    private final WebDriver driver;

    Browser(WebDriver driver) {
        this.driver = Objects.requireNonNull(driver);
    }

    void open(String url) {
        driver.get(url);
    }

}
