public class ds_lab7_02 {
    public static void main(String[] args) {
        int[][] input=new int[][]{
                {13,4,7,6},
                {1,11,5,4},
                {6,7,2,8},
                {1,3,5,9}
        };
        boolean[][] pb= new boolean[input.length][input[0].length];
        int[] res=new int[2];
        res[0]=Integer.MAX_VALUE;
        dfs(input,pb,0,res);
        System.out.println("The minimum of total setup time is: "+res[0]);
    }
    static void dfs(int[][] p,boolean[][] pb,int length,int[] res){
        //ending situation
        if(4==length){
            /*if(res[1]<res[0]){
                res[0]=res[1];
            }*/
            res[0]=res[1]<res[0]?res[1]:res[0];

        }
        //if data is used,
        for(int col=0;col<p[0].length;col++){
            for(int row=0;row<p.length;row++){
                if(false==pb[row][col]){
                    ban(pb,row,col);
                    res[1]+=p[row][col];
                    System.out.println("p: "+p[row][col]);
                    System.out.println("res: "+res[1]);
                    dfs(p,pb,length+1,res);
                    res[1]-=p[row][col];
                    recover(pb,row,col);
                }
            }
        }
        return;

    }
    static void ban(boolean[][] pb,int index1,int index2){
        for(int i=0;i<pb[0].length;i++){
            pb[index1][i]=true;
        }
        for(int i=0;i< pb.length;i++){
            pb[i][index2]=true;
        }
    }
    static void recover(boolean[][] pb,int index1,int index2){
        for(int i=0;i<pb[0].length;i++){
            pb[index1][i]=false;

        }
        for(int i=0;i< pb.length;i++){
            pb[i][index2]=true;
        }
    }


}
