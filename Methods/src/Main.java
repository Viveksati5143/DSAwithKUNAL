import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num,num2,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. 1");
        num = sc.nextInt();
        System.out.println("Enter no. 2");
        num2 = sc.nextInt();
        sum = num + num2;
        System.out.println("Sum = " +sum);
    }
}