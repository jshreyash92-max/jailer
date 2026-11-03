public class EightQueens {
    static int[] board = new int[8];
    static boolean safe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col ||
                Math.abs(board[i] - col) == Math.abs(i - row))
                return false;
        }
        return true;
    }
    static boolean solve(int row) {
        if (row == 8)
            return true;

        for (int col = 0; col < 8; col++) {
            if (safe(row, col)) {
                board[row] = col;

                if (solve(row + 1))
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        if (solve(0)) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++)
                    System.out.print(board[i] == j ? "Q " : ". ");
                System.out.println();
            }}}}
