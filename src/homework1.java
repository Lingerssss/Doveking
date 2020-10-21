import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        //Input the number of Integers
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter the number of integers to calculate：");
        int n = scanner1.nextInt();
        //Input Integers
        System.out.println("Please enter an integer to calculate, distinguished by spaces：");
        Scanner scanner2 = new Scanner(System.in);
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner2.nextInt();
        }
        //Input the selection of mode
        System.out.println("Please select the mode:\n" +
                "enter the number\n" +
                "1 for the maximum value\n" +
                "2 for the minimum value\n" +
                "3 for the mean\n" +
                "4 for the variance\n");
        Scanner scanner3 = new Scanner(System.in);
        int choice = scanner3.nextInt();
        switch (choice) {
            case 1:
                System.out.println("The maximum is " + Max(p));
                break;
            case 2:
                System.out.println("The minimum is " + Min(p));
                break;
            case 3:
                System.out.println("The mean is " + Mean(p));
                break;
            case 4:
                System.out.println("The variance is " + Variance(p));
                break;
        }
    }

    //The calculation of maximum
    static private int Max(int[] p) {
        int res = 0;
        for (int i : p) {
            if (i > res) {
                res = i;
            }
        }
        return res;
    }

    //The calculation of minimum
    static private int Min(int[] p) {
        int res = p[0];
        for (int i : p) {
            if (i < res) {
                res = i;
            }
        }
        return res;
    }

    //The calculation of mean
    static private double Mean(int[] p) {
        int res = 0;
        double ave = 0;
        for (int i : p) {
            res += i;
        }
        ave = res / p.length;
        return ave;
    }

    //The calculation of varience
    static private double Variance(int[] p) {
        int res = 0;
        double ave = 0;
        double count = 0;
        ave = Mean(p);
        for (int i : p) {
            count += (i - ave) * (i - ave);
        }
        return count / p.length;
    }
}
