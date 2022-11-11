package com.logical;

public class LogicReverseEachWordInString {
    public static void main(String[] args) {
        //Approach 1
        /*String str="Welcome To Java and Selenium"; //original String
        String[] words=str.split(" "); //splitting string into words
        String reverseString="";
        for (String w:words)
        {
            String reverseWords="";
            for (int i=w.length()-1;i>=0;i--)
            {
                reverseWords=reverseWords+w.charAt(i);
            }
            reverseString=reverseString+reverseWords+" "; //emocleW oT avaJ
        }
        System.out.println(reverseString);*/

        //Approach 2
        String str="Welcome To Java";
        String[] words=str.split("\\s");
        String reverseString="";
        for (String w:words)
        {
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseString=reverseString+sb.toString()+" ";
        }
        System.out.println(reverseString);
    }
}
