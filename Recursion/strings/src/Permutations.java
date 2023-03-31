import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
//        ArrayList<String> ans = permutationsList("", "abc");
        System.out.println(permutationsCount("", "abc"));
    }
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(0,i);
            String e = p.substring(i, p.length());
            permutations(s + ch + e, up.substring(1));
        }
    }
    static ArrayList<String> permutationsList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(0,i);
            String e = p.substring(i, p.length());
            res.addAll(permutationsList(s + ch + e, up.substring(1)));
        }
        return res;
    }
    static int permutationsCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(0,i);
            String e = p.substring(i, p.length());
            count += permutationsCount(s + ch + e, up.substring(1));
        }
        return count;
    }
}