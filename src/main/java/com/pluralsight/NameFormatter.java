package com.pluralsight;

public class NameFormatter {

    //add name formatter
    private NameFormatter(){

    }
    //add static string format for first and last
    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    //add static overloaded method full name formatter
    public static String format(String prefix, String firstName, String middleName, String lastName,String suffix) {
        String result = lastName + ", ";

        //add if prefix
        if (!prefix.isEmpty()) {
            result += prefix + " ";
        }
        //add if statement for middle
        if (!middleName.isEmpty()) {
            result += " " + middleName;
        }
        //add if statement for suffix
        if (!suffix.isEmpty()) {
            result += ", " + suffix;
        }
        //return result
        return result;
    }

    //put together full name to parse
    public static String format (String fullName) {
        String suffix = "";

        //add if for full
        if (fullName.contains(",")) {
            String[] mainParts = fullName.split(",");
            fullName = mainParts[0].trim();
            suffix = mainParts[1].trim();
        }
        //add part names
        String[] parts = fullName.split(" ");

        //add parts name by index
        if (parts.length == 2) {
            return format(parts[0], parts[1]);
        }
        if (parts.length == 3) {
            return format("", parts[0], parts[1], parts[2], suffix );
        }
        if (parts.length == 4) {
            return format(parts[0], parts[1], parts[2], parts[3], suffix );
        }
        return fullName;
    }
}
