public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sum(1234973));
    }
    static int sum(int n){
        if(n==0) return 0;
        return n%10 + sum(n/10);
    }
}
