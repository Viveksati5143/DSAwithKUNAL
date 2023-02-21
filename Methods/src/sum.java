import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(10,30);
        System.out.println(ans);
    }

    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. 1");
        int num = sc.nextInt();
        System.out.println("Enter no. 2");
        int num2 = sc.nextInt();
        int sum = num + num2;
        return sum;
//        System.out.println("This will never execute");
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. 1");
        int num = sc.nextInt();
        System.out.println("Enter no. 2");
        int num2 = sc.nextInt();
        int sum = num + num2;
        System.out.println("Sum = " +sum);
    }
}