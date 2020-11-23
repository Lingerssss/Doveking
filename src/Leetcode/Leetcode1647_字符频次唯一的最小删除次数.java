package Leetcode;

import java.util.*;

public class Leetcode1647_字符频次唯一的最小删除次数 {
    public int minDeletions(String s) {
        HashMap<Character,Integer> countChar=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char tmp_c=s.charAt(i);
            countChar.put(tmp_c,countChar.containsKey(tmp_c)?countChar.get(tmp_c)+1:1);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<Map.Entry<Character,Integer>>(countChar.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });
        Object[] tmp=list.toArray();
        System.out.println(tmp[0]);
        int res=0;
        for(int i=0;i< tmp.length;i++){
            int di=Math.abs(Integer.parseInt(tmp[i].toString().substring(2,3))-(i+1));
            res+=di;
        }
//        System.out.println(res);

        return res;

    }
}
