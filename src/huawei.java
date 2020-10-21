import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class huawei {
    


    /*public void input(String[] args) {
        List<Integer> res=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int End = sc.nextInt();
        int Num = sc.nextInt();

        int[][] p = new int[Num][4];
        boolean[] pb=new boolean[4];
        //p[][0]=ID
        //p[][1]=property
        //p[][2]=begin
        //p[][3]=time
        for (int i = 0; i < Num; i++) {
            for (int j = 0; j < 4; j++) {
                p[i][j] = sc.nextInt();
            }
        }
        int[] time=new int[3];
        dfs(p,pb,new ArrayList<>(),time,count,res);
    }*/

     public void dfs(int[][] p,boolean[]pb, List<Integer> chain, int[] time, int[] count,List<Integer> res) {
        //
         System.out.println("rrr________"+res);

        if (count[0] >= count[1]) {
            //利润一样取任务数少的
            if (count[0] == count[1]) {
                if (chain!=null&&res!=null&&chain.size() <= res.size()) {
                    //任务数一样比编号小的
                    if (chain.size() == res.size()) {
                        for (int i = 0; i < chain.size(); i++) {
                            if (chain.get(i) <= res.get(i)) {
                                if(chain.get(i).equals(res.get(i))){
                                    continue;
                                }
                                res = new ArrayList<>();
                                break;
                            }

                        }
                    } else {
                        res = new ArrayList<>();
                    }
                    //res = new ArrayList<>(chain);
                }
            } else {
            count[1] = count[0];
                res = new ArrayList<>(chain);
                System.out.println("count: "+res);
            }
            //res=new ArrayList<>(chain);
        }

        //
        for (int i = 0; i < p.length; i++) {
            //开始和结束时间都不能大于终止时间
            if (p[i][2] >= time[0] && p[i][2] + p[i][3] <= time[2]) {
                if (pb[i]==false) {
                    pb[i]=true;
                    chain.add(p[i][0]);
                    System.out.println(chain);
                    time[0] +=p[i][2]+p[i][3];
                    count[0]+=p[i][1];
                    dfs(p, pb,chain ,time, count,res);
                    time[0] -= p[i][2]+p[i][3];
                    pb[i]=false;
                    count[0]-=p[i][1];
                    chain.remove(chain.size() - 1);
                }
            }

        }

    }


}
