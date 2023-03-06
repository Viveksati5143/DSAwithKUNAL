public class Main {
    public static void main(String[] args) {
        pattern17(5);
    }
    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
//            for (int row = n; row > 0; row--) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }
    static void pattern5(int n){
        for (int row = 1; row <= 2 * n; row++) {
            int TotalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= TotalColsInRow; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern17(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space <=n-row; space++) {
                System.out.print("  "); //extra space
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for (int row = 1; row <= 2 * n; row++) {
            int TotalColsInRow = row > n ? 2 * n - row : row;
            int NoOfSpaces = n - TotalColsInRow;
            for (int s = 0; s < NoOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= TotalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space <=n-row; space++) {
                System.out.print("  "); //extra space
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}