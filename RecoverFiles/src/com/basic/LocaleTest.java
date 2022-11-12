package com.basic;

	import java.util.Locale;

	public class LocaleTest {
	public static void main(String[] args) {
		Locale l = Locale.getDefault();
		System.out.println(l.getCountry()+ " "+ l.getLanguage());
		System.out.println(l.getDisplayCountry()+" "+l.getDisplayLanguage());
		Locale.setDefault(Locale.UK);
		System.out.println(Locale.getDefault().getDisplayCountry());
//		String[] countries = Locale.getISOCountries();
//		for(String c:countries) {
//			System.out.println(c);
//		}
		Locale[] l2=Locale.getAvailableLocales();
		int count=0;
		for (Locale l1 : l2) {
			count++;
			System.out.println(l1.getDisplayCountry()+"--->>>>>"+l1.getDisplayLanguage());
		}
		System.out.println("Total Country-->>>"+count);
	}
}
