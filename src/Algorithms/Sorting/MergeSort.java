package Algorithms.Sorting;

/*
 * Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves,
 * calls itself for the two halves, and then merges the two sorted halves.
 * The merge() function is used for merging two halves.
 * The merge(arr, l, m, r) is a key process that assumes that arr[l..m] and arr[m+1..r] are
 * sorted and merges the two sorted sub-arrays into one.
 * Simple Algorithm:
 * MergeSort(arr[], l,  r)
    If r > l
     1. Find the middle point to divide the array into two halves:
             middle m = l+ (r-l)/2
     2. Call mergeSort for first half:
             Call mergeSort(arr, l, m)
     3. Call mergeSort for second half:
             Call mergeSort(arr, m+1, r)
     4. Merge the two halves sorted in step 2 and 3:
             Call merge(arr, l, m, r)
 *
 *
 * Time Complexity: Merge Sort is a recursive algorithm and time complexity
 * can be expressed as following recurrence relation.
        T(n) = 2T(n/2) + θ(n)
 *
 * */


public class MergeSort {
    public static void merge(int[] arr, int left, int middle, int right) {
//        Merge two sub arrays of arr[]
//        First Subarray is arr[l ... m]
//        Second Subarray is arr[m ... r]
        int n1 = middle - left + 1;
        int n2 = right - middle;

//        Create temporary arrays
        int[] LeftArr = new int[n1];
        int[] RightArr = new int[n2];

//        Copy Data to temp arrays
        for (int i = 0; i < n1; i++)
            LeftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            RightArr[j] = arr[middle + 1 + j];

//        Merge the temporary arrays
//        Initial indexes of first and second sub arrays
        int i = 0, j = 0;
//        Initial index of merged subarray
        int k = left;
        while (i < n1 && j < n2) {
            if (LeftArr[i] <= RightArr[j]) {
                arr[k] = LeftArr[i];
                i++;
            } else {
                arr[k] = RightArr[j];
                j++;
            }
            k++;
        }

//        Copy remaining elements of LeftArr[] if any
        while (i < n1) {
            arr[k] = LeftArr[i];
            i++;
            k++;
        }

//        Copy remaining elements of LeftArr[] if any
        while (j < n2) {
            arr[k] = RightArr[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
//            Find the middle value
            int middle = left + (right - left) / 2;
//            Sort first and second halves
            sort(arr, left, middle);
            sort(arr, middle + 1, right);
//            Now Merge two sorted values
            merge(arr, left, middle, right);
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        printArray(arr);
        sort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
