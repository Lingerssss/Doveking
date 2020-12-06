import java.util.Scanner;

public class WENWENWEN {
    public static void main(String[] args) {
        System.out.println("请问最帅的人是谁");
        Scanner sc=new Scanner(System.in);
        String me = sc.nextLine();
        if(me.equals("巩嘉熹")){
            System.out.println("答对了");
        }
        else {
            System.out.println("恶心");
        }
    }
}
