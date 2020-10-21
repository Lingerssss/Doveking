package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1415_长度为n的开心字符串中字典序第k小的字符串 {
    /*public String getHappyString(int n, int k) {
        char[] c = new char[]{'a', 'b', 'c'};
        List<List<Character>> res = new ArrayList<>();
        dfs(c, n, k, new ArrayList<>(), res);
        //System.out.println(res);
        if (res.size() == k) {

            String fi=res.get(k-1).toString();
            fi=fi.substring(1,fi.length()-1);
            return fi;
        } else {
            return null;
        }


    }

    void dfs(char[] c, int n, int k, List<Character> chain, List<List<Character>> res) {
        //

        if (res.size() == k) {
            return;
        }
        if (chain.size() == n) {
            res.add(new ArrayList<>(chain));
            return;

        }

        //
        for (int i = 0; i < c.length; i++) {
            if (true) {
                chain.add(c[i]);

                dfs(c, n, k, chain, res);
                chain.remove(chain.size() - 1);
            }
        }


    }*/

    public String getHappyString1(int n, int k) {
        char[] c = new char[]{'a', 'b', 'c'};
        List<StringBuilder> res = new ArrayList<>();
        dfs1(c, n, k, new StringBuilder(), res);
        //System.out.println(res);
        if (res.size() == k) {

            return res.get(k - 1).toString();


        } else {
            return "";
        }


    }

    void dfs1(char[] c, int n, int k, StringBuilder chain, List<StringBuilder> res) {
        //
        //System.out.println(res);
        if (res.size() == k) {
            return;
        }
        if (chain.length() == n) {
            res.add(new StringBuilder(chain));
            return;

        }

        //
        for (int i = 0; i < c.length; i++) {
            if (chain.length() == 0 || (chain.length() > 0 && c[i] != chain.charAt(chain.length() - 1))) {
                chain.append(c[i]);

                dfs1(c, n, k, chain, res);
                chain.deleteCharAt(chain.length() - 1);
            }
        }


    }
}
