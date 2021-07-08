/*
 * Linear search is rarely used practically because other search algorithms
 * such as the binary search algorithm and hash tables allow significantly
 * faster-searching comparison to Linear search.
 *
 * Time Complexity O(n)
 * */

package Algorithms.Searching;

import java.util.Scanner;

public class LinearSearch {

    public static int search(int arr[], int searchValue) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == searchValue)
                return i+1;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter number of elements");
        int size = in.nextInt();

//        Declaring an array
        int[] arr =new int[size];

        System.out.println("enter elements");
        for(int i=0;i<size;i++){    //Inputing array values
            arr[i]=in.nextInt();
        }

//        int arr[] = {2, 3, 4, 10, 30};
        System.out.println("Enter search element");
        int searchValue = in.nextInt();

        int result = search(arr, searchValue);
        if (result == -1)
            System.out.println("Element is not present");
        else
            System.out.println("Element is present at index: " + result);
    }
}


