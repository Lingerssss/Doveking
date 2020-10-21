package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode47_全排列2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        //将数组转为哈希表，保存每个数值和他出现的次数
        Map<Integer, Integer> m = new HashMap<>();
        for (int i : nums) {
            m.put(i, m.containsKey(i) ? m.get(i) + 1 : 1);
        }
        int len = m.size();
        int[] p = new int[len];
        int[] pb = new int[len];
        int[] index = new int[1];
        m.forEach((k, v) -> {
            p[index[0]] = k;
            pb[index[0]] = v;
            index[0]++;
        });
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums.length, p, pb, new ArrayList<Integer>(), res);
        return res;
    }

    void dfs(int size, int[] p, int[] pb, List lt, List<List<Integer>> res) {
        //1.ending
        if (lt.size() == size) {
            res.add(new ArrayList<>(lt));
            return;
        }
        //2.selection
        for (int i = 0; i < p.length; i++) {
            int c = p[i];
            //2.1extract
            if (pb[i] > 0) {
                lt.add(c);
                pb[i]--;
                dfs(size, p, pb, lt, res);
                pb[i]++;
                lt.remove(lt.size() - 1);
            }

        }
    }
}
