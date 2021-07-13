package Algorithms.Sorting;

/*
* Here we have two sublists in an array -> Sorted sublist and Unsorted sublist
* We will be inserting unsorted sublist elements into sorted sublist one by one
*
* First Array[0] will be considered as the first element of sorted sublist
* And remaining all values i.e, Array[0] to Array[n-1] will be unsorted sublist elments
*
* Worst Case Time Complexity : O(n^2)  => If the array is unsorted
* Best Case Time Complexity  : O(n)    => if the array is sorted
*
* */


public class InsertionSort {

    public static void Sort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n;i++){
            int temp = arr[i];              //Second element in the array / First element in the unsorted sublist
            int j = i-1;                    //j value is the sorted sublist last element
            while(j>=0 && arr[j] > temp){   //Loop until sorted element is greater than temp value

                arr[j+1] = arr[j];          // Swap the elements if the previous element is greater than current
                j--;
                printArray(arr);
                System.out.printf(" i = %d, j = %d, temp = %d \n", i,j,temp);
            }
            arr[j+1] = temp;
            System.out.printf(" i = %d, j = %d, temp = %d \n", i,j,temp);
            printArray(arr);
            System.out.println();
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) System.out.print(i + "   ");
//        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {5, 4, 10, 1 ,6, 2};
        printArray(arr);
        System.out.println();
        Sort(arr);
        printArray(arr);
    }
}
