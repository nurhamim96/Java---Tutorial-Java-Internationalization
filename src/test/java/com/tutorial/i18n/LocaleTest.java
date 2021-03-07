package com.tutorial.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LocaleTest {

    @Test
    void testNewLocale() {
        String language = "in";
        String country = "ID";
        Locale locale = new Locale(language, country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
    }

    @Test
    void testNewLocaleUs() {
        String language = "en";
        String country = "US";
        Locale locale = new Locale(language, country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
    }
}

/**
 * NOTE :
 *
 * Link list country codes : https://www.iban.com/country-codes.
 * Link list language codes ISO 639.2 : https://loc.gov/standards/iso639-2/php/code_list.php.
 *
 */