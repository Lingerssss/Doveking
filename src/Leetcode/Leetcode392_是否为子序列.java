package Leetcode;

public class Leetcode392_是否为子序列 {
    public boolean isSubsequence(String s, String t) {
        /*int index=-1;
        //用一个bool来判断s的某一位是不是在t中有对应的char；
        boolean pb=false;
        //boolean[] pb=new boolean[s.length()];
        if(0==s.length()){
            return true;
        }
        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i);
            for(int j=index+1;j<t.length();j++){
                char tc=t.charAt(j);
                if(tc==sc){
                    //pb[i]=true;
                    pb=true;
                    index=j;
                    break;
                }
            }
            if(pb==false){
                return false;
            }
            else {
                pb=false;
            }
            // if(pb[i]==false){
            //     return false;
            // }
        }
        return true;*/


        //美妙
        //indexOf方法从fromindex开始查找c，返回找到的第一个下标，若找不到返回-1；

        int index = -1;
        for (char c : s.toCharArray()) {
            index = t.indexOf(c, index + 1);
            if (index == -1) {
                return false;
            }
        }
        return true;
    }
}
