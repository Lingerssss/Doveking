import java.util.ArrayList;
import java.util.List;

public class Leetcode1219_黄金矿工 {
    int[] res=new int[1];
    public int getMaximumGold(int[][] p) {
        int count[] =new int[1];
        if (p.length == 0) return 0;
        if (p[0].length == 0) return 0;
        boolean[][] pb = new boolean[p.length][p[0].length];
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[0].length; j++) {
                /*System.out.println("i"+i);
                System.out.println("j"+j);*/
                if (pb[i][j] == false &&p[i][j]!=0) {
                    count[0]=p[i][j];
                    pb[i][j]=true;
                    dfs(p, pb, i, j,count);
                    pb[i][j]=false;

                }




            }
        }
//        System.out.println(res[0]);
        return res[0];
    }

    void dfs(int[][] p, boolean[][] pb, int i, int j,int[] count) {
        //ending
        //

        for (int[] loc : getNear(i, j, p.length, p[0].length)) {
            //筛选
           /* System.out.println("loc[0]: "+loc[0]);
            System.out.println("loc[1]: "+loc[1]);
            System.out.println("p: "+p[loc[0]][loc[1]]);
            System.out.println("pb: "+pb[loc[0]][loc[1]]);*/

            if ( pb[loc[0]][loc[1]] == false&&p[loc[0]][loc[1]]!=0) {
                pb[loc[0]][loc[1]] = true;
                count[0]+=p[loc[0]][loc[1]];
                //System.out.println("count_"+count[0]);
                dfs(p, pb, loc[0], loc[1],count);
                pb[loc[0]][loc[1]] = false;
                count[0]-=p[loc[0]][loc[1]];

                //pb[loc[0]][loc[1]]不能再赋值为false，因为不需要再用之前用过的了
            }
            if(res[0]<count[0]){
                res[0]=count[0];

            }

        }


    }

    List<int[]> getNear(int i, int j, int x, int y) {
        List<int[]> list = new ArrayList<>();
        if (i - 1 >= 0) list.add(new int[]{i - 1, j});
        if (i + 1 < x) list.add(new int[]{i + 1, j});
        if (j - 1 >= 0) list.add(new int[]{i, j - 1});
        if (j + 1 < y) list.add(new int[]{i, j + 1});
        return list;
    }
}
