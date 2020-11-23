public class Ass2_2 {
    public static void multi(){
        int serverCount = 2;
        double[][] jobs = new double[][]{
                {1, 2, 0},
                {2, 4, 0},
                {3, 1, 0},
                {4, 2, 0},
                {5, 1, 0}
        };

        double[][][] queues = new double[serverCount][jobs.length+1][3];
        /* 使用hash表来记录动态长度 */
        int[][] queuesSE = new int[serverCount][2];
        for (int i = 0; i < queuesSE.length; i++){
            queuesSE[i] = new int[]{0,0};
        }

        double[][][] serverState = new double[serverCount][jobs.length+1][2];
        // 使用hash表来记录动态长度
        int[] serverStatelength = new int[serverCount];
        for (int j = 0; j < serverStatelength.length; j++){
            serverStatelength[j] = 1;
        }

        int i = 0;

        while (i < jobs.length){
            // 下一个任务到来时间
            double time = jobs[i][0];
            // 每个服务消费任务到下一次时间到来
            for (int j = 0; j < serverState.length; j++){
                //
                int start = queuesSE[j][0];
                int end = queuesSE[j][1];

                while (start < end && queues[j][start][0] < time){
                    int y = serverStatelength[j];
                    double sT = Double.max(serverState[j][y-1][0],queues[j][start][0]);
                    serverState[j][y-1][1] = sT;
                    queues[j][start][2] = sT;

                    serverState[j][y][0] = serverState[j][y-1][1] + queues[j][start][1];
                    serverState[j][y][1] = 0;
                    // 更新队列长度
                    serverStatelength[j] += 1;
                    start++;
                }
                queuesSE[j][0] = start;
            }
            // 选择最短队列

            int min = Integer.MAX_VALUE;
            // 最短队列的下标数
            int minIndex = 0;

            for (int k = 0; k < queuesSE.length; k++){
                int qLength = queuesSE[k][1] - queuesSE[k][0] + 1;
                if(qLength < min){
                    min = qLength;
                    minIndex = k;
                }
            }


            // 填入数据
            queues[minIndex][queuesSE[minIndex][1]][0] = jobs[i][0];
            queues[minIndex][queuesSE[minIndex][1]][1] = jobs[i][1];
            queues[minIndex][queuesSE[minIndex][1]][2] = jobs[i][2];

            // 入队,更新队列长度
            queuesSE[minIndex][1]++;

            i++;
        }
        for (int j = 0; j < serverState.length; j++){
            //
            int start = queuesSE[j][0];
            int end = queuesSE[j][1];

            while (start < end){
                int y = serverStatelength[j];
                double sT = Double.max(serverState[j][y-1][0],queues[j][start][0]);
                serverState[j][y-1][1] = sT;
                queues[j][start][2] = sT;

                serverState[j][y][0] = serverState[j][y-1][1] + queues[j][start][1];
                serverState[j][y][1] = 0;
                // 更新队列长度
                serverStatelength[j] += 1;
                start++;
            }
            queuesSE[j][0] = start;
        }

        // Number of people served.
        //  Time that the last customer being completely served (total simulation time).
        double maxTime = 0;
        for (int q = 0; q < serverState.length; q++){
            int end = queuesSE[q][1];
            maxTime = Double.max(serverState[q][end][0], maxTime);
        }

        //  Average service time (note this should depend only on the input file).
        //  Average time a customer spends in queue.
        double aT = 0;
        for (int q = 0; q < serverCount; q++){
            int end = queuesSE[q][1];
            for(int w = 0; w < end; w++){
                aT += queues[q][w][2] - queues[q][w][0];
            }
        }
        double aTP = aT/ jobs.length;
        //  Maximum time a customer spends in queue.
        double maxT = Double.MIN_VALUE;
        for (int q = 0; q < serverCount; q++){
            int end = queuesSE[q][1];
            for(int w = 0; w < end; w++){
                maxT = Double.max(maxT, queues[q][w][2] - queues[q][w][0]);
            }
        }
        //  Average length of queue in any given second. For each queue and in total for the multi-queue version of the simulation.
        //  Maximum Length of queue. For each queue and in total for the multi-queue version of the simulation.
        //  Total idle time for each server.

        int a = 1;
    }
    public static void main(String[] args){
    }
}
