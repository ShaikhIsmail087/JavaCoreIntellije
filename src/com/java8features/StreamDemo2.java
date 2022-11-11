package com.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(70);
        l.add(45);
        l.add(10);
        l.add(65);
        l.add(20);
        l.add(25);
        System.out.println(l);
        long noOfFailedStudents=l.stream().filter(l1->l1<35).count();
        System.out.println("noOfFailedStudents:"+noOfFailedStudents);
        List<Integer> sortedList= l.stream().sorted().toList();//DNS
        System.out.println("sortedList:"+sortedList);
        List<Integer> reverseSortedList=l.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).toList();//CSO
        System.out.println("reverseSortedList:"+reverseSortedList);
        List<Integer> reverseSortedList2=l.stream().sorted((i1,i2)-> i2.compareTo(i1)).toList();//CSO
        System.out.println("reverseSortedList2:"+reverseSortedList2);
        List<Integer> reverseSortedList3=l.stream().sorted((i1,i2)-> -i1.compareTo(i2)).toList();//CSO
        System.out.println("reverseSortedList3:"+reverseSortedList3);
        List<Integer> reverseSortedList4=l.stream().sorted(Comparator.reverseOrder()).toList();//CSO
        System.out.println("reverseSortedList4:"+reverseSortedList4);
    }
}
