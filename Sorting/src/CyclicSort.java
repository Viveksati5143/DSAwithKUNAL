import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4,7,6,10,9,11,8,14,12,13}; // All values of 1 to n should be present
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) swap(arr, i, correct);
            else i++;
        }
    }

    static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }
}