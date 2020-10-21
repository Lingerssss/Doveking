import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;


public class fenghuo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //n人数，m课程数，k聊天记录数
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[][] res=new int[n][m];
        int[][] p=new int[n][m];
            //n * m array
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                p[i][j]=sc.nextInt();
                //System.out.println(p[i][j]);

            }
        }
        int [][] p2=new int[k][2];
        for(int i=0;i<k;i++){
            for(int j=0;j<2;j++){
                p2[i][j]=sc.nextInt();
                //System.out.println(p2[i][j]);
            }
            //System.out.println("\n");
        }







       for(int i=0;i<k;i++){
                add(p2[i][0]-1,p2[i][1]-1,p,res);
            }
        for(int i=0;i<p.length;i++){
            for(int j=0;j<p[0].length;j++){
                System.out.println(res[i][j]);
            }
            System.out.println('\n');
        }


       int[] ss=new int[res.length];
       for(int i=0;i<res.length;i++){
           for(int j=0;j<res[0].length;j++){
               ss[i]+=res[i][j];
           }
       }
       for(int i:ss){
           System.out.println(i);
       }
    }

    public static void add(int x,int y,int[][] p,int[][] res){
        for(int i=0;i<p.length;i++){
            System.out.println(p[i][y]);
            if(p[i][y]==1&&i!=x){
                res[i][y]++;

            }
        }
    }
}
