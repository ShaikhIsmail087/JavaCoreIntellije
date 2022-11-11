package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Properties;
import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
      /*  int n = 155;
        int temp=n;
        int r,sum=0;

        while (n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum + r*r*r;
        }
        if(temp==sum)
            System.out.println("Its an Armstrong number");
        else
            System.out.println("Its not an Armstrong number");


        // program on prime number

      int number = 1013;
      boolean flag = false;
      for (int i = 2; i <= number/2; ++i){
          if (number % i ==0){
              flag = true;
              break;
          }
      }
      if (!flag){
          System.out.println(number + " is a prime number.");
      }
      else {
          System.out.println(number + " is not a prime number.");
      }

       */
        //program on odd and even number
        ArrayList<Integer> l=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        String s=sc.nextLine();
        while (!s.isBlank())
        {
            int i=Integer.parseInt(s);
            l.add(i);
            s=sc.nextLine();
        }
        Collections.sort(l);
        System.out.println("The largest number:"+l.get(0));
        System.out.println("The smallest number:"+l.get(l.size()-1));

        Properties p=System.getProperties();
            p.list(System.out);
    }
}
