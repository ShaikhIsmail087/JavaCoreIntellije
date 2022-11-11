package com.logical;

public class LogicCountCharacterOccurance {
    public static void main(String[] args) {
        String s="Java Programing Java oops";
        int totalCount=s.length();
        int totalCount_afterRemove=s.replace("J","").length();
        int count =totalCount-totalCount_afterRemove;
        System.out.println("Number occurances of a is:"+count);
    }
}
