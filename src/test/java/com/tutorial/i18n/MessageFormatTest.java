package com.tutorial.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {

    @Test
    void testMessageFormat() {
        String pattern = "Hi {0}, Anda bisa mencari data Anda dengan mengetikan \"{0}\" di pencarian ";
        MessageFormat messageFormat = new MessageFormat(pattern);

        String format = messageFormat.format(new Object[]{
                "Ibad Nurhamim"
        });

        System.out.println(format);
    }

    @Test
    void testMessageFormatResourceBundleIndonesia() {
        Locale locale = new Locale("in", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

        String pattern = resourceBundle.getString("welcome.message");

        MessageFormat messageFormat = new MessageFormat(pattern);
        String format = messageFormat.format(new Object[]{
                "Ibad Nurhamim", "Belajar Java Internationalization"
        });

        System.out.println(format);
    }

    @Test
    void testMessageFormatResourceBundleUSA() {
        Locale locale = new Locale("en", "US");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

        String pattern = resourceBundle.getString("welcome.message");

        MessageFormat messageFormat = new MessageFormat(pattern);
        String format = messageFormat.format(new Object[]{
                "Ibad Nurhamim", "Belajar Java Internationalization"
        });

        System.out.println(format);
    }
}
