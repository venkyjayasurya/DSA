package Algorithms.Sorting;

import java.util.Arrays;
import java.util.Scanner;

class SelectionSort {
    public static void selectionSort(int[] array) {
        int size = array.length;

    }

    public static void main(String[] args) {
//        int[] data = { 20, 12, 10, 15, 2 };

        Scanner in = new Scanner(System.in);

        System.out.println("enter number of elements");
        int size = in.nextInt();

        int[] data = new int[size];

        System.out.println("enter elements");
        for (int i = 0; i < size; i++) {
            data[i] = in.nextInt();
        }

        selectionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
