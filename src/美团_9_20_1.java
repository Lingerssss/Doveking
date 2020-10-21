/*
import java.util.ArrayList;
import java.util.List;

public class 美团_9_20_1 {
    int plus;
    int minus;
    int count;
    public void find_way(int n,int m,int plus,int minus,int[][] p) {
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[0].length; j++) {
                if (p[i][j] == 'S') {
                    move()
                }
            }
        }
    }


    void dfs(String S,int x,int y){
        for(int i=0;i<S.length();i++){
            move(x,y,S.charAt(i));
        }

    }



     boolean wall(int x,int y,char[][] p){
        if(p[x][y]=='#'){
            return false;
        }
        else {
            return true;
        }
    }
    void reward(char c){
        if(c=='O'){
            count+=plus;
        }
        if(c=='X'){
            count-=minus;
        }

    }






    int[] move(int i,int j,char c){
        int[] res=new int[2];
        if(c=='W'){
            res[0]=i-1;
            res[0]=j;
        }
        if(c=='A'){
            res[0]=i;
            res[0]=j-1;
        }
        if(c=='S'){
            res[0]=i+1;
            res[0]=j;
        }
        if(c=='D'){
            res[0]=i;
            res[0]=j+1;
        }
        return res;
    }

    //find way
    List<int[]> getNear(int i, int j, int x, int y,char[][] p) {
        List<int[]> list = new ArrayList<>();
        if (i - 1 >= 0&&wall(i-1,j,p)==false) {
            list.add(new int[]{i - 1, j});
        }
        if (i + 1 < x&&wall(i-1,j,p)==false) {
            list.add(new int[]{i + 1, j});
        }
        if (j - 1 >= 0&&wall(i-1,j,p)==false) {
            list.add(new int[]{i, j - 1});
        }
        if (j + 1 < y&&wall(i-1,j,p)==false) {
            list.add(new int[]{i, j + 1});
        }
        return list;
    }
}
*/
