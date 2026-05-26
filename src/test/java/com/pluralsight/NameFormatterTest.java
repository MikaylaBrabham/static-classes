package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    public void format_should_formatFirstAndLastName() {

        String result = NameFormatter.format("Mikayla", "Brabham");
        assertEquals("Brabham, Mikayla", result);
    }

    @Test
    public void format_should_formatFullNameWithPrefixMiddleAndSuffix() {

        String result = NameFormatter.format
                ("Dr.", "Mikayla", "Danese", "Brabham", "phD");
        assertEquals("Brabham, Dr. Mikayla Danese, phD", result);

    }
    @Test
    public void format_should_parseFullName() {

        String result = NameFormatter.format(" Dr. Kay D Brabham, phD");
        assertEquals("Brabham, Dr. Kay D, phD", result);
    }
}