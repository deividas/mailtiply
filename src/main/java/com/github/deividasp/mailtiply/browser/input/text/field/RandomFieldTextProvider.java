package com.github.deividasp.mailtiply.browser.input.text.field;

import com.github.deividasp.mailtiply.mail.form.element.field.InputField;
import com.github.deividasp.mailtiply.util.RandomUtils;

public class RandomFieldTextProvider implements FieldTextProvider {

    @Override
    public String getText(InputField field) {
        return RandomUtils.randomString(field.minLength(), field.maxLength());
    }

}
