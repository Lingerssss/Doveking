package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_面试题0804_幂集 {
    public List<List<Integer>> subsets(int[] p) {
        List<List<Integer>> res = new ArrayList<>();
        if (p.length == 0) {
            return res;
        }
        dfs(p, new ArrayList<Integer>(), res);
        return res;

    }

    void dfs(int[] p, List<Integer> chain, List<List<Integer>> res) {
        //
        List<Integer> temp = new ArrayList<>(chain);
        if (res.contains(temp) == false) {
            res.add(temp);
        }
        //
        for (int i = 0; i < p.length; i++) {
            if (chain.contains(p[i]) == false) {
                chain.add(p[i]);
                dfs(p, chain, res);
                chain.remove(chain.size() - 1);
            }
        }
    }
}
