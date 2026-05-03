class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];
                if (current == '.') {
                    continue;
                }
                int digitIDX = current - '0' - 1;
                int boxIDX = (i / 3) * 3 + (j / 3);
                if (row[i][digitIDX] || col[j][digitIDX] || box[boxIDX][digitIDX]) {
                    return false;
                }
                row[i][digitIDX] = true;
                box[boxIDX][digitIDX] = true;
                col[j][digitIDX] = true;
            }
        }
        return true;

    }
}