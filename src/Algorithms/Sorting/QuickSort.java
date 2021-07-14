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
* Time Complexity:
*       Worst Case              -> O(n^2)
*       Best or Average Case    -> O( n log n )
* */

public class QuickSort {

    public static int partition(int[] arr, int lowerBound, int upperBound)
    {
        int pivot = arr[upperBound];
        int i = (lowerBound-1); // index of smaller element
        for (int j=lowerBound; j<upperBound; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[upperBound] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[upperBound];
        arr[upperBound] = temp;

        return i+1;
    }

    public static void Sort(int[] arr, int lowerBounderBound, int upperBound){
        if(lowerBounderBound < upperBound){
            // find pivot element location such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int loc = partition(arr, lowerBounderBound, upperBound);
            Sort(arr, lowerBounderBound, loc-1);
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
        Sort(arr, 0, (arr.length) - 1);
        System.out.println("The Sorted Array is");
        printArray(arr);
    }
}