import java.util.Scanner;
public class jianshe_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int res = 0;
        for(int a = 1; a <= A; a++) {
            for(int b = 1; b <= B; b++) {
                for(int c = 1; c <= C; c++) {
                    for(int d = 1; d <= D; d++) {
                        int diff = Math.abs(a - b);
                        if(isCoPrime(a,d) && diff % 3 == 0 &&
                                (b+c) % 5 == 0 && (a*c) % 4 == 0){
                            res++;
                        }

                    }
                }
            }
        }
        System.out.println(res);
    }
    public static boolean isCoPrime(int num1, int num2) {
        if(num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int r = 0;
        while((r = num1 % num2) != 0) {
            num1 = num2;
            num2 = r;
        }
        if(num2 == 1) return true;
        else return false;
    }
}