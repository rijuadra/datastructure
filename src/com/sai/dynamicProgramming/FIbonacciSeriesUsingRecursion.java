package com.sai.dynamicProgramming;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class FIbonacciSeriesUsingRecursion {
    public static void main(String args[]) {
        FIbonacciSeriesUsingRecursion fib = new FIbonacciSeriesUsingRecursion();
        System.out.println("Enter the length of fibonacci series");
        Scanner sc = new Scanner(System.in);
        long length = sc.nextLong();
        Calendar c=new GregorianCalendar();
        long startTime=c.getTimeInMillis();
        System.out.println(fib.fibo(length));
        Calendar c1=new GregorianCalendar();
        long endTime=c1.getTimeInMillis();
        System.out.println(endTime-startTime);
    }

    public long fibo(long i) {
        if (i == 0 || i == 1) {
            return i;
        } else
            return fibo(i - 1) + fibo(i - 2);
    }
}
