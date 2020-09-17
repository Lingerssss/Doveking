import java.util.Scanner;

public class 美团911_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }
        int res = count(n, m, k, p);
        System.out.println(res);

    }

    static int count(int n, int m, int k, int[] p) {
        //异常情况
        if (m > n) {
            return 0;
        }
        int count = 0;
        boolean pb = false;

        for (int left = 0; left < n; left++) {
            //System.out.println("n: " + n);
            //System.out.println("m: " + m);
            if (left + m <= n) {
                for (int j = 0; j < m; j++) {
                   // System.out.println(p[left + j]);
                    if (p[left + j] < k) {
                        pb = true;
                        break;
                    }
                }
                if (pb == false) {
                    count++;
                   // System.out.println(count);
                } else pb = false;
            }
        }
        //System.out.println(count);
        return count;
    }


}

