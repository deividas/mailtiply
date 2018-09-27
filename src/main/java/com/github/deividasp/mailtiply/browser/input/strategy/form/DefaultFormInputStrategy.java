package com.github.deividasp.mailtiply.browser.input.strategy.form;

import com.github.deividasp.mailtiply.browser.MailBrowser;
import com.github.deividasp.mailtiply.browser.input.strategy.field.FieldInputStrategy;
import com.github.deividasp.mailtiply.mail.form.Form;
import com.github.deividasp.mailtiply.mail.form.element.field.InputFieldType;

public class DefaultFormInputStrategy implements FormInputStrategy {

    private final FieldInputStrategy fieldInputStrategy;

    public DefaultFormInputStrategy(FieldInputStrategy fieldInputStrategy) {
        this.fieldInputStrategy = fieldInputStrategy;
    }

    @Override
    public Void input(MailBrowser browser, Form form) {
        form.getFieldsExcept(InputFieldType.PASSWORD_REPEAT).forEach(f -> {
            String inputText = fieldInputStrategy.input(browser, f);

            if (f.type() == InputFieldType.PASSWORD) {
                form.getField(InputFieldType.PASSWORD_REPEAT).ifPresent(rf ->
                        fieldInputStrategy.input(browser, rf, inputText));
            }
        });
        return null;
    }

}
