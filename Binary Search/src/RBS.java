public class RBS {
    public static void main(String[] args) {
//        int[] arr = {4,5,6,7,0,1,2};
        int[] arr = {4,4,5,6,7,0,1,1,2};
        int target = 1;
        System.out.println(search2(arr,target));
    }

    static int search(int[] nums, int target){
        int pivot = pivot(nums);
        if(pivot == -1) return binarySearch(nums,target,0,nums.length-1);
        if (nums[pivot]==target) return pivot;
        if (target >= nums[0]) return binarySearch(nums,target,0,pivot-1);
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }
    static int search2(int[] nums, int target){
        int pivotwithDupli = pivotWithDuplicates(nums);
        if(pivotwithDupli == -1) return binarySearch(nums,target,0,nums.length-1);
        if (nums[pivotwithDupli]==target) return pivotwithDupli;
        if (target >= nums[0]) return binarySearch(nums,target,0,pivotwithDupli-1);
        return binarySearch(nums,target,pivotwithDupli+1,nums.length-1);
    }
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid>start && arr[mid]<arr[mid-1]) return mid -1;
            if(mid<end && arr[mid]>arr[mid+1]) return mid;
            if(arr[mid]<=arr[start]) end = mid-1;
            else start = mid+1;
        }
        return -1;
    }
    static int pivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid > start && arr[mid] < arr[mid - 1]) return mid - 1;
            if (mid < end && arr[mid] > arr[mid + 1]) return mid;
//            if elements at the start, mid, end are equal then skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) return start;
                start++;
                if (arr[end] < arr[end - 1]) return end - 1;
                end--;
            } else if (arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end]) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
//            int mid = (start + end)/2 not applicable for adding large sets of integers
            int mid = start + (end - start)/2;
            if(target > arr[mid]) start = mid + 1;
            else if(target < arr[mid]) end = mid-1;
            else return mid;
        }
        return -1;
    }
}