package Algorithms.Sorting;

/*
* The Sort depends on the keys
*
* */

import java.util.Scanner;

public class CountingSort {

    public static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + "   ");
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of elements");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("enter elements");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
//        int[] arr = {5, 4, 10, 1 ,6, 2};
        printArray(arr);
//        Sort(arr);
//        System.out.println("Array after sorting:");
//        printArray(arr);
    }
}
