package com.github.deividasp.mailtiply.mail;

public enum MailProvider {

    INBOX("https://login.inbox.lt/signup?go=portal");

    private final String registrationUrl;

    MailProvider(String registrationUrl) {
        this.registrationUrl = registrationUrl;
    }

    public String getRegistrationUrl() {
        return registrationUrl;
    }

}
