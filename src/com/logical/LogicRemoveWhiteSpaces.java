package com.logical;

public class LogicRemoveWhiteSpaces {
    public static void main(String[] args) {
        String str="Java     Programming  Selenium       Automation";
        System.out.println("Before removing the white spaces:"+str);
        str=str.replaceAll("\\s","");
        System.out.println("After removing the white spaces:"+str);

    }
}
