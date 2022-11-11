package com.company;

public class Array1 {

    public static void main(String[] args) {
        int[] arr={1, 2, 8, 3, 2, 2, 2, 5, 1 };
        int[] frequency=new int[arr.length];
        int counted=-1;
        for (int i=0;i<arr.length;i++)
        {
            int count=1;
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    count++;

                    frequency[j] = counted;
                }
            }
            if (frequency[i]!=counted)
                frequency[i]=count;
        }
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for (int i=0;i<frequency.length;i++)
        {
            if (frequency[i]!=counted)
                System.out.println("    " + arr[i] + "    |    " + frequency[i]);
        }
        System.out.println("---------------------------------------");
    }
}
