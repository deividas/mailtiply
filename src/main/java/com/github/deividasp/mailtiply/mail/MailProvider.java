package com.github.deividasp.mailtiply.mail;

import com.github.deividasp.mailtiply.mail.form.Form;
import com.github.deividasp.mailtiply.mail.form.InboxForm;

public enum MailProvider {

    INBOX("https://login.inbox.lt/signup?go=portal", new InboxForm());

    private final String registrationUrl;
    private final Form form;

    MailProvider(String registrationUrl, Form form) {
        this.registrationUrl = registrationUrl;
        this.form = form;
    }

    public String getRegistrationUrl() {
        return registrationUrl;
    }

    public Form getForm() {
        return form;
    }

}
