public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(maxRange(arr, 1, 3));
    }

    static int maxRange(int[] arr, int start, int end){

        if (start > end) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int maxVal = arr[0];
        for(int i=start;i<=end;i++){
            if(arr[i]>maxVal) maxVal = arr[i];
        }
        return maxVal;
    }
}