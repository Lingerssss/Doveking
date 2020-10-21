package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode17_电话号码的字母组合 {
    char[][] nums = new char[][]{
            {},
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'},
    };

    public List<String> letterCombinations(String str) {
        List<String> res = new ArrayList<>();
        if (str.length() == 0) {
            return res;
        }
        DFS(str, 0, new StringBuilder(), res);
        System.out.println(res);
        return res;
    }

    public void DFS(String str, int index, StringBuilder sb, List<String> res) {
        //1.
        if (str.length() == index) {
            res.add(sb.toString());
            return;
        }
        //2..
        for (char c : nums[str.charAt(index) - '0']) {
            sb.append(c);
            System.out.println(sb + "_____");
            DFS(str, index + 1, sb, res);
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb + "          ");

        }


    }
}
