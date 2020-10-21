package Leetcode;

import java.util.ArrayList;
import java.util.List;
//index 不能回滚


public class Leetcode1286_字母组合迭代器 {
    List<StringBuilder> res = new ArrayList<>();
    int index = 0;

    public Leetcode1286_字母组合迭代器(String characters, int combinationLength) {
        char[] c = characters.toCharArray();
        boolean[] pb = new boolean[characters.length()];

        dfs(c, 0, combinationLength, new StringBuilder(), res);


    }

    public String next() {
        return res.get(index++).toString();

    }

    public boolean hasNext() {
        return index < res.size();

    }

    void dfs(char[] c, int index, int length, StringBuilder sb, List<StringBuilder> res) {
        //
        if (sb.length() == length) {

            res.add(new StringBuilder(sb));
            return;
        }

        //
        for (int i = index; i < c.length; i++) {

            index++;

            sb.append(c[i]);
            dfs(c, index, length, sb, res);


            sb.deleteCharAt(sb.length() - 1);


        }
    }
}

