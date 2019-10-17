package com.sai.hello;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class StringPermutation {
    private static int count = 0;

    public static void main(String args[]) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringPermutation stringPermutation = new StringPermutation();
        stringPermutation.permute(s, 0);
        System.out.println("Total permuation " + count);
    }

    public void permute(String s, int j) {
        char a[] = s.toCharArray();
        char temp;
        for (int i = j; i < s.length(); i++) {
            temp = a[j];
            a[j] = a[i];
            a[i] = temp;
            if (j == s.length() - 2) {
                System.out.println(String.valueOf(a));
                count++;
            }
            permute(String.valueOf(a), j + 1);
        }
    }

}
