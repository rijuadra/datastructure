package com.sai.sorting;

public class MergeSort implements ISort {
    @Override
    public void sort(int[] arr) {
        mergeSort(arr);
    }

    private int[] mergeSort(int arr[]) {
        if(arr.length>1) {
            int length = arr.length;
            int leftLen = length / 2;
            int rightLen = length - leftLen;
            int leftArr[] = new int[leftLen];
            int rightArr[] = new int[rightLen];
            for (int i = 0; i < leftLen; i++) {
                leftArr[i] = arr[i];
            }
            for (int i = 0, j = leftLen; j < length; j++, i++) {
                rightArr[i] = arr[j];
            }
            mergeSort(leftArr);
            mergeSort(rightArr);
            merge(arr, leftArr, rightArr);
        }
        return arr;
    }

    private int[] merge(int arr[],int[] leftArr, int[] rightArr) {
        int j=0,k=0;
        for(int i=0;i<arr.length;i++){
            if(j==leftArr.length){
                arr[i]=rightArr[k];
                k++;
            }
            else if(k==rightArr.length){
                arr[i]=leftArr[j];
                j++;
            }
            else if(leftArr[j]>rightArr[k]){
                arr[i]=rightArr[k];
                k++;
            }else{
                arr[i]=leftArr[j];
                j++;
            }
        }
        return arr;
    }
}
