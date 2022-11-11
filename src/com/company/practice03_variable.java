package com.company;

public class practice03_variable {
    public static void main(String[] args) {
       // String name = "Ismail";
       // System.out.println(name);

        //int myNum = 60;
       // System.out.println(myNum);

       // int myNum;
       // myNum = 15;
       // System.out.println(myNum);

       // int myNum = 15;
       // myNum = 20;
       // System.out.println(myNum);

       // final int myNum = 15;
       // myNum = 20;
       // System.out.println(myNum);

       // System.out.println("Hello " + name);

       // String firstName = "Ismail " ;
       // String lastName = "Shaikh";
       // String fullName = firstName +lastName ;
       // System.out.println(fullName);

       // int x=2, y=4, z=17;
       // System.out.println( x + y + z );

       // int myNum = 26;
       // float myFloatNum = 4.56f;
       // char myLetter = 'R';
      //  boolean myBool = true;
       // String myTxt = "Ismail";
        //System.out.println(myNum);
      //  System.out.println(myFloatNum);
      //  System.out.println(myLetter);
       // System.out.println(myBool);
      //  System.out.println(myTxt);

        byte myNum = 100;
        System.out.println(myNum);

        short myShort = 5000;
        System.out.println(myShort);

        int myInt = 1000000000;
        System.out.println(myInt);

        long myLong = 800000000L;
        System.out.println(myLong);

        float myFloat = 8f;
        System.out.println(myFloat);

        double myDouble = 19.99d;
        System.out.println(myDouble);

        boolean javaIsFun = true;
        boolean catIsFish = false;
        System.out.println(javaIsFun);
        System.out.println(catIsFish);

        char myChar = 'A';
        System.out.println(myChar);

        String greeting = "Assalamualaikum";
        System.out.println(greeting);
//      if else statement

        int age = 18;
        if(age<=20)
            System.out.println("Yes boss you can drive");
        else
            System.out.println("Yes boss you can not drive");
//        logical AND , OR and NOT

        System.out.println("For logical AND...");
        boolean a= false;
        boolean b= true;
        if(a && b)
            System.out.println("Y");
        else
            System.out.println("N");

        System.out.println("For logical OR...");
        if (a || b)
            System.out.println("Y");
        else
            System.out.println("N");

        System.out.println("For logical NOT...");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);
    }
}
