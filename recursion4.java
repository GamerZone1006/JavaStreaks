import java.util.ArrayList;

public class recursion4 {

    //skip a character in a string
    // public static void skip(String p, String up){
    //     if (up.isEmpty()) {
    //         System.out.println(p);
    //         return;
    //     }
    //     char ch = up.charAt(0);
    //     if (ch == 'a') {
    //         skip(p, up.substring(1));
    //     }
    //     else{
    //         skip(p+ch, up.substring(1));
    //     }
    // }

    //skip a word from the string
    // public static String skipWord(String p, String up){
    //     if (up.isEmpty()) {
    //         System.out.println(p);
    //         return " ";
    //     }
    //     char ch = up.charAt(0);
    //     if (up.startsWith("apple")) {
    //         return skipWord(p, up.substring(5));
    //     }
    //     else{
    //         return skipWord(p+ch, up.substring(1));
    //     }
    // }

    //finding subsets of a set
    // public static void subsets(String p, String up){
    //     if (up.isEmpty()) {
    //         System.out.println(p);
    //         return;
    //     }
    //     char ch = up.charAt(0);
    //     subsets(p, up.substring(1));
    //     subsets(p+ch, up.substring(1));
    // }

    //arraylist of string
    // public static ArrayList<String> alSubset(String p, String up){
    //     if (up.isEmpty()) {
    //         // System.out.println(p);
    //         ArrayList<String> list = new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }
    //     char ch = up.charAt(0);
    //     ArrayList<String> left = alSubset(p+ch, up.substring(1));
    //     ArrayList<String> right = alSubset(p, up.substring(1));
    //     left.addAll(right);
    //     return left;
    // }

    // returning asci code also
    public static void asci(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        asci(p, up.substring(1));
        asci(p+ch, up.substring(1));
        asci(p+(ch+0), up.substring(1));
    }

    public static void main(String[] args) {
        // skip("", "blahblahblah");
        // skipWord("", "blahblahappleblah");  
        // subsets("", "abc"); 
        // System.out.println(alSubset("", "122"));
        asci("", "ab");
    }
}
