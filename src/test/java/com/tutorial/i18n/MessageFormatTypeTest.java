package com.tutorial.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTypeTest {

    @Test
    void testMessageFormatTypeIndonesia() {
        Locale locale = new Locale("in", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

        String pattern = resourceBundle.getString("status");

        MessageFormat messageFormat = new MessageFormat(pattern, locale);
        String format = messageFormat.format(new Object[]{
                "Ibad Nurhamim", new Date(), 1000000
        });

        System.out.println(format);
    }

    @Test
    void testMessageFormatTypeUSA() {
        Locale locale = new Locale("en", "US");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

        String pattern = resourceBundle.getString("status");

        MessageFormat messageFormat = new MessageFormat(pattern, locale);
        String format = messageFormat.format(new Object[]{
                "Ibad Nurhamim", new Date(), 1000000
        });

        System.out.println(format);
    }
}

/**
 * NOTE :
 *
 * Link list country codes : https://www.iban.com/country-codes.
 * Link list language codes ISO 639.2 : https://loc.gov/standards/iso639-2/php/code_list.php.
 *
 */