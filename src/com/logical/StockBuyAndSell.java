package com.logical;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] array={5,20,3,80,100};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<array.length;i++)
        {
            if (array[i]<min)
            {
                min=array[i];
            }
            if (array[i]-min>max)
            {
                max=array[i]-min;
            }
        }
        System.out.println("Max Profit="+max);
        System.out.println("Min Profit="+min);
    }
}
