package Leetcode;

public class Leetcode60_第k个排列 {
//    public String getPermutation(Integer n, int k) {
//        boolean[] pb=new boolean[n];
//        StringBuilder chain=new StringBuilder();
//        dfs(n,k,pb,chain);
//        return chain.toString();
//    }
//    void dfs(int n,int k,boolean[] pb,StringBuilder chain){
//        //ending
//        int temp=factorial(n-chain.length()-1);
//        //因为取到的第一个结果就是res，所以把判断退出条件放到DFS之后，直接退出
////        if(chain.length()==n){
////            return;
////        }
//        //selection
////        System.out.println("k: "+k);
//        //关键步骤，temp表示待选择的后面一共有几种排列组合，比如n=4,选第二位时temp=4-1-1=2的阶乘，
//        // 如果这个k<2!,说明当前第i个数符合要求
//        // 继续看下一位
//        // 如果这个k>2!，说明当前的i不符合要求，
//        //k=k-temp;
//        for(int i=0;i<n;i++){
//            if(pb[i]==false){
////                System.out.println("k: "+k);
////                System.out.println("temp: "+temp);
//                if(k<=temp){
//                    //k=temp-k;
//                    pb[i]=true;
//                    //这里append i+1是节省空间，也可以在前面创建个数组P
//                    chain.append(i+1);
////                    System.out.println("chain: "+chain);
//                    dfs(n,k,pb,chain);
//                    if(chain.length()==n){
//                        return;
//                    }
//                    chain.deleteCharAt(chain.length()-1);
//                    pb[i]=false;
//
//                }
//                else k=k-temp;
//            }
//        }
//    }
//    int factorial(int n){
//        int res=1;
//        while(n>0){
//            res=res*n;
//            n--;
//        }
//        return res;
//    }


//    public String getPermutation(Integer n, int k) {
//        int[] p=new int[n];
//        for(int i=0;i<n;i++){
//            p[i]=i+1;
//        }
//        boolean[] pb=new boolean[n];
//        List<List<Integer>> res =new ArrayList<>();
//        List<Integer> chain=new ArrayList<>();
//        dfs(p,pb,chain,res,new String());
//        Collections.sort(chain);
//        return res.get(k-1).toString();
//    }
//    void dfs(int[] p,boolean pb[],List<Integer> chain,List<List<Integer>> res,String res_final){
//        //ending
//        if(chain.size()==p.length){
//            res.add(new ArrayList<>(chain));
//            return;
//        }
//        //selection
//        for(int i=0;i<p.length;i++){
//            if (pb[i]==false){
//                pb[i]=true;
//                chain.add(i);
//                dfs(p,pb,chain,res,res_final);
//                pb[i]=false;
//                chain.remove(chain.size()-1);
//            }
//        }
//    }
//}


    //    public String getPermutation(Integer n, int k) {
//        int[] p = new int[n];
//        for (int i = 0; i < n; i++) {
//            p[i] = i + 1;
//        }
//        boolean[] pb = new boolean[n];
//        List<List<Integer>> res = new ArrayList<>();
//        List<Integer> chain = new ArrayList<>();
//        dfs(p, pb, chain, res, new String());
//        System.out.println(res.get(k-1).toString());
//        return res.get(k - 1).toString();
//    }
//
//    void dfs(int[] p, boolean pb[], List<Integer> chain, List<List<Integer>> res, String res_final) {
//        //ending
//        if (chain.size() == p.length) {
//            res.add(new ArrayList<>(chain));
//            return;
//        }
//        //selection
//        for (int i = 0; i < p.length; i++) {
//            if (pb[i] == false) {
//                pb[i] = true;
//                chain.add(p[i]);
//                dfs(p, pb, chain, res, res_final);
//                pb[i] = false;
//                chain.remove(chain.size() - 1);
//            }
//        }
//
    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        k--;
        for (int i = 0; i < n; i++) {
            int tmp = helper(n - i - 1);
            sb.append((char) (nums[k / tmp] + 48));
            System.out.println(sb);
            delete(nums, k / tmp, n - i);
            k %= tmp;
        }

        return new String(sb);
    }

    // 求阶乘
    public int helper(int n) {
        if (n == 1 || n == 0) return 1;
        return helper(n - 1) * n;
    }

    private void delete(int[] nums, int i, int size) {
        while (i < size - 1) {
            // nums[i + 1] = nums[i + 1];
            nums[i] = nums[i + 1];
            i++;
        }
        return;
    }


}
