package com.logical;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("C:\\javacourse\\Test123.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Java with java framework");
        bw.write("Java with spring framework");
        bw.write("Java with hibernate framework");
        bw.write("Java with spring boot framework");
        System.out.println("Finished!!!");
        bw.close();
    }
}
