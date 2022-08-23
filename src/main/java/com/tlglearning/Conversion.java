package com.tlglearning;

public class Conversion {
    public static int convertToDecimal(String binary) {
        int value = 0;
        for (char c : binary.toCharArray()) {
            value = (value << 1) + c- '0'; //value*2 = value>>1
        }
        return value;
    }

    /**
     *
     * @param representation
     * @param radix
     * @return
     * @throws IllegalArgumentException if {@code radix < 2 || radix- >10}
     */
    public static int parse(String representation, int radix) throws IllegalArgumentException {
        if (radix < 2 || radix > 10) { throw new IllegalArgumentException();}
        if (representation == null) { throw new IllegalArgumentException();}
        int value = 0;
        for (char c : representation.toCharArray()) {
            value = (value << 1) + c- '0'; //value*2 = value>>1
        }
        return value;

    }
}


