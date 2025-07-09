import java.util.ArrayList;

public class mazes{

    // public static int countSteps(int r, int c){
    //     if(r == 1 || c == 1){
    //         return 1;
    //     }
    //     int left = countSteps(r-1, c);
    //     int right = countSteps(r, c-1);
    //     return left+right;
    // }

    // public static void path(String p, int r, int c){
    //     if (r == 1 && c == 1) {
    //         System.out.println(p);
    //         return;
    //     }
    //     if (r>1) {
    //         path(p+"D", r-1, c);
    //     }
    //     if (c>1) {
    //         path(p+"R", r, c-1);
    //     }
    // }

    public static ArrayList<String> path(String p, int r, int c){
        ArrayList<String> processed = new ArrayList<>();
        if (r == 1 && c == 1) {
            processed.add(p);
            return processed;
        }
        if (r > 1) {
            processed.addAll(path(p+"V", r-1, c));
        }
        if (c>1) {
            processed.addAll(path(p+"H", r, c-1));
        }
        if (r>1 && c>1) {
            processed.addAll(path(p+"D", r-1, c-1));
        }
        return processed;
    }

    public static void main(String[] args) {
        // path("", 3, 3);
        System.out.println(path("", 3, 3));
    }
}