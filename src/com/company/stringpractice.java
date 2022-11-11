package com.company;

import java.util.Locale;

public class stringpractice {
    public static void main(String[] args) {
        String name = "Harry";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "    Harry    ";
      //  System.out.println(nontrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(0));
        System.out.println(name.substring(0,5));

        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("r","ier"));

        System.out.println(name.startsWith("Har"));
        System.out.println(name.endsWith("y"));

        System.out.println(name.charAt(4));

        System.out.println(name.indexOf("y"));

        String modifiedname = "Harryrryrry";
        System.out.println(modifiedname.indexOf("rry"));
        System.out.println(modifiedname.indexOf("yrry",4));

        System.out.println(modifiedname.lastIndexOf("rry",7));

        System.out.println(name.equals("Harry"));

        System.out.println(name.equalsIgnoreCase("hARrY"));

        System.out.println("I am escape sequence\t double quote");


    }
}
