import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,-2,-34,-12,0,3,4};
//        bubble(arr);
//        selection(arr);
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]) swap(arr, j, j-1);
                else break;
            }
        }
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = getmaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int maxIndex, int last) {
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
    }

    static int getmaxIndex(int[] arr,int start, int last){
        int max = start;
        for (int i = 0; i <= last; i++) {
            if(arr[max]<arr[i]) max = i;
        }
        return max;
    }

    static void bubble(int[] arr) {
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped = false;
            for(int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}