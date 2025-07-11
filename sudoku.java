public class sudoku {

    public static boolean isSafe(int[][] board, int row,int col, int num){
        for(int i=0;i<board.length;i++){
            if (board[row][col] == num) {
                return false;
            }
        }
        for(int[] nums : board){
            if (nums[col] == num) {
                return false;
            }
        }
        int sq = (int)(Math.sqrt(board.length));
        int rstart = row - row%sq;
        int cstart = col - col%sq;
        for(int r = rstart; r<rstart+sq; r++){
            for(int c = cstart;c < cstart+sq; c++){
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (board[i][j]==0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if (emptyLeft == false) {
                break;
            }
        }
        if (emptyLeft == true) {
            return true;
        }
        //backtrack
        for(int number = 1; number<=9;number++){
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    return true;
                }
                else{
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
    }
}
