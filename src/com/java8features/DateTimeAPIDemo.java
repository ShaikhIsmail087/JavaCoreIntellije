package com.java8features;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeAPIDemo {
    public static void main(String[] args) {
//        LocalDate birthDay=LocalDate.of(1765,8,6);
//        LocalDate today=LocalDate.now();
//        Period p=Period.between(birthDay,today);
//        System.out.printf("Age is %d Years %d Months %d Days",p.getYears(),p.getMonths(),p.getDays());
//        System.out.println();

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
        ZoneId zone=ZoneId.systemDefault();
        System.out.println(zone);
        ZoneId la=ZoneId.of("Australia/Sydney");
        ZonedDateTime zt=ZonedDateTime.now(la);
        System.out.println(zt);
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Year Number:");
//        int n=sc.nextInt();
//        Year y=Year.of(n);
//        if (y.isLeap())
//        {
//            System.out.printf("%d Year is Leap Year",n);
//        }
//        else
//        {
//            System.out.printf("%d Year is Not Leap Year",n);
//        }
    }
}
