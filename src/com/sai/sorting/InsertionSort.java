package com.sai.sorting;

public class InsertionSort implements ISort {
    @Override
    public void sort(int arr[]) {
        System.out.println("Inside InsertionSort");
        for (int i = 2; i <= arr.length-1; i++) {
            int v=arr[i];
            int j=i;
            while(arr[j-1]>v && j>=1){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=v;
        }
    }
}
