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



    public static String firstName;
    public static String lastName;
    public static String middleName;
    public`
}
