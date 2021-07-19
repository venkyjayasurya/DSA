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

    public static void countSort(int[] arr, int size, int pos){
        int[] count = new int[size];
        int[] temp = new int[size];

//        Initialize count array to 0
        for (int i = 0; i < size; i++)
            count[i] = 0;

//        Calculate count of each elements
        for(int i=0; i<size; i++){
            ++count[(arr[i]/pos) % 10];
        }

//        Calculate Cumulative Count i.e., add current element (i) with previous element (i-1) in the count array
        for(int i=1; i < 10; i++){
            count[i] += count[i-1];
        }

//        Place the elements in the sorted array wrt to the digit position
        for(int i=size-1; i>=0 ; i--){
            temp[++count[(arr[i]/pos) % 10]] = arr[i];
        }

//        Copy all elements from temp to original array(arr)
        for(int i=0; i< size; i++) {
            arr[i] = temp[i];
        }
    }

    public static void sort(int[] arr, int size){
//        Get maximum element from the array
        int max = getMax(arr, size);

//        Apply Counting Sort to the sort elements based on place values
        for(int pos = 1; (max/pos)>0; pos *= 10){
            countSort(arr, size, pos);
        }
    }

    public static void main(String[] args){
    int[] arr = {678, 1111, 234, 980, 142, 4};
    int size = arr.length;
    sort(arr, size);
    }
}
