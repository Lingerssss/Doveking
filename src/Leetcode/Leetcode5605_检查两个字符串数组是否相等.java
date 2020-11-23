package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode5605_检查两个字符串数组是否相等 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
/*        List<String> ss=new ArrayList<>();
        for(String i:word1){
            ss.add(i);
        }
        System.out.println(ss);
        String s=String.join("",ss);
        System.out.println(s);*/



        return String.join("",word1).equals(String.join("",word2));
    }
}
