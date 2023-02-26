public class Ceiling {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6,9,12,15,17,20};
        int target = 16 ;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]) start = mid + 1;
            else if(target < arr[mid]) end = mid - 1;
            else return mid;
        }
        return start;
    }
}
