package com.company;

public class StringPrac {
    public static void main(String[] args) {
        String s1="java string split method by javatpoint";
        //String[] words=s1.split("\\s");
        for (String w:s1.split("\\s",0))
            System.out.println(w);

    }
}
