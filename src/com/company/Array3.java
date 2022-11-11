package com.company;

public class Array3 {
    public static void main(String[] args) {
        int[] a={300,500,800,600,1500,200,1000};
       /* int i,largest=a[0],smallest=a[0];
        for (i=0;i<a.length;i++) {
            if (largest < a[i]) {
                largest = a[i];
            }
            if (smallest > a[i]) {
                smallest = a[i];
            }
        }
            System.out.println("Largest number:"+largest);
        System.out.println("Smallest number:"+smallest);*/
        System.out.println("Original array:");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nsort array:");
        int temp;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
