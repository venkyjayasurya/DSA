package Algorithms.Sorting;

/*
 * Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves,
 * calls itself for the two halves, and then merges the two sorted halves.
 * The merge() function is used for merging two halves.
 * The merge(arr, lowerBound, mid, upperBound) is a key process
 * that assumes that arr[lowerBound..mid] and arr[mid+1..upperBound] are
 * sorted and merges the two sorted sub-arrays into one.

 * Simple Algorithm:
 * MergeSort(arr[], lowerBound,  upperBound)
    If (LowerBound < UpperBound)
     1. Find the mid point to divide the array into two halves:
             mid = (lowerBound + UpperBound )/2
     2. Call mergeSort for first half:
             Call mergeSort(arr, lowerBound, mid)
     3. Call mergeSort for second half:
             Call mergeSort(arr, mid+1, UpperBound)
     4. Merge the two halves sorted in step 2 and 3:
             Call merge(arr, lowerBound, mid, upperBound)
 *
 *
 * The Worst Case and Best case time complexity of the mergesort is O(n log n)
 *
 * Time Complexity: Merge Sort is a recursive algorithm and time complexity
 * can be expressed as following recurrence relation.
        T(n) = 2T(n/2) + θ(n)
 *
 * */


public class MergeSort {
    public static void merge(int[] arr, int LowerBound, int mid, int UpperBound) {
        //i is the pointer for the lowerbound subarray
        // j is the pointer of upperbound subarray
        // k is the pointer for the sorted array

        // Initial indexes of first and second sub arrays
        int i = LowerBound;
        int j = mid + 1;
        int k = LowerBound;

        //        Create temporary array
        int[] sortedArr = new int[arr.length];

        while (i <= mid && j <= UpperBound) {
            if (arr[i] <= arr[j]) {
                sortedArr[k] = arr[i];
                i++; //Increase the first subarray pointer value
            } else {
                sortedArr[k] = arr[j];
                j++;  //Increase the second subarray pointer value
            }
            k++;    //Increase the sorted array pointer value
        }

        //        Copy remaining elements of second sub array if any
        if (i > mid) {
            while (j <= UpperBound) {
                sortedArr[k] = arr[j];
                j++;
                k++;
            }
        } else {
            //        Copy remaining elements of first sub array if any
            while (i <= mid) {
                sortedArr[k] = arr[i];
                i++;
                k++;
            }
        }

        //Copy all the elements of sortedArray to unsorted array
        for (k = LowerBound; k <= UpperBound; k++) {
            arr[k] = sortedArr[k];
        }
    }

    public static void mergeSort(int[] arr, int LowerBound, int UpperBound) {
        if (LowerBound < UpperBound) {
//            Find the mid value
            int mid = (LowerBound + UpperBound)  / 2;
//            Sort first and second halves
            mergeSort(arr, LowerBound, mid);
            mergeSort(arr, mid + 1, UpperBound);
//            Now Merge two sorted values
            merge(arr, LowerBound, mid, UpperBound);
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array is");
        printArray(arr);
    }
}