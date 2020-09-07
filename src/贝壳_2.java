import java.util.Scanner;

public class 贝壳_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m=scanner.nextInt();
        int[] p=new int[m];
        for(int i=0;i<m;i++){
            p[i]=scanner.nextInt();

        }
        int[] res=new int[m];

        int[] count=new int[1];
        int temp=0;
        int[] ss=new int[m];
        for(int i=0;i<m;i++){

            dfs(p,i,count);
            System.out.println(count[0]);
                        if(count[0]>temp){
                res=p;

            }

        }
        for(int e:p){
            System.out.println(e);
        }


    }
    static void dfs(int[] p,int index ,int[] count){
        //if()

        int temp=0;

            System.out.println("max: "+max);
            count[0]=max;

            for(int left=index-1;left>0;left--){
                max=
                while(p[left]>max){
                    p[left]--;
                    //System.out.println(count);

                }
                max=p[left];
                count[0]+=p[left];
            }
            for(int right=index+1;right<p.length;right++){
                while(p[right]>max){
                    p[right]--;
                }
                max=p[right];
                count[0]+=p[right];
                //System.out.println(count[0]);
            }
            /*System.out.println();
            if(count>temp){
                temp=count;
                for(int iii=0;iii<p.length;iii++){
                    res[iii]=p[iii];
                }
            }*/





    }


}
