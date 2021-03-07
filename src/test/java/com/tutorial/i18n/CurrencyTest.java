package com.tutorial.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {

    @Test
    void testCurrencyIndonesia() {
        Locale indonesia = new Locale("in", "ID");
        Currency currency = Currency.getInstance(indonesia);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(indonesia));
    }

    @Test
    void testCurrencyUSA() {
        Locale america = new Locale("en", "US");
        Currency currency = Currency.getInstance(america);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(america));
    }

    @Test
    void testNumberFormatCurrencyIndonesia() {
        Locale indonesia = new Locale("in", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        String format = numberFormat.format(1000000.333);
        System.out.println(format);
    }

    @Test
    void testNumberFormatCurrencyParseIndonesia() {
        Locale indonesia = new Locale("in", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        try {
            double parse = numberFormat.parse("Rp900.000,25").doubleValue();
            System.out.println(parse);
        } catch (ParseException e) {
            System.out.println("Error Parse : " + e.getMessage());
        }
    }
}

/**
 * NOTE :
 *
 * Currency class adalah implementasi standard dari ISO 4217 currency codes.
 * Dengan menggunakan class ini, kita bisa mengetahui nama mata uang, kode mata uang sampai simbol yang digunakan.
 * Untuk membuat object Currency, kita wajib menggunakan Locale yang memiliki negara, karena setiap negara memiliki mata uangnya masing".
 * NumberFormat juga tidak hanya bisa digunakan untuk format dan parsing number, tapi juga number dalam bentuk currency.
 * Untuk membuat NumberFormat yang mendukung currency, kita bisa menggunakan static method getCurrencyInstance().
 * Link list country codes : https://www.iban.com/country-codes.
 * Link list language codes ISO 639.2 : https://loc.gov/standards/iso639-2/php/code_list.php.
 *
 * Sumber : ProgrammerZamanNow
 *
 */