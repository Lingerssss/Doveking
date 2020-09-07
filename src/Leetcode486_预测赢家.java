public class Leetcode486_预测赢家 {
    public boolean PredictTheWinner(int[] p) {
        //save the personal score
        int[] count=new int[2];
        boolean[] pb= new boolean[p.length];

        na(p,pb,count);





        return true;

    }
    void na(int[] p,boolean[] pb,int[] count){
        //



        //
        for(int i=0;i<p.length;i++){
            if(pb[i]==false){

                pb[0]=true;
                count[0]+=p[i];
                na(p,pb,count);
                pb[0]=false;
            }
        }

    }

}
