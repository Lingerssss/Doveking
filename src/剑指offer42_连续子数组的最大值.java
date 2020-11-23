public class 剑指offer42_连续子数组的最大值 {
    /*    public int maxSubArray(int[] nums) {
            if(null==nums||0==nums.length){
                return 0;
            }

            int pre=nums[0];
            int res=pre;
            for(int i=1;i<nums.length;i++){
                int cur=pre+nums[i];
                pre=cur>0?Math.max(nums[i],cur):nums[i];
                res=Math.max(res,pre);
            }
            return res;


        }*/
    int ss;

    public int maxSubArray(int[] p) {
        if (null == p || 0 == p.length) {
            return 0;
        }
        boolean pb[]=new boolean[p.length];
        int res = 0;
        dfs(p,pb, 0, 0);
        return ss;


    }

    void dfs(int[] p,boolean[] pb, int level, int res) {
        //
        ss = Math.max(ss, res);
        if (level == p.length-1) {
            return;
        }
        //
        for (int i = 0; i < p.length; i++) {
            System.out.println("level: "+level);
            System.out.println("p[i]: "+p[i]);
            if (false==pb[i]) {
                pb[i]=true;
                System.out.println(res);
                dfs(p, pb,level + 1, res += p[i]);
                pb[i]=false;
            }
        }
    }
}
