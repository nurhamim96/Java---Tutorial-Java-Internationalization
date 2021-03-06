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

/**
 * NOTE :
 *
 * MessageFormat class ini digunakan untuk melakukan substitusi data parameter, namun data string awalnya perlu ditambahkan penanda parameter.
 * Penggunaan parameter di MessageFormat, menggunakan kurung kurawal buka, diikuti dengan index (dimulai dari 0) dan diakhiri dengan kurung kurawal tutup,
 * misal : Hi {0}, Selamat datang di {1}.
 * Jika menggunakan index yang sama, artinya data akan menggunakan parameter yang sama,
 * misal : Hi {0}, Anda bisa mencari data anda dengan mengetik "{0}" di pencarian.
 * Link list country codes : https://www.iban.com/country-codes.
 * Link list language codes ISO 639.2 : https://loc.gov/standards/iso639-2/php/code_list.php.
 *
 */