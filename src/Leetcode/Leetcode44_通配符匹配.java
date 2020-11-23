package Leetcode;

public class Leetcode44_通配符匹配 {
    //pb[0]用于判断p中是否含有*,pb[1]用于判断p和s是否匹配
    boolean[] pb = new boolean[3];

    public boolean isMatch(String s, String p) {
        //都未空
        if (null == s && p == null) {
            return true;
        }
        //先看s和p长度，如果长度不等且p不含有*直接返回false
        if (s.length() > p.length()) {
            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i) == '*') {
                    pb[0] = true;
                    break;
                }
            }
            if (pb[0] == false) {
                return false;
            }
        } else if (s.length() < p.length()) {
            return false;
        }
        //s和p双指针
        charIsMatch(s, p, 0, 0, 0);
        if (pb[1] == true) {
            System.out.println("false");
            return false;
        }
        System.out.println("true");
        return true;
    }

    void charIsMatch(String s, String p, int s_point, int p_point, int level) {
        //截止条件
        System.out.println("level: " + level);
        System.out.println("s_point: " + s_point);
        System.out.println("p_point: " + p_point);
        if (p_point ==p.length() && s_point == s.length()) {
            pb[2] = true;
            return;
        }
        if (p_point > p.length() - 1 || s_point > s.length() - 1) {
            pb[1] = true;
            return;
        }
        //递归
        while (s_point < s.length() && p_point < p.length()) {
            //第一种情况，读到的p是字母
            if (p.charAt(p_point) >= 'a' && p.charAt(p_point) <= 'z') {
                //如果匹配成功，p和s指针都+1
                if (p.charAt(p_point) == s.charAt(s_point)) {
                    p_point++;
                    s_point++;
                }
                //匹配失败，直接修改pb[1]，程序结束
                else {
                    pb[1] = true;
                    return;
                }
            }
            //第二种情况，读到的是问号,直接+1跳过
            else if (p.charAt(p_point) == '?') {
                p_point++;
                s_point++;
            }
            //最后一种情况，读到的是*
            else if (p.charAt(p_point) == '*') {
                //i表示*号多匹配了i个字符
                //由于*可以表示空字符串，所以i的范围是-1到s的长度
                for (; s_point < s.length(); s_point++) {
                    charIsMatch(s, p, s_point, p_point + 1, level + 1);
                    if (pb[1] == false) {
                        return;
                    }
                    else {
                        pb[1] = false;
                        continue;
                    }
                }
                //pb[1]=true;
                return;
            }
        }
        return;
    }
}
