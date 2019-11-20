package com.company;

public class Sortvst {

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public void sort(int[] a) {
        int j, temp;
        for (int i = 0; i < a.length; i++) {
            temp = a[i];
            for (j = i - 1; j >= 0 && a[j] > temp; j--) {
                a[j + 1] = a[j];

            }
            a[j + 1] = temp;

        }
        System.out.println();
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

    }
}
