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
     1. Find the mid point to divide the array into two halves:
             mid m = l+ (r-l)/2
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
    public static void merge(int[] arr, int LowerBound, int mid, int UpperBound) {
//        Merge two sub arrays of arr[]
//        First Subarray is arr[l ... m]
//        Second Subarray is arr[m ... r]
        int n1 = mid - LowerBound + 1;
        int n2 = UpperBound - mid;

//        Create temporary arrays
        int[] LowerBoundArr = new int[n1];
        int[] UpperBoundArr = new int[n2];

//        Copy Data to temp arrays
        for (int i = 0; i < n1; i++)
            LowerBoundArr[i] = arr[LowerBound + i];
        for (int j = 0; j < n2; j++)
            UpperBoundArr[j] = arr[mid + 1 + j];

//        Merge the temporary arrays
//        Initial indexes of first and second sub arrays
        int i = 0, j = 0;
//        Initial index of merged subarray
        int k = LowerBound;
        while (i < n1 && j < n2) {
            if (LowerBoundArr[i] <= UpperBoundArr[j]) {
                arr[k] = LowerBoundArr[i];
                i++;
            } else {
                arr[k] = UpperBoundArr[j];
                j++;
            }
            k++;
        }

//        Copy remaining elements of LowerBoundArr[] if any
        while (i < n1) {
            arr[k] = LowerBoundArr[i];
            i++;
            k++;
        }

//        Copy remaining elements of LowerBoundArr[] if any
        while (j < n2) {
            arr[k] = UpperBoundArr[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int LowerBound, int UpperBound) {
        if (LowerBound < UpperBound) {
//            Find the mid value
            int mid = LowerBound + (UpperBound - LowerBound) / 2;
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
        printArray(arr);
    }
}
