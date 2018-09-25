package com.github.deividasp.mailtiply.mail.form.element.field;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Repeatable(InputField.List.class)
public @interface InputField {

    String cssSelector();
    InputFieldType type();

    int minLength() default 1;
    int maxLength() default Integer.MAX_VALUE;

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {

        InputField[] value();

    }

}
