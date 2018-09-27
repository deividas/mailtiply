package com.github.deividasp.mailtiply.browser;

import com.github.deividasp.mailtiply.mail.MailProvider;
import com.github.deividasp.mailtiply.mail.form.element.field.InputField;

import org.openqa.selenium.WebDriver;

public class MailBrowser extends Browser {

    private final MailProvider mailProvider;

    public MailBrowser(WebDriver driver, MailProvider mailProvider) {
        super(driver);

        this.mailProvider = mailProvider;
    }

    public void open() {
        open(mailProvider.getRegistrationUrl());
    }

    public void enter(InputField field, String text) {
        enter(field.cssSelector(), text);
    }

}
