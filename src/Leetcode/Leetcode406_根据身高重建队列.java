package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Leetcode406_根据身高重建队列 {
    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people[0].length == 0) {
            return new int[0][0];
        }
        Arrays.sort(people, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]));
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){
                    return o1[1]-o2[1];
                }
                else {
                    return o2[0]-o1[0];
                }
            }
        });
        List<int[]> ls = new ArrayList<>();
        System.out.println(ls);
        for (int[] p : people) {
            ls.add(p[1],p);
        }
        return ls.toArray(new int[ls.size()][]);
    }
}
