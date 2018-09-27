package com.github.deividasp.mailtiply.browser;

import com.github.deividasp.mailtiply.browser.input.strategy.form.FormInputStrategy;
import com.github.deividasp.mailtiply.mail.MailProvider;
import com.github.deividasp.mailtiply.mail.form.element.field.InputField;

import org.openqa.selenium.WebDriver;

public class MailBrowser extends Browser {

    private final MailProvider mailProvider;
    private final FormInputStrategy formInputStrategy;

    public MailBrowser(WebDriver driver, MailProvider mailProvider, FormInputStrategy formInputStrategy) {
        super(driver);

        this.mailProvider = mailProvider;
        this.formInputStrategy = formInputStrategy;
    }

    public void open() {
        open(mailProvider.getRegistrationUrl());
    }

    public void enter(InputField field, String text) {
        enter(field.cssSelector(), text);
    }

    public void enterForm() {
        formInputStrategy.input(this, mailProvider.getForm());
    }

}
