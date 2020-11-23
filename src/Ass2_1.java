import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ass2_1 {
    public static double min(double a ,double b){
        return a<b?a:b;
    }
    static int[] n=new int[1];
    static double[][] task = new double[100000][3];

    public static void readFile(String filename){
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String str;
            n[0]=Integer.parseInt(in.readLine());
            int index=0;
            while ((str = in.readLine()) != null) {
                String[] tmp=str.split(" ");
                task[index][0]=Double.parseDouble(tmp[0]);
                task[index][1]=Double.parseDouble(tmp[1]);
                task[index][2]=0;
                index++;
            }
        }
        catch (IOException e) {
        }

    }
    public static void update() {
        int serverCount=n[0];
        double[][][] server = new double[serverCount][task.length][2];
        // 虚拟的队列头尾
        int begin = 0;
        int end  = 0;

        // 这里是数据
        // 最大队列数量
        int maxQ = Integer.MIN_VALUE;
        //  "Average service time:
        double aveSevTime = 0;
        //
        double astT = 0;

        double maxAstT = Double.MIN_VALUE;

        int[] length = new int[serverCount];

        for (int u = 0; u < length.length; u++){
            length[u] = 1;
        }
        while(begin < task.length) {
            // 找出serverState的最小值的下标
            double min = Integer.MAX_VALUE ;
            int index = 0;
            for (int r = 0; r < server.length; r++){
                index=server[r][length[r]-1][0] < min?r:index;
                min=min(min,server[r][length[r]-1][0]);
            }
            int y = length[index];
            // 实际服务开始时间
            double beginTime = Double.max(server[index][y-1][0],task[begin][0]);
            // 更新虚拟队列尾部
            while(end < task.length && beginTime >= task[end][0]){
                end++;
            }

            maxQ = Math.max(maxQ, end-begin);
            server[index][y-1][1] = beginTime;
            task[begin][2] = beginTime;

            server[index][y][0] = server[index][y-1][1] + task[begin][1];
            server[index][y][1] = 0;
            length[index] = length[index] + 1;

            // 统计时间
            aveSevTime += task[begin][1];
            astT += task[begin][2] - task[begin][0];
            maxAstT = Math.max(maxAstT,task[begin][2] - task[begin][0]);
            begin++;
        }
        // Time that the last customer being completely served
        double finalTime= task[task.length-1][2]+task[task.length-1][1];
        System.out.println(finalTime);
//        Average service time:
        double astPer = aveSevTime / serverCount;
        System.out.println(astPer);
//        Average time a customer spends in queue:
        double astTPer = astT / task.length;
//        Maximum time a customer spends in queue
//        maxAstT 这个变量

//        "Average length of queue in any given second. For each queue and in total for the multi-queue version of the simulation.:","???")

//        "Maximum Length of queue:",maxQ 这个变量

//        "Total idle time for each server:"

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a name for the dataset");
        String input=sc.nextLine();
        System.out.println("Please select the queuing mode: 1 for single queue, 2 for multi queue.");
        int mode=sc.nextInt();
        readFile(input);
        update();
    }
}
