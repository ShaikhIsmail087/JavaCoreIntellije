package com.basic;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
	public static void main(String[] args) {
		Double d =123123.3434;
		NumberFormat nf = NumberFormat.getInstance();
		NumberFormat nf1 = NumberFormat.getInstance(Locale.UK);
		System.out.println(nf1.getMaximumFractionDigits());
		//nf.setMinimumFractionDigits(4);
		//nf.setMaximumFractionDigits(3);
		//nf.setMaximumIntegerDigits(3);
		System.out.println(nf.format(d));
	}
}
