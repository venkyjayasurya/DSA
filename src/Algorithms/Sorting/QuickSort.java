package Algorithms.Sorting;

/*
* Quick Sort is also called as Partition exchange method;
* Quick Sort is based on divide and conquer technique
* The Array is divided into sub arrays
*
* Let the first element is the pivot alement
* The elements less than the pivot element goes to left side of the pivot
* and similarly the values greater than pivot element goes to right side of the pivot
*                                 key
*            {  Partion 1 }    |  Pivot  |   {  Partion 2  }
*           values < pivot                    values > pivot
*
*
* Time Complexity:
*       Worst Case              -> O(n^2)
*       Best or Average Case    -> O( n log n )
* */

public class QuickSort {

    public static int partition(int[] arr, int lowerBound, int upperBound){
        int pivot = arr[lowerBound];
        int start = lowerBound;
        int end = upperBound;

        while(start < end){
            while(arr[start] <= pivot){
                start++;
            }

            while(arr[end] > pivot){
                end--;
            }

            if(start < end){
//            swap(arr[start], arr[end]);
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

//        swap(arr[lowerBound] , arr[end]
        int temp = arr[lowerBound];
        arr[lowerBound] = arr[end];
        arr[end] = temp;
        return end;
    }

    public static void Sort(int[] arr, int lowerBound, int upperBound){
        if(lowerBound < upperBound){
            int loc = partition(arr, lowerBound, upperBound);
            Sort(arr, lowerBound, loc-1);
            Sort(arr, loc+1, upperBound);
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {7, 6, 10, 5, 9, 2, 1, 15, 7};
        printArray(arr);
        Sort(arr, 0, arr.length-1);
        System.out.println("The Sorted Array is");
        printArray(arr);
    }
}