package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @org.junit.jupiter.api.Test
    public void format_should_returnFirstAndLastName() {

        String result = NameFormatter.format("Mikayla", "Brabham");
        assertEquals("Mikayla, Brabham", result);
    }

    @org.junit.jupiter.api.Test
    public void testFormat_should_returnFullNameWithPrefixMiddleAndSuffix() {

        String result = NameFormatter.format("Dr.", "Mikayla", "Danese", "Brabham", "phD");
        assertEquals("Brabham, Dr. Mikayla Danese, phd", result);

    }

    @org.junit.jupiter.api.Test
    public void testFormat1_should_parseFullNamr() {

        String result = NameFormatter.format(" Dr. Kay D Brabham, phD");
        assertEquals("Brabham, Dr. Kay D, phD", result);
    }
}