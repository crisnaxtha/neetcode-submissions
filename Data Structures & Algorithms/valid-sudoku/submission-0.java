class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for(int j = 0; j < 9; j++) {
                if(Character.isDigit(board[i][j])) {
                    if(set.contains(board[i][j])) {
                        return false;
                    } else {
                        set.add(board[i][j]);
                    }

                }
            }
        }

        return true;
    }
}
