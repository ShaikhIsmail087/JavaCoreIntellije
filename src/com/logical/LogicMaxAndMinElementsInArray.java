package com.logical;

public class LogicMaxAndMinElementsInArray {
    public static void main(String[] args) {
        int[] a={50,100,40,20,60};
        int max=a[0];
        for (int i=1;i<a.length;i++)
        {
            if (max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println("Maximum Element is array is:"+max);
        int min=a[0];
        for (int i=1;i<a.length;i++)
        {
            if (min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("Minimum Element is array is:"+min);
    }
}
