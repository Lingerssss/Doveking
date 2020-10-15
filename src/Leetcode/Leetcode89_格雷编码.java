//import java.util.ArrayList;
////格雷编码是一个二进制数字系统，在该系统中，两个连续的数值仅有一个位数的差异。
//import java.util.List;
//
//import static java.lang.Integer.parseInt;
//
//public class Leetcode89_格雷编码 {
//    public List<Integer> grayCode(int n) {
//        List<StringBuilder> res=new ArrayList<>();
//
////        if(n==0){
////
////        }
////        double length= Math.pow(2,n);
//        dfs(n,new StringBuilder(),res);
//        List<Integer> ss= new ArrayList<>();
//        for(int i=0;i<res.size();i++){
//            ss.add(parseInt(res.get(i).toString(),2));
//
//        }
//        System.out.println(ss);
//        return ss;
//
//    }
//    void dfs(int n,StringBuilder str,List<StringBuilder> res){
//        //
//        if(str.length()==n){
//            if(str!=null){
//                res.add(new StringBuilder(str));
//            }
//            System.out.println(res);
//            return;
//        }
//        //输出二进制串备选的就是0，1
//        for(int i=0;i<2;i++){
//            if()
//            str.append(i);
//            System.out.println(str);
//            dfs(n,str,res);
//            str.deleteCharAt(str.length()-1);
//        }
//
//    }
//}
