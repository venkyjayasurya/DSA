package Algorithms.Sorting;

/*
* Bubble sort is a simple sorting algorithm. This sorting algorithm is comparison-based algorithm
* in which each pair of adjacent elements is compared and the elements are swapped if they are not
* in order. This algorithm is not suitable for large data sets as its average and worst case complexity
* are of Ο(n2) where n is the number of items.
*
* Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
* Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
* */

import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) System.out.println(i);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter number of elements");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.println("enter elements");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

//        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        printArray(arr);
        bubbleSort(arr);
        System.out.println("Sorted array is");
        printArray(arr);
    }
}
