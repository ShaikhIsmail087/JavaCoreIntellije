package com.java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JodaTimeAPI {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);
        int dd=date.getDayOfMonth();
        int mm=date.getMonthValue();
        int yy=date.getYear();
        System.out.println(dd+"..."+mm+"..."+yy);
        System.out.printf("%d-%d-%d",dd,mm,yy);
        System.out.println();

        LocalTime time=LocalTime.now();
        System.out.println(time);
        int h=time.getHour();
        int m=time.getMinute();
        int s=time.getSecond();
        int n=time.getNano();
        System.out.printf("%d:%d:%d:%d",h,m,s,n);
        System.out.println();

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
        int dd1=date.getDayOfMonth();
        int mm1=date.getMonthValue();
        int yy1=date.getYear();
        int h1=time.getHour();
        int m1=time.getMinute();
        int s1=time.getSecond();
        int n1=time.getNano();
        System.out.printf("Date : %d-%d-%d",dd1,mm1,yy1);
        System.out.printf("\nTime : %d:%d:%d:%d",h1,m1,s1,n1);

        LocalDateTime dt1=LocalDateTime.of(1995,05,28,12,45);
        System.out.println(dt1);
        System.out.println("After six Months:"+dt1.plusMonths(6));
        System.out.println("Before six Months:"+dt1.minusMonths(6));
    }
}
