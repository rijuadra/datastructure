package com.sai.sorting;

public class SelectionSort implements ISort {
    @Override
    public void sort(int[] arr) {
        System.out.println("Inside Selection Sort");
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[min]){
                   min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }

    }


}
