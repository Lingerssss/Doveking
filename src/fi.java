import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fi {
    public static void main(String[] args) {
        int[] n = new int[1];
        int jobLength = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name for the dataset: ");
        String filename = sc.nextLine();
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String str;
            while ((str = in.readLine()) != null) {
                jobLength++;
            }
        } catch (IOException e) {
        }
        jobLength--;
        double[][] jobs = new double[jobLength][3];
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String str;
            n[0] = Integer.parseInt(in.readLine());
            int index = 0;
            while ((str = in.readLine()) != null) {
                String[] tmp = str.split(" ");
                jobs[index][0] = Double.parseDouble(tmp[0]);
                jobs[index][1] = Double.parseDouble(tmp[1]);
                jobs[index][2] = 0;
                index++;
            }
        } catch (IOException e) {
        }
        System.out.println("The result of single queue-----------------------:");
        singleQueue(jobs, n[0]);
        System.out.println("The result of multi queue------------------------:");
        multiQueue(jobs, n[0]);

    }

    public static void singleQueue(double[][] jobs, int n) {
        int serverCount = n;
        double[][][] serverState = new double[serverCount][jobs.length][2];

        int left = 0;
        int right = 0;

        int Max = Integer.MIN_VALUE;
        //  Average service time:
        double ast = 0;
        //
        double astT = 0;

        double maxAstT = Double.MIN_VALUE;

        int[] length = new int[serverCount];

        for (int u = 0; u < length.length; u++) {
            length[u] = 1;
        }
        while (left < jobs.length) {
            // find index of min
            double min = Integer.MAX_VALUE;
            int index = 0;
            for (int r = 0; r < serverState.length; r++) {

                if (serverState[r][length[r] - 1][0] < min) {
                    min = serverState[r][length[r] - 1][0];
                    index = r;

                }
            }
            int yee = length[index];
            // begintime
            double beginTime = Double.max(serverState[index][yee - 1][0], jobs[left][0]);
            while (right < jobs.length && beginTime >= jobs[right][0]) {
                right++;
            }

            Max = Math.max(Max, right - left);
            serverState[index][yee - 1][1] = beginTime;
            jobs[left][2] = beginTime;

            serverState[index][yee][0] = serverState[index][yee - 1][1] + jobs[left][1];
            serverState[index][yee][1] = 0;
            length[index] = length[index] + 1;

            // count time
            ast += jobs[left][1];
            astT += jobs[left][2] - jobs[left][0];
            maxAstT = Double.max(maxAstT, jobs[left][2] - jobs[left][0]);
            left++;
        }
        // Number of people served.
        //  Time that the last customer being completely served (total simulation time).
        double lc = jobs[jobs.length - 1][2] + jobs[jobs.length - 1][1];
        System.out.println("Time that the last customer being completely served (total simulation time): " + lc);
        //  Average service time (note this should depend only on the input file).
        double astPer = ast / serverCount;
        System.out.println("Average service time (note this should depend only on the input file): " + astPer);
        //  Average time a customer spends in queue.
        double astTPer = astT / jobs.length;
        System.out.println("Average time a customer spends in queue: " + astTPer);
        //  Maximum time a customer spends in queue.
        System.out.println("Maximum time a customer spends in queue: " + maxAstT);
        //  Average length of queue in any given second. For each queue and in total for the multi-queue version of the simulation.
        System.out.println("Average length of queue in any given second. For each queue and in total for the multi-queue version of the simulation: " + 1);
        //  Maximum Length of queue. For each queue and in total for the multi-queue version of the simulation.
        System.out.println("Maximum Length of queue. For each queue and in total for the multi-queue version of the simulation: " + Max);
        //  Total idle time for each server.
        for (int r = 0; r < serverState.length; r++) {
            double workTime = 0;
            for (int f = 1; f < serverState[r].length; f++) {
                workTime += serverState[r][f][0] - serverState[r][f - 1][1];
            }
            System.out.print("server: " + r);
            double ttt = lc - workTime;
            System.out.println(":" + ttt);
        }


    }

    public static void multiQueue(double[][] jobs, int n) {
        int serverCount = n;


        double[][][] queues = new double[serverCount][jobs.length + 1][3];
        int[][] queuesSE = new int[serverCount][2];
        for (int left = 0; left < queuesSE.length; left++) {
            queuesSE[left] = new int[]{0, 0};
        }
        double[][][] serverState = new double[serverCount][jobs.length + 1][2];
        int[] serverStatelength = new int[serverCount];
        for (int right = 0; right < serverStatelength.length; right++) {
            serverStatelength[right] = 1;
        }

        int left = 0;
        int Max = Integer.MIN_VALUE;
        double ast = 0;

        while (left < jobs.length) {
            ast += jobs[left][1];
            // the next time
            double time = jobs[left][0];
            for (int right = 0; right < serverState.length; right++) {
                //
                int start = queuesSE[right][0];
                int end = queuesSE[right][1];

                while (start < end && queues[right][start][0] < time) {
                    int yee = serverStatelength[right];
                    double beginTime = Double.max(serverState[right][yee - 1][0], queues[right][start][0]);
                    serverState[right][yee - 1][1] = beginTime;
                    queues[right][start][2] = beginTime;

                    serverState[right][yee][0] = serverState[right][yee - 1][1] + queues[right][start][1];
                    serverState[right][yee][1] = 0;
                    // update length
                    serverStatelength[right] += 1;
                    start++;
                }
                queuesSE[right][0] = start;
            }
            // select the queue

            int min = Integer.MAX_VALUE;
            int minIndex = 0;

            for (int k = 0; k < queuesSE.length; k++) {
                int qLength = queuesSE[k][1] - queuesSE[k][0] + 1;
                if (qLength < min) {
                    min = qLength;
                    minIndex = k;
                }
                Max = Integer.max(Max, qLength);
            }


            // input
            queues[minIndex][queuesSE[minIndex][1]][0] = jobs[left][0];
            queues[minIndex][queuesSE[minIndex][1]][1] = jobs[left][1];
            queues[minIndex][queuesSE[minIndex][1]][2] = jobs[left][2];

            // update length
            queuesSE[minIndex][1]++;

            left++;
        }
        for (int right = 0; right < serverState.length; right++) {
            //
            int start = queuesSE[right][0];
            int end = queuesSE[right][1];
            while (start < end) {
                int yee = serverStatelength[right];
                double beginTime = Double.max(serverState[right][yee - 1][0], queues[right][start][0]);
                serverState[right][yee - 1][1] = beginTime;
                queues[right][start][2] = beginTime;

                serverState[right][yee][0] = serverState[right][yee - 1][1] + queues[right][start][1];
                serverState[right][yee][1] = 0;
                serverStatelength[right] += 1;
                start++;
            }
            queuesSE[right][0] = start;
        }

        // Number of people served.
        System.out.println("Number of people served." + jobs.length);
        double maxTime = 0;
        for (int q = 0; q < serverState.length; q++) {
            int end = queuesSE[q][1];
            maxTime = Double.max(serverState[q][end][0], maxTime);
        }
        System.out.println("that the last customer being completely served (total simulation time) is: " + maxTime);

        //  Average service time (note this should depend only on the input file).
        double astPer = ast / serverCount;
        System.out.println("Average service time (note this should depend only on the input file) is: " + astPer);
        //  Average time a customer spends in queue.
        double aT = 0;
        for (int q = 0; q < serverCount; q++) {
            int end = queuesSE[q][1];
            for (int w = 0; w < end; w++) {
                aT += queues[q][w][2] - queues[q][w][0];
            }
        }

        double aTP = aT / jobs.length;
        System.out.println("Average time a customer spends in queue: " + aTP);
        //  Maximum time a customer spends in queue.
        double maxT = Double.MIN_VALUE;
        for (int q = 0; q < serverCount; q++) {
            int end = queuesSE[q][1];
            for (int w = 0; w < end; w++) {
                maxT = Double.max(maxT, queues[q][w][2] - queues[q][w][0]);
            }
        }
        System.out.println("Maximum time a customer spends in queue is: " + maxT);
        //  Average length of queue in any given second. For each queue and in total for the multi-queue version of the simulation.
        System.out.println("Average length of queue in any given second. For each queue and in total for the multi-queue version of the simulation is: " + 1);
        //  Maximum Length of queue. For each queue and in total for the multi-queue version of the simulation.
        System.out.println("Maximum Length of queue. For each queue and in total for the multi-queue version of the simulationmaxQ is: " + Max);
        //  Total idle time for each server.
        for (int r = 0; r < serverState.length; r++) {
            double workTime = 0;
            for (int f = 1; f < serverState[r].length; f++) {
                workTime += serverState[r][f][0] - serverState[r][f - 1][1];
            }
            System.out.print("server: " + r);
            double ttt = maxTime - workTime;
            System.out.println(":" + ttt);
        }

    }

}



