package com.github.deividasp.mailtiply.browser.input.strategy;

import com.github.deividasp.mailtiply.browser.MailBrowser;

public interface InputStrategy<T, R> {

    R input(MailBrowser browser, T target);

}
