package Algorithms.Sorting;

/*
* It is not a comparsion sort
* The Sort depends on the keys
*   Counting the elements having distinct key values
*
* Ex: 1 0 2 1 0 1 1 5 6 7 5 4 2 2 0 0 1
* n = 17
* Range is from 0 to 7 => the array contains 0 to 7 numbers that is range
* therefore K = 7
*
* range case 1 => 0 <= arr[i] <= k
* range case 2 => arr[i] belongs to Integer
*
*
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
