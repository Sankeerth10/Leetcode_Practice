class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> unq = new HashSet<>();
        for(int i = 0; i < 9; i ++) {
            for(int j =0; j < 9; j++) {
                char current = board[i][j];
                if(current != '.') {
                    if(unq.contains(current + " in row " + i) || unq.contains(current + " in column " + j) || unq.contains(current + " in row " + i/3 + " in column " + j/3)) {
                    return false;
                    }
                    else {
                        unq.add(current + " in row " + i);
                        unq.add(current + " in column " + j);
                        unq.add(current + " in row " + i/3 + " in column " + j/3);
                    }
                } 
            }
        }
        return true;
    }
}