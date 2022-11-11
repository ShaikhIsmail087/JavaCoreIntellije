package com.logical;
//Natural number>1
//which has only two factors 1 and itself
public class LogicPrimeNumber {
    public static void main(String[] args) {
        /*int num=63;
        int count=0;
        if(num>1)
        {
            for (int i=1;i<=num;i++)
            {
                if (num%i==0)
                    count++;
            }
            if(count==2)
            {
                System.out.println("Prime Number");
            }
            else
            {
                System.out.println("Not Prime Number");
            }
        }
        else
        {
            System.out.println("Not Prime Number");
        }*/

        boolean flag=false;
        for (int i=2;i<=100;i++)
        {
            for (int j=2;j<i;j++)
            {
                if (i%j==0)
                {
                    flag=true;
                }
            }
            if (flag==false)
            {
                System.out.println(i+" Prime Number");
            }
            flag=false;
        }
    }
}
