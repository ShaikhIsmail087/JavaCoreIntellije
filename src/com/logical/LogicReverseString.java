package com.logical;

public class LogicReverseString {
    public static void main(String[] args) {
        //1) Using + (String concatenation operator)
        String s="ABCD";
        String rev="";
        /*int len=s.length(); //4
        for (int i=len-1;i>=0;i--) //3 ,2 ,1, 0, -1
        {
            rev=rev + s.charAt(i); //DCBA
        }
        System.out.println("Reverse String is:"+rev);*/

        //2) Using character array
        /*char[] c=s.toCharArray();
        int len=c.length;
        for (int i=len-1;i>=0;i--)
        {
            rev=rev+c[i];
        }
        System.out.println("Reverse String is:"+rev);*/

        //3) Using StringBuffer class
        /*StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.reverse();*/

        //4)Using StringBuilder class
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb.reverse());
    }
}
