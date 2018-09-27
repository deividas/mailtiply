package com.github.deividasp.mailtiply.browser.input.strategy.field;

import com.github.deividasp.mailtiply.browser.MailBrowser;
import com.github.deividasp.mailtiply.browser.input.strategy.InputStrategy;
import com.github.deividasp.mailtiply.mail.form.element.field.InputField;

public interface FieldInputStrategy extends InputStrategy<InputField, String> {

    void input(MailBrowser browser, InputField field, String text);

}
