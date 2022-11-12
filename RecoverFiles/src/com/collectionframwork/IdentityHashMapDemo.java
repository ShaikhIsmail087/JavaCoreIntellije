package com.collectionframwork;

import java.util.IdentityHashMap;
import java.util.Objects;

public class IdentityHashMapDemo {
	int id;
public IdentityHashMapDemo(int id) {
		super();
		this.id = id;
	}
//	 String name;
//	 int id;
//	 
//	public IdentityHashMapDemo(String name, int id) {
//		super();
//		this.name = name;
//		this.id = id;
//	}

//	
//	@Override
//	public String toString() {
//		return "IdentityHashMapDemo [name=" + name + ", id=" + id + "]";
//	}


	public static void main(String[] args) {
		IdentityHashMapDemo i1=new IdentityHashMapDemo(10);
		IdentityHashMapDemo i2=new IdentityHashMapDemo(100);
		System.out.println(i1);
		System.out.println(i2);
//		IdentityHashMapDemo i3=new IdentityHashMapDemo("ismail", 101);
//		IdentityHashMapDemo i4=i1;
//		System.out.println(i1.equals(i2));
//		System.out.println(i1.equals(i3));
//		System.out.println(i1.equals(i4));
//		System.out.println(i1);
//		System.out.println(i2);
		
//		IdentityHashMap<Integer, String> h=new IdentityHashMap<Integer, String>();
//		@SuppressWarnings("removal")
//		Integer I1=new Integer(10);
//		@SuppressWarnings("removal")
//		Integer I2=new Integer(10);
//		h.put(I1, "Pawan");
//		h.put(I2,"Kalayn");
//		System.out.println(h);
//		System.out.println(I1==I2);
//		System.out.println(I1.equals(I2));
	}

	@Override
	public int hashCode() {
		return id;
	}

	
	
//	@Override
//	public boolean equals(Object obj) {
//		try {
//			IdentityHashMapDemo i=(IdentityHashMapDemo)obj;
//			if (name.equals(i.name) && id==i.id) {
//				return true;
//			}else 
//			{
//				return false;
//			}
//		} catch (Exception e) {
//			return false;
//		}
//	}

}
