package Algorithms.Sorting;

import java.util.Arrays;
import java.util.Scanner;

class SelectionSort {
    public static void selectionSort(int[] array) {
        int size = array.length;

        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;

            for (int i = step + 1; i < size; i++) {

                // To sort in descending order, change > to < in this line.
                // Select the minimum element in each loop.
                if (array[i] < array[min_idx]) {
                    min_idx = i;
                }
            }

            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
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
