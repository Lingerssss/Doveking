package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode51_N皇后 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        boolean[][] pb = new boolean[n][n];
        dfs(n, res, new ArrayList<>(), pb);
        return res;


    }

    void dfs(int n, List<List<String>> res, List<String> chain, boolean[][] pb) {
        //
        if (res.size() == n) {
            return;
        }
        //
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (pb[i][j] == false) {
                    for (int m = 0; m < n; m++) {
                        pb[i][m] = true;
                        pb[m][j] = true;
                    }
                    chain.add("Q");
                }
            }


        }

    }
    /*public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] line : board) {
            Arrays.fill(line, '.');
        }
        solve(board, 0, n);
        return listOfList;
    }

    List<List<String>> listOfList = new ArrayList<>();

    public void solve(char[][] board, int r, int n) {
        //截止
        if (r == n) {
            List<String> list = new ArrayList<>();
            for (char[] line : board) {
                list.add(String.valueOf(line));
            }
            listOfList.add(list);
            return;
        }

        for (int c = 0; c < n; ++c) {
            if (check(board, r, c)) {
                board[r][c] = 'Q';
                solve(board, r + 1, n);
                board[r][c] = '.';
            }
        }
    }

    public boolean check(char[][] board, int r, int c) {
        for (int i = r - 1; i >= 0; --i) {
            int k = r - i;
            if (board[i][c] == 'Q' || 0 <= c - k && board[i][c - k] == 'Q' || c + k < board.length && board[i][c + k] == 'Q') {
                return false;
            }
        }
        return true;
    }*/


}
