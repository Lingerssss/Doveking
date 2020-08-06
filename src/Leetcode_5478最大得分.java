//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Leetcode_5478最大得分 {
//    public int maxSum(int[] nums1, int[] nums2) {
//        Map<Integer,Integer> m=new HashMap<>();
//        for(int i:nums1){
//            m.put(i,m.containsKey(i)?m.get(i)+1:1);
//        }
//        for(int i:nums2){
//            m.put(i,m.containsKey(i)?m.get(i)+1:1);
//        }
//        int len=m.size();
//        int[] p=new int[len];
//        int[] pb=new int[len];
//        int[] index=new int[1];
//        m.forEach((k,v)->{
//            p[index[0]]=k;
//            pb[index[0]]=v;
//            index[0]++;
//        });
//
//    }
//    void dfs(int[] p,int[] pb, List<Integer> chain,List<List<Integer>> res){
//        //
//        for(int i=0;i<;i++){
//
//        }
//
//    }
//
//}
