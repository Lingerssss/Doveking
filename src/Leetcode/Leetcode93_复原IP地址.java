import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode93_复原IP地址 {
    //    public List<String> restoreIpAddresses(String s) {
//        List<String> res = new ArrayList<>();
//        dfs(s,1,-1,new LinkedList<>(),res);
//        //System.out.println(res);
//        return res;
//
//    }
//    void dfs(String s, int level, int index, LinkedList<String> chain, List<String> res){
//        //
//        System.out.println("level: "+level);
//        System.out.println("index: "+index);
//        if(level==5||index==s.length()-1){
//            if(level==5&&index==s.length()-1){
//                //为什么不能add chain
//                //因为res里其实是chain的地址，后面DFS中修改了chain以后，res里已经发生了变化
//                res.add(String.join(".",new LinkedList<>(chain)));
//                System.out.println(res);
//            }
//            return;
//        }
//        //
//        for(int i=1;i<4;i++){
//            //如果没有这一步长度限制，像19216801这个例子，取到最后的0和01都不能继续，就会越界
//            if(index+i+1<=s.length()) {
//                String temp = s.substring(index + 1, index + 1 + i);
//                System.out.println("temp: "+temp);
//                //筛选
//                //每一个temp需要小于256，而且不能以0 开头，但如果temp长度为1即temp单为0时可以
//                //绝壁不能写temp==啊，傻了逼了
//                if(Integer.parseInt(temp)<256&&(temp.equals("0")||temp.charAt(0)!='0')){
//                    chain.add(temp);
//                    System.out.println("chain: "+chain);
//                    dfs(s,level+1,index+i,chain,res);
//                    chain.removeLast();
//                }
//            }
//        }
//    }
    //DFS
    /*public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        dfs(s, 1, 0, new LinkedList<>(), res);
        //System.out.println(res);
        return res;

    }

    void dfs(String s, int level, int index, LinkedList<String> chain, List<String> res) {
        //
        //System.out.println("level: "+level);
        //System.out.println("index: "+index);
        if (level == 5 || index == s.length()) {
            if (level == 5 && index == s.length()) {
                //为什么不能add chain
                //因为res里其实是chain的地址，后面DFS中修改了chain以后，res里已经发生了变化
                res.add(String.join(".", new LinkedList<>(chain)));
                //System.out.println(res);
            }
            return;
        }
        //
        for (int i = 1; i < 4; i++) {
            //如果没有这一步长度限制，像19216801这个例子，取到最后的0和01都不能继续，就会越界
            if (index + i <= s.length()) {
                String temp = s.substring(index, index + i);
                //System.out.println("temp: "+temp);
                //筛选
                //每一个temp需要小于256，而且不能以0 开头，但如果temp长度为1即temp单为0时可以
                //绝壁不能写temp==啊，傻了逼了
                if (Integer.parseInt(temp) < 256 && (temp.equals("0") || temp.charAt(0) != '0')) {
                    chain.add(temp);
                    System.out.println("chain: " + chain);
                    dfs(s, level + 1, index + i, chain, res);
                    chain.removeLast();
                }
            }
        }
    }*/

}
