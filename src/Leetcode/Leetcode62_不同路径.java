package Leetcode;

public class Leetcode62_不同路径 {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m+1][n+1];

        for(int i=1;i<m+1;i++){
            dp[i][1]=1;
        }
        for(int i=1;i<n+1;i++){
            dp[1][i]=1;
        }
/*        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                System.out.print(dp[i][j]);
            }
            System.out.print("\n");
        }*/

        for(int i=2;i<m+1;i++){
            for(int j=2;j<n+1;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
                System.out.print("i:"+i);
                System.out.print("j:"+j);
                System.out.print("    ");
                System.out.print("dp: "+dp[i][j]);
                System.out.print("    ");
            }
            System.out.print("\n");
        }
        return dp[m][n];
    }
}
