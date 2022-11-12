package com.basic;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Console output");
		PrintWriter pw=new PrintWriter("abc.txt");
		pw.println("File output");
		pw.flush();
	}
}
