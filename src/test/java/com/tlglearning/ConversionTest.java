package com.tlglearning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {

    @Test
    void convertToDecimal() {
        assertEquals(173, Conversion.convertToDecimal("10101101"));
    }

    @Test
    void testParse1() {
        assertEquals(173, Conversion.parse("10101101", 2));
    }

    @Test
    void testParse2() {
        assertEquals(13, Conversion.parse("1101", 4));
    }

    @Test
    void testParse_exception(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {Conversion.parse("101", 0);});
    }

    @ParameterizedTest
    CsvFileSource(resources = "parse-valid.csv", numLinesToSkip = 1)
        void parse_valid(String representation, int radix, int expected) {
        assertEquals(expected, Conversion.parse(representation, radix));
        }

}