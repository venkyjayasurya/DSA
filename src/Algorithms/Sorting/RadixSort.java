package Algorithms.Sorting;

/*
* Radix Sort is applied digit by digit or on place values of the array element
* {678, 111, 234, 980, 142, 4}
*  1 9 9
*  2 1 0   <- Start from Least Significant bit
*
* Find max data first say 980
* and make all the numbers to the same size say make all the elements of 3 digits size
*
*
*   Time Complexity: O(d*(n+k))
*   Space Complexity: O(n+k)

## Radix Sort Applications
Radix sort is implemented in
    DC3 algorithm (Kärkkäinen-Sanders-Burkhardt) while making a suffix array.
    places where there are numbers in large ranges.
*
* */

public class RadixSort {

//    Function to get the largest element from an array
    public static int getMax(int[] arr, int size){
        int max = arr[0];
        for(int i=0; i<size;i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void countingSort(int[] arr, int size, int pos) {
        int[] output = new int[size + 1];
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] count = new int[max + 1];

        for (int i = 0; i < max; i++) {
            count[i] = 0;
        }

        // Calculate count of elements
        for (int i = 0; i < size; i++) {
            count[(arr[i] / pos) % 10]++;
        }

        // Calculate cumulative count
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // place the elements in sorted order
        for (int i = size - 1; i >= 0; i--) {
            output[count[(arr[i] / pos) % 10] - 1] = arr[i];
            count[(arr[i] / pos) % 10]--;
        }

//        Copy all elements from temp to original array
        for (int i = 0; i < size; i++) {
            arr[i] = output[i];
        }
    }

    public static void sort(int[] arr, int size){
//        Get maximum element from the array
        int max = getMax(arr, size);

//        Apply Counting Sort to the sort elements based on place values
        for (int pos = 1; max / pos > 0; pos *= 10){
            countingSort(arr, size, pos);
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args){
    int[] arr = {121, 432, 564, 23, 1, 45, 788};
    int size = arr.length;
    printArray(arr);
    sort(arr, size);
    System.out.println("After Sorting:");
    printArray(arr);
    }
}
