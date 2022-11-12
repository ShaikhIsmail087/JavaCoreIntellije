package com.collectionframwork;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		TreeMap<Integer, Comparable> t=new TreeMap<Integer, Comparable>();
		t.put(100, "ZZZ");
		t.put(103, "YYY");
		t.put(101, "XXX");
		t.put(104, 106);
		t.put(107, null);
		t.put(100, "ZZZ");
		//t.put("FFF", "XXX");
		//t.put(null, "XXX");
		System.out.println(t);
	}

}
//class MyComparator implements Comparator<Object>
//{
//	public int compare(Object o1,Object o2) 
//	{
//		String s1=o1.toString();
//		String s2=o2.toString();
//		return s2.compareTo(s1);
//	}
//}
