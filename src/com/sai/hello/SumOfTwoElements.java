package com.sai.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SumOfTwoElements {

    public static void main(String args[]){
        int arr[]={1,2,4,5,3,7,9,3};
        SumOfTwoElements s=new SumOfTwoElements();
        List<Integer> tickets=new ArrayList<>();
        tickets.add(1);
        tickets.add(2);
        tickets.add(5);
      /*  tickets.add(4);
        tickets.add(5);*/
        System.out.println(s.waitingTime(tickets,1));
    }
    public long waitingTime(List<Integer> tickets, int p) {
        // Write your code here
        long count=0;
        int [] t=new int[tickets.size()];
        int j=0;
        for(int i: tickets){
            t[j]=i;
            j++;
        }

        for(int k=0;k<=t[p];k++){
            for(int i=0;i<t.length;i++){

                if(t[i]>0){
                    count=count+1;
                    t[i]=t[i]-1;
                }
                if(t[p]==0)
                    break;
            }
        }
        return count;
    }
}
