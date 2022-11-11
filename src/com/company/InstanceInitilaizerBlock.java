package com.company;

import java.util.Arrays;

public class InstanceInitilaizerBlock {
    private int english,hindi,math;
    private int total;
    InstanceInitilaizerBlock()
    {
        english=hindi=math=0;
    }
    {total=0;
        System.out.println("Total initializer block is zero");}
    InstanceInitilaizerBlock(int e,int h,int m)
    {
        english=e;
        hindi=h;
        math=m;
    }
    void printDetails()
    {  total=english+hindi+math;
        double result=(total/300d)*100d;
        System.out.print("\nmarks are"+"\nenglish="+english+"\nhindi="+hindi+"\nmath="+math+"\ntotal="+result);
    }
    public static void main(String[] args) {
        InstanceInitilaizerBlock i=new InstanceInitilaizerBlock();
        InstanceInitilaizerBlock i1=new InstanceInitilaizerBlock(97,84,99);
        i.printDetails();
        i1.printDetails();

        int[] z={9,4,1,6,3,8,5};
        int size= z.length;
        Arrays.sort(z);
        System.out.println();
        System.out.println(Arrays.toString(z));
        System.out.println(z[size-2]);

    }
}

