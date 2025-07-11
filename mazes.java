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

    // public static ArrayList<String> path(String p, int r, int c){
    //     ArrayList<String> processed = new ArrayList<>();
    //     if (r == 1 && c == 1) {
    //         processed.add(p);
    //         return processed;
    //     }
    //     if (r > 1) {
    //         processed.addAll(path(p+"V", r-1, c));
    //     }
    //     if (c>1) {
    //         processed.addAll(path(p+"H", r, c-1));
    //     }
    //     if (r>1 && c>1) {
    //         processed.addAll(path(p+"D", r-1, c-1));
    //     }
    //     return processed;
    // }

    // public static void mazeWithObstacles(String p, boolean[][] maze, int r, int c){
    //     if (r == maze.length-1 && c == maze[0].length - 1) {
    //         System.out.println(p);
    //         return;
    //     }
    //     if (!maze[r][c]) {
    //         return;
    //     }
    //     if (r < maze.length - 1) {
    //         mazeWithObstacles(p+"V", maze, r+1, c);
    //     }
    //     if (c < maze.length - 1) {
    //         mazeWithObstacles(p+"H", maze, r, c+1);
    //     }
    // }

    

    public static void main(String[] args) {
        // path("", 3, 3);
        // System.out.println(path("", 3, 3));
        // boolean[][] maze = {
        //     {true ,true, true},
        //     {true, false, true},
        //     {true, true, true}
        // };
        // mazeWithObstacles("", maze, 0, 0);
    }
}