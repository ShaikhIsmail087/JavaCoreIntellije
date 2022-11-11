package com.company;

import java.util.*;

public class CollectionDemo {
   public static void main(String[] args) {
      int[] a={17,26,37,48,58};
      int i,largest=0,smallest=0,sum=0;
      for (i=0;i<a.length;i++)
      {
         for (int j=0;j<a.length;j++)
         {
            if (i!=j)
            {
               sum +=a[j];
            }
         }
         if (sum>largest)
         {
            largest=sum;
         } else if (largest < smallest) {
            smallest=sum;
         }
         System.out.print(sum+" ");
         sum=0;
      }
      System.out.println("\nlargest: "+largest);
      System.out.println("smallest: "+smallest);
   }
}
