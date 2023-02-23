import java.util.Arrays;

public class EvenDigits {
    public static void main(String[] args) {
        int[] x = {437,315,322,431,686,264,442};
        System.out.println(findNumbers(x));
    }
    static int findNumbers(int[] nums) {
        int count, res=0;
        for(int i=0;i<nums.length;i++){
            count = 0;
            if(nums[i]==0) return 1;
            while(nums[i]>0){
                nums[i] /= 10;
                count++;
            }
            if(count %2==0) res++;
        }
        return res;
    }
}
