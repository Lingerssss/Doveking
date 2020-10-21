package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode79_单词搜索 {
    boolean[] res = new boolean[1];

    public boolean exist(char[][] p, String word) {
        int m = p.length;
        int n = p[0].length;
        boolean[][] pb = new boolean[m][n];
        if (m == 1 && n == 1 && p[0][0] == word.charAt(0) && word.length() == 1) {
            return true;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(p, pb, i, j, 0, word);
                System.out.println(word);
                if (res[0] == true) {
                    return true;
                }
            }
        }
        return false;
    }

    void dfs(char[][] p, boolean[][] pb, int i, int j, int index, String str) {
        //
        if (res[0] == true || index == str.length()) {
            res[0] = true;
            return;
        }
        //
        for (int[] loc : getNear(i, j, p.length, p[0].length)) {
            if (pb[loc[0]][loc[1]] == false && p[loc[0]][loc[1]] == str.charAt(index)) {
                System.out.println("ssssssssss");
                pb[loc[0]][loc[1]] = true;
                dfs(p, pb, loc[0], loc[1], index + 1, str);
                pb[loc[0]][loc[1]] = false;
            }
        }
    }

    List<int[]> getNear(int i, int j, int x, int y) {
        List<int[]> list = new ArrayList<>();
        if (i - 1 >= 0) list.add(new int[]{i - 1, j});
        if (i + 1 < x) list.add(new int[]{i + 1, j});
        if (j - 1 >= 0) list.add(new int[]{i, j - 1});
        if (j + 1 < y) list.add(new int[]{i, j + 1});
        return list;
    }
}

