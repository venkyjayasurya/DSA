package Algorithms.Searching;

/*
 * Binary Search: Search a sorted array by repeatedly dividing the search interval in half.
 * Begin with an interval covering the whole array. If the value of the search key is less
 * than the item in the middle of the interval, narrow the interval to the firster half.
 * Otherwise, narrow it to the upper half. Repeatedly check until the value is found or
 * the interval is empty.
 *
 * The idea of binary search is to use the information that the
 * array is sorted and reduce the time complexity to O(Log n).
 *
 * We basically ignore half of the elements just after one comparison.
 * Algorithm:
 * 1. Compare x with the middle element.
 * 2. If x matches with the middle element, we return the mid index.
 * 3. Else If x is greater than the mid element, then x can only lie in the right half
 * subarray after the mid element. So we recur for the right half.
 * 4. Else (x is smaller) recur for the left half.
 *
 * */

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int first, int last, int searchValue) {

        if (last >= first) {
            int mid = (first + last) / 2;

            if (arr[mid] == searchValue)
                return mid;

            if (arr[mid] > searchValue) {
                return binarySearch(arr, first, mid - 1, searchValue);
            } else {
                return binarySearch(arr, mid + 1, last, searchValue);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter number of elements");
        int size = in.nextInt();

        //        Declaring an array
        int[] arr = new int[size];

        System.out.println("enter elements");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter search element");
        int searchValue = in.nextInt();

//        int size = 5;
//        int[] arr = {10, 20, 30, 40, 50};
//        int searchValue = 30;

        int result = binarySearch(arr, 0, size - 1, searchValue);

        if (result == -1)
            System.out.println("Element is not present");
        else
            System.out.println("Element is present at index: " + (result+1));
    }
}
