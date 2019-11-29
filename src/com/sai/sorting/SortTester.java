package com.sai.sorting;

import java.util.Scanner;

public class SortTester {
    public static void main(String args[]) {
        int arr[] = {-12, 5, 1, 4, 8, 9};

        ISort iSort;
        String sortingType;
        Scanner scanner= new Scanner(System.in);
        System.out.println("System supports the following sorts as of now-BubbleSort,InsertionSort,SelectionSort");
        System.out.println("Enter the type of sorting you want..Please enter the class name of that sorting type");
        sortingType= scanner.next();
        try {
            Class c = Class.forName("com.sai.sorting."+sortingType);
            iSort = (ISort) c.newInstance();
            iSort.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}