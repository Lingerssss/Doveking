/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Queue {
    public static void main(String[] args)  {
        try {
            BufferedReader in = new BufferedReader(new FileReader("ass2_sample_input"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);

            }
        } catch (IOException e) {
        }
    }

    double[][] input=new double[100][2];
    int n=10;
    double[] wait=new double[1000000];
    double[] server=new double[n];

    int index=0;
    void check(){
        //等待队列是否为空
        if(){
            //遍历等待数列，看能否插入
            if(){
                updateServer();
                updateWait();
            }
        }


    }
    void updateServer(double[] server){
        int earliset=0;

        //判断当前值能否直接服务
        for(int i=0;i<server.length;i++){
            earliset=Min(server,i,earliset);
        }
        if(input[index][0]>=server[earliset]){
            server[earliset]=input[index][0]+input[index][1];
        }
        else {
            updateWait();
        }
    }
    void updateWait(){
        for(int i=0;i<wait.length;i++){
            if(wait[i])
        }
    }






    private double Min(double a,double b){
        return a<b?a:b;
    }
    private int Min(double[]p,int i,int j){
        int index=0;
        if(p[i]<p[j]){
            index=i;
        }
        return index;
    }

}
*/
