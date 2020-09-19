public class Leetcode50_pow {
    public double myPow(double x, int n) {
        double res=1;
        if(x==1){
            return 1;
        }
        if(x==0&&n==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(n>0){
            while (n > 0) {
                res = res * x;
                n--;
            }
            return res;

        }
        else if(n<Integer.MIN_VALUE){
            return 1;
        }
        else{
            n= -n;
            while (n > 0) {
                res = res * x;
                n--;
            }
            return 1/res;
        }

    }

}

