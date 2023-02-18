import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        sum();
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