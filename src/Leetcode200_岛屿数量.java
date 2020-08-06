import java.util.ArrayList;
import java.util.List;

public class Leetcode200_岛屿数量 {
    public int numIslands(char[][] p) {
        int res = 0;
        if (p.length == 0) return 0;
        if (p[0].length == 0) return 0;
        boolean[][] pb = new boolean[p.length][p[0].length];
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[0].length; j++) {
                if (pb[i][j] == false && p[i][j] == '1') {
                    dfs(p, pb, i, j);
                    res++;
                }
            }
        }
        return res;
    }

    void dfs(char[][] p, boolean[][] pb, int i, int j) {
        //ending
        //
        for (int[] loc : getNear(i, j, p.length, p[0].length)) {
            //筛选
            if (p[loc[0]][loc[1]] == '1' && pb[loc[0]][loc[1]] == false) {
                pb[loc[0]][loc[1]] = true;
                dfs(p, pb, loc[0], loc[1]);
                //pb[loc[0]][loc[1]]不能再赋值为false，因为不需要再用之前用过的了
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
