import java.util.Scanner;

public class Questions {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(isPrime(n));
//        System.out.println(isArmstorng(n));
        for (int i = 100; i < 1000; i++) {
            if(isArmstorng(i)) System.out.println(i + " ");
        }
    }

    // print all the 3 digits armstrong numbers
    static boolean isArmstorng(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum += rem*rem*rem;
        }
        return sum==original;
    }

    static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        int x = 2;
        while(x*x<=n){
            if(n%x==0) return false;
            x++;
        }
        if(x*x>n) return true;
        return false;
    }
}
