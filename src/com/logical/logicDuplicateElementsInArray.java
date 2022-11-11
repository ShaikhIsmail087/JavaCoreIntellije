package com.logical;

import java.util.*;

public class logicDuplicateElementsInArray {
    public static void bruteForce(int[] a)
    {
        boolean flag=false;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println("Duplicate element "+a[j]);
                    flag=true;
                }
            }
        }
        if(!flag)
        {
            System.out.println("Duplicate element Not Found");
        }
    }
    public static void extraMemory(int[] a)
    {
        boolean flag=false;
        Set s=new HashSet();
        for(int i=0;i<a.length;i++)
        {
            if(s.contains(a[i]))
            {
                System.out.println("Duplicate element EM"+a[i]);
            }
            else
            {
                s.add(a[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] a={12,341,45,567,567,341,4531};
        bruteForce(a);
        extraMemory(a);
        String[] arr={"java","c","c++","Python","c","java"};
        //Approach 1
        /*boolean flag=false;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Found Duplicate Element:"+arr[i]);
                    flag=true;
                }
            }
        }
        if (!flag)
            System.out.println("Duplicate Element Not Found");*/

        //Approach 2 HashSet
        boolean flag=false;
        HashSet<String> langs=new HashSet<>();
        for (String l:arr)
        {
            if (langs.add(l)==false)
            {
                System.out.println("Found Duplicate Element:"+l);
                flag=true;
            }
        }
        if (!flag)
            System.out.println("Duplicate Element Not Found");

        //First duplicate occurrence
        /*for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("first occurrence of duplicate element:"+arr[i]);
                    return;
                }
            }
        }*/
        //Duplicate using List Set
        String[] duplicates={"java","oracle","c","java"};
        List duplicatelist=Arrays.asList(duplicates);
        Set duplicateSet=new HashSet<>(duplicatelist);
        if (duplicatelist.size()!=duplicateSet.size())
        {
            System.out.println("The array contains duplicates");
        }
        else
        {
            System.out.println("The array doesn't contains duplicates");
        }
        ArrayList l=new ArrayList<>();
        l.add(12);
        l.add(6);
        l.add(8);
        l.add(2);
        l.add(1);
        System.out.println("Original ArrayList elements:"+l);
        Collections.sort(l);
        System.out.println("Sort ArrayList elements:"+l);
        Collections.reverse(l);
        System.out.println("Reverse ArrayList elements:"+l);
    }
}
