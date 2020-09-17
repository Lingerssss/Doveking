import java.util.Scanner;

public class stack_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] numbers = new int[length];

        boolean broken = false;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int j = 1; j < length; j++) {

            if ((numbers[j] == n && numbers[j - 1] == m) ||
                    (numbers[j] == m && numbers[j + 1] == n )||( numbers[j] == m && numbers[j - 1] == n) ||( numbers[j] == n && numbers[j + 1] == m)) {
                broken = true;
            } else {
                broken = false;
            }

        }
        if (broken) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}