package Leetcode;

public class Leetcode214_最短回文串 {
    public String shortestPalindrome(String s) {
        s = new StringBuffer(s).reverse().toString();
        //从后遍历
        String res = new String();
        dfs(s, res);
        return res;


    }

    void dfs(String s, String res) {
        //
        if (huiwenchuan(s) == true) {
            return;
        }
        //
        res = s + s.charAt(s.length() - 1);
        dfs(s, res);

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
