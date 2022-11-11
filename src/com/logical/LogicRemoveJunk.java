package com.logical;

public class LogicRemoveJunk {
    public static void main(String[] args) {
        String s="â??USERâ?? ï\u0081»ï\u0081»ï? latin String 0987654321";
        String s1="@#$@#$@ testing #@$@$#@$ Selenium !@#$@#$#@#$$@# &&&&& Java";
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
        s1=s1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s1);
    }
}
