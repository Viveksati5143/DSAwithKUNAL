public class Main {
    public static void main(String[] args) {
        int[] nums = {1,4,9,17,58,81,93};
        int target = 17;
//        int res = linearSearch(nums, target);
//        int res = linearSearch2(nums, target);
        boolean res = linearSearch3(nums, target);
        System.out.println(res);
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length<1) return -1;
        for(int index=0;index<arr.length;index++){
            int element = arr[index];
            if(element == target) return index;
        }
        return -1;
    }
    static int linearSearch2(int[] arr, int target){
        if(arr.length<1) return -1;
        for (int element : arr) {
            if (element == target) return element;
        }
        return Integer.MAX_VALUE;
    }
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length<1) return false;
        for (int element : arr) {
            if (element == target) return true;
        }
        return false;
    }
}