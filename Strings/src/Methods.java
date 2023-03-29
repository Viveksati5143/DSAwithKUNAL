import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = " Vivek Sati Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Vivek   ".strip());
        System.out.println("VS".strip());
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.trim());
    }
}