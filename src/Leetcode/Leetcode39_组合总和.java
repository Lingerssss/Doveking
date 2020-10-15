import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Leetcode39_组合总和 {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        dfs(nums, target,new ArrayList(),res);
        System.out.println(res);
        return res;
    }
    void dfs(int[] nums,int target,List<Integer> lt,List<List<Integer>> res){
        //1.ending
        int s= sum(lt);
        if(s>=target){
            if(s==target){
                List<Integer> temp=new ArrayList<>(lt);
                Collections.sort(temp);
                if(res.contains(temp)==false){
                    res.add(temp);
                }
            }
            return;
        }
        //2.selection
        for(int i=0;i<nums.length;i++){
            int c=nums[i];
            lt.add(c);
//            System.out.println("lt: "+lt);
//            System.out.println("res: "+res);

            dfs(nums,target,lt,res);
            lt.remove(lt.size()-1);
//            System.out.println("ltaaaa: "+lt);
        }
    }
    public int sum(List<Integer> lt){
        int res=0;
        for(int i:lt){
            res+=i;
        }
        return res;
    }
}
