package com.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class PrivateConstructorInvokation {
	public void createObj(int vId, String vName) throws InstantiationException, IllegalAccessException,   
	IllegalArgumentException, InvocationTargetException, NoSuchMethodException   
	{  
	// using the parametereless contructor  
	Constructor<Vehicle> constt = Vehicle.class.getDeclaredConstructor();  
	  
	constt.setAccessible(true);  
	Object obj = constt.newInstance();  
	if (obj instanceof Vehicle)   
	{  
	  Vehicle v = (Vehicle)obj;  
	   v.setVehicleId(vId);  
	   v.setVehicleName(vName);  
	     System.out.println("Vehicle Id: " +  v.getVehicleId());  
	     System.out.println("Vehicle Name: " +  v.getVehicleName());  
	}  
	}  
	  
	// the craeteObjByConstructorName() method is used to create an object   
	// of the Vehicle class using the parameterized constructor.   
	public void createObjByConstructorName(int vId, String vName) throws NoSuchMethodException,
	SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException   
	{  
	  
	// using the parameterized contructor  
	Constructor<Vehicle> constt = Vehicle.class.getDeclaredConstructor(Integer.class, String.class);  
	  
	if (Modifier.isPrivate(constt.getModifiers()))   
	{  
	constt.setAccessible(true);  
	      
	Object obj = constt.newInstance(vId, vName);  
	if(obj instanceof Vehicle)  
	{  
	     Vehicle v = (Vehicle)obj;  
	     System.out.println("Vehicle Id: " +  v.getVehicleId());  
	     System.out.println("Vehicle Name: " + v.getVehicleName());  
	}  
	}  
	}   
	public static void main(String[] args) throws NoSuchMethodException, SecurityException,
	InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		PrivateConstructorInvokation ob=new PrivateConstructorInvokation();  
		ob.createObj(20, "Indica");  
		   System.out.println(" -------------------------- "); 
		   List<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	          
	        list.forEach(System.out::println);  
		   ob.createObjByConstructorName(30, "Alto");    
	}
}
