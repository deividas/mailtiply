package com.github.deividasp.mailtiply.mail.form;

import com.github.deividasp.mailtiply.mail.form.element.field.InputField;
import com.github.deividasp.mailtiply.mail.form.element.field.InputFieldType;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class Form {

    Form() {
        validate();
    }

    private void validate() {
        if (getFields().size() < 1)
            throw new RuntimeException("Form does not contain any fields");

        for (InputFieldType type : InputFieldType.values()) {
            if (getFields().stream().filter(f -> f.type() == type).count() > 1)
                throw new RuntimeException("Form contains multiple fields of the same type: " + type.toString());
        }
    }

    public List<InputField> getFields() {
        InputField[] fields = getClass().getDeclaredAnnotationsByType(InputField.class);
        return Arrays.asList(fields);
    }

    public List<InputField> getFieldsExcept(InputFieldType... types) {
        List<InputFieldType> excludedTypes = Arrays.asList(types);

        return getFields().stream()
                .filter(f -> !excludedTypes.contains(f.type()))
                .collect(Collectors.toList());
    }

    public Optional<InputField> getField(InputFieldType type) {
        return getFields().stream().filter(f -> f.type() == type).findAny();
    }

}
