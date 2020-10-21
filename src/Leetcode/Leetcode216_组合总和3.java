package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode216_组合总和3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        if (n == 0 || k == 0) {
            return res;
        }
        int[] p = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean[] pb = new boolean[9];

        dfs(k, n, p, pb, new ArrayList<>(), res);
        System.out.println(res);
        return res;
    }

    void dfs(int k, int n, int[] p, boolean[] pb, List<Integer> chain, List<List<Integer>> res) {
        //
        if (chain.size() == k) {
            if (sum(chain) == n) {
                List<Integer> temp = new ArrayList<>(chain);
                Collections.sort(temp);
                if (res.contains(temp) == false) {
                    res.add(temp);
                }
            }
            return;
        }

        //
        for (int i = chain.size(); i < 9; i++) {
            if (pb[i] == false) {
                pb[i] = true;
                chain.add(p[i]);
                //System.out.println(chain);
                dfs(k, n, p, pb, chain, res);
                pb[i] = false;
                chain.remove(chain.size() - 1);
            }

        }

    }

    public int sum(List<Integer> chain) {
        int res = 0;
        for (int i : chain) {
            res += i;
        }
        return res;
    }
}
