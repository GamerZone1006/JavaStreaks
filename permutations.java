import java.util.ArrayList;

public class permutations {

    //permutation of string
    // public static void per(String p, String up){
    //     if (up.isEmpty()) {
    //         System.out.println(p);
    //         return;
    //     }
    //     char ch = up.charAt(0);
    //     for(int i=0;i<=p.length();i++){
    //         String f = p.substring(0, i);
    //         String s = p.substring(i, p.length());
    //         per(f+ch+s, up.substring(1));
    //     }
    // }

    //returning arraylist of permutation of string
    public static ArrayList<String> per(String p, String up){
        if (up.isEmpty()) {
            ArrayList<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }
        char ch = up.charAt(0);
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            String e = p.substring(i, p.length());
            list.addAll(per(f+ch+e, up.substring(1)));
        }
        return list;
    }

    public static void main(String[] args) {
        // per("", "abc");
        System.out.println(per("", "abc"));
    }
}
