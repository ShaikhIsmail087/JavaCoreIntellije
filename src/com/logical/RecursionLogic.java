package com.logical;

public class RecursionLogic {
    static int n1=0,n2=1,n3=0;
    //Fibonacci Recursion
    static void fib(int m)
    {
        if(m>0)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            fib(m-1);
        }
    }
    //Factorial Recursion
    static int factorial(int n)
    {
        if(n==1)
            return 1;
        else
            return (n*factorial(n-1));
    }
    //reverse String Recursion
    static String recursiveStringReverse(String s)
    {
        if(s.isEmpty())
        {
            return s;
        }
        else
        {
            return recursiveStringReverse(s.substring(1))+s.charAt(0);
        }
    }
    //recursion array to find max and min
    public static int findMaxRec(int A[], int n)
    {
        // if size = 0 means whole array
        // has been traversed
        if(n == 1)
            return A[0];

        return java.lang.Math.max(A[n-1], findMaxRec(A, n-1));
    }
    public static void main(String[] args)throws Exception
    {
        int A[] = {1, 4, 45, 6, -50, 10, 2};
        int n = A.length;
        // Function calling
        System.out.println(findMaxRec(A, n));

        RecursionLogic l=new RecursionLogic();
        String s1=l.recursiveStringReverse("Javatpoint");
        String s2=l.recursiveStringReverse("Computer");
        String s3=l.recursiveStringReverse("India");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("The factorial of 5 is "+factorial(5));
        int m=20;
        System.out.print(n1+" "+n2);
        fib(m-2);

        //gcd program
        int a=100,b=60;
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        System.out.printf("GCD of a and b is: " +b);
    }
}
