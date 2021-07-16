package Algorithms.Sorting;

/*
* It is not a comparsion sort
* The Sort depends on the keys
*   Counting the elements having distinct key values
*
* Ex: 1 0 2 1 0 1 1 5 6 7 5 4 2 2 0 0 1
* n = 17    => total elements
* Range is from 0 to 7 => the array contains 0 to 7 numbers that is range
* therefore K = 7
*
* range case 1 => 0 <= arr[i] <= k
*       case 2 => arr[i] belongs to Integer
*   case 2 is not followed because Integers can be negative but counting sort is not applicable for negative numbers
*
* Time Complexity : O(n+k)  n = elements, k = element range
*
* Drawback:
*  1.  k is not feasible because if we have the value of k as 1000 then we need to create a array of 1000 values
*  2.  cannot be applied for negative values and floating values
* */

import java.util.Scanner;

public class CountingSort {

    public static void Sort(int[] arr, int size){
        int[] output = new int[size+1];

        //Finding max element in the array arr
        int max = arr[0];
        for(int i=0; i<size; i++){
            if(arr[i]>max)
                max = arr[i];
        }

//        Creating an array for counting the elements
        int[] count = new int[max+1];

//        Initializing count array with all zeros
        for(int i=0; i<max; i++){
            count[i] = 0;
        }

//        Storing the count of each element of the arr in the count array
        for(int i=0; i< size; i++){
            count[arr[i]]++;
        }

//        Storing the overall count of each element of the array
        for(int i=1; i<=max; i++){
            count[i] = count[i] + count[i-1];
        }





    }


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

        Sort(arr, size);
//        System.out.println("Array after sorting:");
//        printArray(arr);
    }
}
