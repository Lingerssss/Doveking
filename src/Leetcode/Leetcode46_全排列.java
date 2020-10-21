package Leetcode;/*给定一个 没有重复 数字的序列，返回其所有可能的全排列。

        示例:
        输入: [1,2,3]
输出:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */

import java.util.ArrayList;
import java.util.List;

public class Leetcode46_全排列 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        dfs(nums, check, new ArrayList<Integer>(), res);
        System.out.println(res);
        return res;


    }

    void dfs(int[] nums, boolean[] check, List<Integer> lt, List<List<Integer>> res) {
        //
        if (lt.size() == nums.length) {
            res.add(new ArrayList<>(lt));
            return;
        }
        //
        for (int i = 0; i < nums.length; i++) {
            int c = nums[i];
            if (check[i] == false) {
                lt.add(c);
                check[i] = true;
                dfs(nums, check, lt, res);
                lt.remove(lt.size() - 1);
                check[i] = false;
            }
        }
    }
}
