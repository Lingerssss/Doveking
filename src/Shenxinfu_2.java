public class Shenxinfu_2 {
    public int minDistance (String a, String b) {
        int lena=a.length();
        int lenb=b.length();
        //Dp arrays
        if(0==lena*lenb){
            return lena+lenb;
        }
        int[][] dp=new int[lena+1][lenb+1];
        for(int i=0;i<lena+1;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<lenb+1;j++){
            dp[0][j]=j;
        }
        for(int i=1;i<lena+1;i++){
            for(int j=1;j<lenb+1;j++){
                int left=dp[i-1][j]+1;
                int down=dp[i][j-1]+1;
                int left_down=dp[i-1][j-1];
                if(a.charAt(i-1)!=b.charAt(j-1)){
                    left_down+=1;
                }
                dp[i][j]=Math.min(left,Math.min(down,left_down));
            }
        }
        return dp[lena][lenb];
    }
}
