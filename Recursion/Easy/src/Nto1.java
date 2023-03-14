public class Nto1 {
    public static void main(String[] args) {
        Bothfun(5);
    }
    static void fun(int n){
        if(n==0) return;

        System.out.println(n);
        fun(n-1);
    }
    static void revfun(int n){
        if(n==0) return;

        revfun(n-1);
        System.out.println(n);
    }
    static void Bothfun(int n){
        if(n==0) return;

        System.out.println(n);
        Bothfun(n-1);
        System.out.println(n);
    }
}