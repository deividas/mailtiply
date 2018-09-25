package com.github.deividasp.mailtiply.mail.form;

import com.github.deividasp.mailtiply.mail.form.element.field.InputField;
import com.github.deividasp.mailtiply.mail.form.element.field.InputFieldType;

@InputField(cssSelector = "#signup_user", type = InputFieldType.USERNAME, minLength = 3, maxLength = 36)
@InputField(cssSelector = "#signup_forename", type = InputFieldType.FORENAME, maxLength = 64)
@InputField(cssSelector = "#signup_surname", type = InputFieldType.SURNAME, maxLength = 128)
@InputField(cssSelector = "#signup_password_password", type = InputFieldType.PASSWORD, minLength = 6, maxLength = 32)
@InputField(cssSelector = "#signup_password_passwordRepeat", type = InputFieldType.PASSWORD_REPEAT)
public class InboxForm extends Form {

}
