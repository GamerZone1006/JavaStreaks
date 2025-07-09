public class mazes{

    public static int countSteps(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = countSteps(r-1, c);
        int right = countSteps(r, c-1);
        return left+right;
    }

    public static void main(String[] args) {
        
    }
}