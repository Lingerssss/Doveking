import java.util.*;

public class Leetcode1079_活字印刷 {
//    List<StringBuilder> ss=new ArrayList<>();
//    public int numTilePossibilities(String tiles) {
//        char[] chars = tiles.toCharArray();
//
//        Map<Integer,Integer> m=new HashMap<>();
//        for(int i:chars){
//            m.put(i,m.containsKey(i)?m.get(i)+1:1);
//        }
//        int len=m.size();
//        char[] p=new char[len];
//        int[] pb=new int[len];
//        int[] index=new int[1];
//        m.forEach((k,v)->{
//            p[index[0]]= Character.highSurrogate(k);
//            pb[index[0]]=v;
//            index[0]++;
//            System.out.println(p[index[0]]);
//        });
//
//        //boolean[] pb=new boolean[tiles.length()];
//
//
//
//
//        int[] res=new int[1];
//        dfs(tiles,chars,pb,new StringBuilder(),res);
//        return  res[0];
//
//
//    }
//    void dfs(String str,char[] p,int [] pb,StringBuilder chain,int[] res){
//        //
//
//        if(chain.length()!=0&&ss.contains(chain)==false){
//            StringBuilder temp=new StringBuilder();
//            ss.add(temp);
//            res[0]++;
//            System.out.println(res[0]);
//            if(chain.length()==str.length()) {
//                return;
//            }
//
//        }
//
//
//
//        //
//        for(int i=0;i<p.length;i++){
//            if(pb[i]!=0){
//                pb[i]--;
//                chain.append(p[i]);
//                dfs(str,p,pb,chain,res);
//                pb[i]++;
//                chain.deleteCharAt(chain.length()-1);
//            }
//        }
//
//    }
    public int numTilePossibilities(String tiles) {
        if (tiles == null || tiles.length() == 0) {
            return 0;
        }
        Set<StringBuilder> set = new HashSet<>();
        dfs(tiles, new StringBuilder(), set, new ArrayList<>());
        return set.size();
    }
    void dfs(String tiles, StringBuilder chain, Set<StringBuilder> set, List<Integer> list) {
        for (int i = 0; i < tiles.length(); i++) {
            if (!list.contains(i)) {
                chain.append(tiles.charAt(i));
                set.add(chain);
                list.add(i);
                dfs(tiles, chain , set, list);
                list.remove((Integer)i);
            }
        }
    }

}
