package com.sai.sorting;

public class QuickSort implements ISort{

    @Override
    public void sort(int[] arr) {

        int start=0;
        int end=arr.length;
        this.quickSort(arr,start,end);
    }

    private void quickSort(int[] arr, int start, int end) {
        if(start<end) {
            int pivotFinalIndex = this.partition(arr, start,end);
            quickSort(arr, start, pivotFinalIndex - 1);
            quickSort(arr, pivotFinalIndex + 1, arr.length);
        }
    }

    private int partition(int[] arr, int start, int end) {
        int pivotElement = arr[end-1];
        int pIndex=0;
        for(int i=0;i<end-1;i++){
            if(arr[i]<=pivotElement){
                swap(arr,i,pIndex);
                pIndex++;
            }
        }
        swap(arr,end-1,pIndex);
        return pIndex;
    }

    private void swap(int[] arr, int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
