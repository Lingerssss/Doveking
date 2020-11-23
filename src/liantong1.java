import java.util.Scanner;

public class liantong1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        int s = sc.nextInt();
        zhaoqian(d, s);

    }

    static void zhaoqian(double d, int s) {
        double[] money = new double[]{100, 50, 10, 1, 0.5, 0.1};
        double target = s - d;
        System.out.print(target);
        System.out.print(" ");
        for (int i = 0; i < money.length; i++) {

            int j = 0;
            while (j * money[i] <= target) {
                j++;
            }


            if (j - 1 > 0) {
                if(money[i]>=1){
                    System.out.print((int)money[i]);
                }
                else {
                    System.out.print(money[i]);
                }

                System.out.print(":");
                System.out.print(j - 1);
                System.out.print(";");
            }
            target =target-money[i]*(j-1);



        }
    }
}
