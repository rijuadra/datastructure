package com.sai.hello;

import java.util.Scanner;

public class RegexTest {
    public static void main(String args[]){
        System.out.println("enter ip to check");
        Scanner sc=new Scanner(System.in);
        String ip=sc.nextLine();
        if(ip.matches("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{1,2}|[0-9]{1,2}|[0-9]).){3}(25[0-5]|2[0-4][0-9]|[0-1][0-9]{1,2}|[0-9]{1,2}|[0-9])")){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }
    }
}
