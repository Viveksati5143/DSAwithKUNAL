import java.util.ArrayList;
import java.util.Arrays;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6,7};
//        System.out.println(findIndex(arr, 6, 0));
//        findAllIndex(arr,4,0);
//        System.out.println(list);

        System.out.println(findAllIndexs2(arr,4, 0));
    }
    static boolean find(int[] arr, int target, int index){
        if(index==arr.length) return true;
        return arr[index] == target || find(arr, target, index+1);
    }
    static int findIndex(int[] arr, int target, int index){
        if(index==arr.length) return -1;
        if(arr[index]==target) return index;
        else return findIndex(arr, target, index+1);
    }
    static int findIndexLast(int[] arr, int target, int index){
        if(index==-1) return -1;
        if(arr[index]==target) return index;
        else return findIndexLast(arr, target, index-1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if(index== arr.length) return ;
        if(arr[index]==target) list.add(index);
        findAllIndex(arr, target, index+1);
    }
    static ArrayList<Integer> findAllIndexs(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length) return list;
        if(arr[index]==target) list.add(index);
        return findAllIndexs(arr,target,index+1,list);
    }
    static ArrayList<Integer> findAllIndexs2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length) return list;
        if(arr[index]==target) list.add(index);
        ArrayList<Integer> ansFromBelowCalls = findAllIndexs2(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}