package Algorithms.Sorting;

/*
* Radix Sort is applied digit by digit or on place values of the array element
* {678, 111, 234, 980, 142, 4}
*  1 9 9
*  2 1 0   <- Start from Least Significant bit
*
* Find max data first say 980
* and make all the numbers to the same size say make all the elements of 3 digits size
* */

public class RadixSort {

    public static int getMax(int[] arr, int size){
        int max = arr[0];
        for(int i=0; i<size;i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void sort(int[] arr, int size){
        int max = getMax(arr, size);

        for(int pos = 1; max/pos>0; pos*10){
            countSort(Arr, size, pos);
        }
    }

    public static void main(String[] args){
    int[] arr = {678, 1111, 234, 980, 142, 4};
    int size = arr.length;
    }
}
