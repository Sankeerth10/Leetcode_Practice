class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rows = board.length;
        int cols = board[0]. length;
        Set<String> set = new HashSet<>();

        for(int i =0; i < rows; i++) {
            for(int j =0; j < cols; j++) {
                char character = board[i][j];
                if(Character.isDigit(character)) {
                    if(
                    set.contains(character + " is in row " + i) ||
                    set.contains(character + " is in col " + j) ||
                    set.contains(character + " is in row " + i/3 + " is in col " + j/3
                    )) {
                        return false;
                    }
                    set.add(character + " is in row " + i);
                    set.add(character + " is in col " + j);
                    set.add(character + " is in row " + i/3 + " is in col " + j/3);
                }
            }
        }

        return true;
    }
}