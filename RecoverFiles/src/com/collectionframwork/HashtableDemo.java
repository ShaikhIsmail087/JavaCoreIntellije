package com.collectionframwork;

import java.util.Hashtable;
import java.util.Objects;

public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable<Temp1, String> h=new Hashtable<Temp1, String>();
		h.put(new Temp1(5), "A");
		h.put(new Temp1(2), "B");
		h.put(new Temp1(6), "C");
		h.put(new Temp1(15), "D");
		h.put(new Temp1(23), "E");
		h.put(new Temp1(16), "F");
		//h.put("Durga", null);
		System.out.println(h);
	}

}
class Temp1
{
	int i;
	public Temp1(int i) {
		super();
		this.i = i;
	}
	@Override
	public  int hashCode() {
		return Objects.hash(i);
	}
	@Override
	public String toString() {
		return i+"";
	}
	
	
}