import java.util.Arrays;

public class Shenxinfu_3 {
    public int maxCoins (int[] piles) {
        int res=0;
        Arrays.sort(piles);
        int index=2;
        while(index<piles.length){
            res+=piles[index];
        }
        return res;
    }
}
