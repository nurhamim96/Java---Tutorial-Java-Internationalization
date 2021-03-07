package com.tutorial.i18n;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

    @Test
    void testDateFormat() {
        String pattern = "EEEE dd MMMM yyyy";
        DateFormat dateFormat = new SimpleDateFormat(pattern);

        String format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatIndonesia() {
        String pattern = "EEEE dd MMMM yyyy";
        Locale indonesia = new Locale("in", "ID");
        DateFormat dateFormat = new SimpleDateFormat(pattern, indonesia);

        String format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatJapan() {
        String pattern = "EEEE dd MMMM yyyy";
        Locale japan = new Locale("ja", "JPN");
        DateFormat dateFormat = new SimpleDateFormat(pattern, japan);

        String format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatParseIndonesia() {
        String pattern = "EEEE dd MMMM yyyy";
        Locale indonesia = new Locale("in", "ID");
        DateFormat dateFormat = new SimpleDateFormat(pattern, indonesia);

        try {
            Date date = dateFormat.parse("Minggu 07 Maret 2021");
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("Error Parse : " + e.getMessage());
        }
    }

    @Test
    void testDateFormatParseJapan() {
        String pattern = "EEEE dd MMMM yyyy";
        Locale indonesia = new Locale("ja", "JPN");
        DateFormat dateFormat = new SimpleDateFormat(pattern, indonesia);

        try {
            Date date = dateFormat.parse("日曜日 07 3月 2021");
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("Error Parse : " + e.getMessage());
        }
    }
}


/**
 * NOTE :
 *
 * DateFormat merupakan class yang bisa kita gunakan untuk melakukan parsing dari String ke Date, atau format dari Date ke String.
 * Link Pattern SimpleDateFormat : https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html.
 * Link list country codes : https://www.iban.com/country-codes.
 * Link list language codes ISO 639.2 : https://loc.gov/standards/iso639-2/php/code_list.php.
 */