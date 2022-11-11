package com.logical;

import java.io.*;
import java.util.Scanner;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {
        //using FileReader & BufferReader
        /*FileReader fr=new FileReader("C:\\javacourse\\Test.txt");
        BufferedReader br=new BufferedReader(fr);
        String str;
        while ((str= br.readLine())!=null)
        {
            System.out.println(str);
        }
        br.close();*/

        //Approach 2 using Scanner & File
        File file=new File("C:\\javacourse\\Test.txt");
        Scanner sc=new Scanner(file);
        //with using loop
        /*while (sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }*/
        //without using loop
        sc.useDelimiter("\\z");
        System.out.println(sc.next());
    }
}
