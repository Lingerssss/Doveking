package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode332_重新安排行程 {
    List<String> findItinerary(List<List<String>> tickets) {
        List<String> res = new ArrayList<>();
        boolean[] pb = new boolean[tickets.size()];
        dfs(tickets, pb, new String("JFK"), res);
        return res;


    }

    void dfs(List<List<String>> tickets, boolean[] pb, String sb, List<String> res) {
        //
        /*if(res.size()==){
            return;
        }*/
        //
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).get(0).equals(sb) && pb[i] == false) {
                pb[i] = true;
                sb = tickets.get(i).get(1);
                res.add(sb);
                dfs(tickets, pb, sb, res);
                pb[i] = false;
                res.remove(res.size() - 1);

            }
        }
        return;
    }
}
