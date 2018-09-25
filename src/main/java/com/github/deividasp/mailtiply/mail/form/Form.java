package com.github.deividasp.mailtiply.mail.form;

import com.github.deividasp.mailtiply.mail.form.element.field.InputField;

import java.util.Arrays;
import java.util.List;

public abstract class Form {

    Form() {
        validate();
    }

    private void validate() {
        if (getFields().size() < 1)
            throw new RuntimeException("Form does not contain any fields");
    }

    public List<InputField> getFields() {
        InputField[] fields = getClass().getDeclaredAnnotationsByType(InputField.class);
        return Arrays.asList(fields);
    }

}
