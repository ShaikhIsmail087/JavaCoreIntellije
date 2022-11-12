package com.basic;
enum Color
{
	Blue,Red
	{
		public void info() 
		{
			System.out.println("Dangerous color");
		}
	},Green;
	public void info() 
	{
		System.out.println("universal color");
	}
}
public class EnumDemo2 {
	public static void main(String[] args) {
		Color[] c=Color.values();
		for (Color c1 : c) {
			c1.info();
		}
	}
}
