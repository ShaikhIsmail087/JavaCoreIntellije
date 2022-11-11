package com.logical;

public class IndexInArray {
    public static void main(String[] args) {
        String[] colors={"Red","Green","Blue","Orange","Black"};
        int index=0;
        for (int i=0;i< colors.length;i++)
        {
            if (colors[i]=="Black")
            {
                index=i;
            }
        }
        System.out.println("Index="+index);
    }
}
