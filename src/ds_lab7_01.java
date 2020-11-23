import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ds_lab7_01 {
    public static void main(String[] args) {
        List<List<String>> res=solveNQueens(8);
        for(String str:res.get(0)){
            System.out.println(str);
        }
    }
    static List<List<String>> res = new ArrayList();


    //Determine whether the diagonals conflict
    public static boolean inspect(int ans, int []X) {
        for(int i = 0; i < ans; i++) {
            if(Math.abs(X[i] - X[ans]) == (ans - i)) {
                return false;
            }
        }
        return true;
    }

    public static void dfs(int ans, int n, int []vis, int []X) {

        //find the method
        if(ans == n) {
            char[][] nums = new char[n][n];
            List<String>tmp = new ArrayList();
            for(int i = 0; i < n; i++) {
                Arrays.fill(nums[i],'.');
                nums[i][X[i]] = 'Q';
                tmp.add(String.valueOf(nums[i]));
            }
            res.add(tmp);
            return ;
        }

        //find the suitable column int the row of ans
        // 在ans行的0~n-1列寻找合适的列
        for(int i = 0; i < n; i++) {
            //determine the ans
            X[ans] = i;
            //skip this curse if the column or row is same

            if(vis[i] == 1 || !inspect(ans, X)) {
                continue;
            }else{
                //recurse
                vis[i] = 1;
                dfs(ans+1, n, vis, X);
                vis[i] = 0;
            }
        }
    }
    public static List<List<String>> solveNQueens(int n) {

        //record the used column
        int []vis = new int[n];

        int []X = new int[n];

        //dfs
        dfs(0, n, vis, X);
        return res;
    }
}

