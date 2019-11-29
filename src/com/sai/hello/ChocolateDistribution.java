package com.sai.hello;

import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int total=0;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(Integer.parseInt(arr[i])<0)
                flag=1;
           total=total+Integer.parseInt(arr[i]);
        }
        if (total% 2 == 0 && flag==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
