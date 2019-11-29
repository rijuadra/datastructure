package com.sai.hello;

import java.util.Scanner;

public class TilePainting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int flag=0;
        int noOfTiles=sc.nextInt();
        if(noOfTiles==1)
            System.out.println(1);
        for(int i=2;i<=noOfTiles;i++){
            if(noOfTiles%i==0){
                System.out.println(i);
                flag=1;
                break;
            }
        }
    }
}
