package com.sai.dynamicProgramming;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class FibonacciSeriesUsingDynamicProgramming {
    public static void main(String args[]) {
        FibonacciSeriesUsingDynamicProgramming fib = new FibonacciSeriesUsingDynamicProgramming();
        System.out.println("Enter the length of fibonacci series");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Calendar c=new GregorianCalendar();
        long startTime=c.getTimeInMillis();
        System.out.println(fib.fibo(length));
        Calendar c1=new GregorianCalendar();
        long endTime=c1.getTimeInMillis();
        System.out.println(endTime-startTime);
    }
    private long fibo(int n){
        long fib[]=new long[n+2];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];
    }
}
