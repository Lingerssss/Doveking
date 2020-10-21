package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode455_分发饼干 {
    public int findContentChildren(int[] g, int[] s) {
        int res=0;
        if(g==null||s==null){
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;int j=0;
        while(i<g.length&&j<s.length){
            if(s[j]>=g[i]){
                res++;
                i++;
            }
            j++;
        }
        return res;
    }
}
