class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0; i < 9 ; i++){
            Set<Character> rowValues = new HashSet<>();
            Set<Character> colValues = new HashSet<>();

            for(int j = 0; j < 9 ; j++){
                if (board[i][j] != '.' && !rowValues.add(board[i][j])) {
                    return false;
                }

                if (board[j][i] != '.' && !colValues.add(board[j][i])) {
                    return false;
                }
            }
        }


        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                Set values2 = new HashSet<>();

                for (int r = row; r < row + 3; r++) {
                    for (int c = col; c < col + 3; c++) {
                        if(board[r][c] != '.'&& !values2.add(board[r][c]) ){
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
