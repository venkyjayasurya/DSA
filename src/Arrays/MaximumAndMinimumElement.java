package Arrays;

public class MaximumAndMinimumElement {

    static class Pair{
        int min;
        int max;
    }

    static Pair getMinMax(int arr[], int n){
        Pair minmax = new Pair();
        int i;
//        If array has even number of elements then initialize the first two elements as minimum and maximum
        if(n%2 == 0){
            if(arr[0] > arr[1]){
                minmax.max = arr[0];
                minmax.min = arr[1];
            }else{
                minmax.min = arr[0];
                minmax.max = arr[1];
            }
//            Set position to index 2
            i=2;
        }
//        If array has odd numbers of elements then initialize the first element as minimum and maximum
        else{
            minmax.min = arr[0];
            minmax.max = arr[0];
            i=1;
        }
//        In the while loop pick elements in pair and compare the pair with max and min so far

        while (i < n - 1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > minmax.max) {
                    minmax.max = arr[i];
                }
                if (arr[i + 1] < minmax.min) {
                    minmax.min = arr[i + 1];
                }
            } else {
                if (arr[i + 1] > minmax.max) {
                    minmax.max = arr[i + 1];
                }
                if (arr[i] < minmax.min) {
                    minmax.min = arr[i];
                }
            }
//            Increment the index by 2 as two elements are processed in loop
            i += 2;
        }
        return minmax;
    }

    public static void main(String[] args){
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.println("Minimum element is:" + minmax.min);
        System.out.println("Maximum element is:" + minmax.max);
    }
}