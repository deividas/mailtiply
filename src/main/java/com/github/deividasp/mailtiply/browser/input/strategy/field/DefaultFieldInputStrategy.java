package com.github.deividasp.mailtiply.browser.input.strategy.field;

import com.github.deividasp.mailtiply.browser.MailBrowser;
import com.github.deividasp.mailtiply.browser.input.text.TextProvider;
import com.github.deividasp.mailtiply.browser.input.text.field.FieldTextProvider;
import com.github.deividasp.mailtiply.mail.form.element.field.InputField;

public class DefaultFieldInputStrategy implements FieldInputStrategy {

    private final FieldTextProvider textProvider;

    public DefaultFieldInputStrategy(FieldTextProvider textProvider) {
        this.textProvider = textProvider;
    }

    @Override
    public String input(MailBrowser browser, InputField field) {
        String text = textProvider.getText(field);
        browser.enter(field, text);
        return text;
    }

    @Override
    public void input(MailBrowser browser, InputField field, String text) {
        browser.enter(field, text);
    }

}
