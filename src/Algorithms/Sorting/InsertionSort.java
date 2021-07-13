package Algorithms.Sorting;

/*
* Here we have two sub-lists in an array -> Sorted sublist and Unsorted sublist
* We will be inserting unsorted sublist elements into sorted sublist one by one
*
* First Array[0] will be considered as the first element of sorted sublist
* And remaining all values i.e, Array[0] to Array[n-1] will be unsorted sublist elements
*
* Worst Case Time Complexity : O(n^2)  => If the array is unsorted
* Best Case Time Complexity  : O(n)    => if the array is sorted
*
* */

import java.util.Scanner;

public class InsertionSort {
    public static void Sort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n;i++){
            int temp = arr[i];              //Second element in the array / First element in the unsorted sublist
            int j = i-1;                    //j value is the sorted sublist last element
            while(j>=0 && arr[j] > temp){   //Loop until sorted element is greater than temp value
                arr[j+1] = arr[j];          // Swap the elements if the previous element is greater than current
                j--;
//                printArray(arr);
//                System.out.printf(" i = %d, j = %d, temp = %d \n", i,j,temp);
            }
            arr[j+1] = temp;
            printArray(arr);
//            System.out.printf(" i = %d, j = %d, temp = %d \n", i,j,temp);
//            System.out.println();
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
        Sort(arr);
        System.out.println("Array after sorting:");
        printArray(arr);
    }
}


/*
*
5   4   10  1   6   2
5   5   10  1   6   2    i = 1, j = -1, temp = 4
4   5   10  1   6   2    i = 1, j = -1, temp = 4

4   5   10  1   6   2    i = 2, j = 1, temp = 10

4   5   10  10  6   2    i = 3, j = 1, temp = 1
4   5   5   10  6   2    i = 3, j = 0, temp = 1
4   4   5   10  6   2    i = 3, j = -1, temp = 1
1   4   5   10  6   2    i = 3, j = -1, temp = 1

1   4   5   10  10  2    i = 4, j = 2, temp = 6
1   4   5   6   10  2    i = 4, j = 2, temp = 6

1   4   5   6   10  10    i = 5, j = 3, temp = 2
1   4   5   6   6   10    i = 5, j = 2, temp = 2
1   4   5   5   6   10    i = 5, j = 1, temp = 2
1   4   4   5   6   10    i = 5, j = 0, temp = 2
1   2   4   5   6   10    i = 5, j = 0, temp = 2
* */