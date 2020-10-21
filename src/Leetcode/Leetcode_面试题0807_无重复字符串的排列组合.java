package Leetcode;

import java.util.LinkedList;
import java.util.List;

public class Leetcode_面试题0807_无重复字符串的排列组合 {

    public String[] permutation(String str) {
        char[] chars = str.toCharArray();

        List<String> res = new LinkedList<>();
        StringBuilder[] s = new StringBuilder[]{};

        boolean[] pb = new boolean[str.length()];
        dfs(chars, pb, new StringBuilder(), res);
        return res.toArray(new String[0]);

    }

    void dfs(char[] chars, boolean[] pb, StringBuilder chain, List<String> res) {
        //
        if (chain.length() == chars.length) {

            String temp = new String(chain);
            res.add(temp);

        }
        //
        for (int i = 0; i < chars.length; i++) {
            if (pb[i] == false) {
                pb[i] = true;
                chain.append(chars[i]);
                dfs(chars, pb, chain, res);
                pb[i] = false;
                chain.deleteCharAt(chain.length() - 1);
            }
        }
    }
}
