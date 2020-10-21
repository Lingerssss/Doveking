package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Leetcode435_不重叠的区间个数 {
    public int eraseOverlapIntervals(int[][] intvs) {
        if (intvs.length == 0) {
            return 0;
        }
        Arrays.sort(intvs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        //There is at least 1 lap that does not over with others.
        int res = 1;
        int end = intvs[0][1];
        // for(int i=1;i<intvs.length;i++){
        //    if(intvs[i][0]>=end){
        //        end=intvs[i][1];
        //        res++;
        //    }


        // }
        for (int[] tmp : intvs) {
            if (tmp[0] >= end) {
                end = tmp[1];
                res++;

            }
        }
        return intvs.length - res;
    }
}
        /*HashMap<Integer, String> m=new HashMap<>();
        m.put(1,"fdas");
        m.put(5,"rewr");
        m.put(2,"dd");
        m.put(543252,"aaaaaa");
        System.out.println(m);
        List<Map.Entry<Integer,String>> ls=new ArrayList<Map.Entry<Integer, String>>(m.entrySet());
        System.out.println(ls);
        Collections.sort(ls,new Comparator<Map.Entry<Integer,String>>(){
            @Override
            public int compare(Map.Entry<Integer,String> o1, Map.Entry<Integer,String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });*/
//        System.out.println(ls);




