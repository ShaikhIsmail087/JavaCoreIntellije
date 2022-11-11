package com.company;
import java.util.StringTokenizer;
import java.util.regex.*;
public class Regex {
    public static void main(String[] args) {
       // Pattern p=Pattern.compile("[.]");
//        String s="Welcome to java";
//       String[] s1=s.split("\\s");
//       for (String s2:s1)
//           System.out.println(s2);
        StringTokenizer st=new StringTokenizer("19-07-2022","-");
        while (st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}
