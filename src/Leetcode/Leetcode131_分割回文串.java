package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode131_分割回文串 {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
//        if (s.length() == 1) {
//            List temp = new ArrayList();
//            temp.add(s);
//            res.add(temp);
//            return res;
//        }

        dfs(s, 0, new ArrayList<>(), res);
        System.out.println(res);
        return res;

    }

    void dfs(String s, int index, List<String> chain, List<List<String>> res) {
        //ending
        //System.out.println("index: " + index);
        if (index >= s.length()) {
            if (chain.size() != 0) {
                List<String> temp = new ArrayList(chain);
                res.add(temp);
            }
            return;

        }
        //System.out.println("chain" + chain);

        //这里i要小于等于s.length(),因为 SubString方法是左必右开
        for (int i = 0; i <= s.length(); i++) {
            if (index + i <= s.length()) {
                String sssss = s.substring(index, index + i);

                //System.out.println(sssss);

                if (sssss.length() != 0) {

                    if (huiwenchuan(sssss)) {
                        chain.add(sssss);
                        //System.out.println("index2: "+index);
                        dfs(s, index + i, chain, res);
                        //System.out.println("index3: "+index);
                        //System.out.println("i: "+i);

                        chain.remove(chain.size() - 1);


                    }
                }
            } else continue;


        }
    }

    boolean huiwenchuan(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;

    }


}
