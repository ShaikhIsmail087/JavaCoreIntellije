package com.logical;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int input=153;
        System.out.println(countNumberOfDigit(input));

        if(isArmstrong(input))
            System.out.println("The number is armstrong");
        else
            System.out.println("The number is not armstrong");
    }
    public static boolean isArmstrong(int input)
    {
        int j=input;
        int sum=0;
        int digit=0;
        while(j>0)
        {
            digit=j%10;
            j=j/10;
            sum=sum+digit*digit*digit;//if 4 digit then multiply one digit more for checking 1634
        }
        return input==sum;
    }
    public static int countNumberOfDigit(int input)
    {
        int count=0;
        while(input>0)
        {
            input=input/10;
            count++;
        }
        return count;
    }
}
