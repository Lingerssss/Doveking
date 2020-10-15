import java.util.ArrayList;
import java.util.List;

public class Leetcode212_单词搜索2 {
    boolean[] res = new boolean[1];
    List<String> ss = new ArrayList<>();

    public List<String> findWords(char[][] p, String[] words) {
        int m = p.length;
        int n = p[0].length;
//        System.out.println("i: "+m);
//        System.out.println("j: "+n);
//        System.out.println("k: "+words.length);
        boolean[][] pb = new boolean[m][n];
        if (words.length == 0) {
            return ss;
        }
        if (words[0].length() > (m * n)) {
            return ss;
        }
        if (m == 1 && n == 1 && p[0][0] == words[0].charAt(0) && words.length == 1) {
            ss.add(words[0]);
            return ss;
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
//                    System.out.println("i: "+i);
//                    System.out.println("j: "+j);
//                    System.out.println("k: "+k);

                    dfs(p, pb, j, k, 0, words[i]);
                    if (ss.contains(words[i]) == true) {
                        break;
                    }

                }
            }
        }
        return ss;
    }


    void dfs(char[][] p, boolean[][] pb, int i, int j, int index, String str) {
//         System.out.println("i: "+i);
//         System.out.println("j: "+j);
//         System.out.println("index: "+index);
//         System.out.println("str: "+str);
//         if(ss.contains(str)==true){
//             return;
//         }
        if (res[0] == true || index == str.length()) {
            res[0] = true;

            if (ss.contains(str) == false) {
                ss.add(str);
            }

            //System.out.println("ss: "+ss);
            res[0] = false;


            return;
        }
        //
        for (int[] loc : getNear(i, j, p.length, p[0].length)) {
            if (pb[loc[0]][loc[1]] == false && p[loc[0]][loc[1]] == str.charAt(index)) {

//                 System.out.println("loc[0]: "+loc[0]);
//                 System.out.println("loc[1]: "+loc[1]);
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
