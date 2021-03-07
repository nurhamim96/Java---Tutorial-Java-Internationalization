package com.tutorial.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

    @Test
    void testNumberFormat() {
        NumberFormat numberFormat = NumberFormat.getInstance();
        String format = numberFormat.format(10000000.255);
        System.out.println(format);
    }

    @Test
    void testNumberFormatIndonesia() {
        Locale indonesia = new Locale("in", "ID");
        NumberFormat numberFormat = NumberFormat.getInstance(indonesia);
        String format = numberFormat.format(10000000.255);
        System.out.println(format);
    }

    @Test
    void testNumberFormatParseIndonesia() {
        Locale indonesia = new Locale("in", "ID");
        NumberFormat numberFormat = NumberFormat.getInstance(indonesia);

        try {
            double result = numberFormat.parse("10.000.000,255").doubleValue();
            System.out.println(result);
        } catch (ParseException e) {
            System.out.println("Error Parse : " + e.getMessage());
        }
    }
}

/**
 * NOTE :
 *
 * Link list country codes : https://www.iban.com/country-codes.
 * Link list language codes ISO 639.2 : https://loc.gov/standards/iso639-2/php/code_list.php.
 *
 */