import java.util.Scanner;

public class AlternatingSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (i % 2 == 0) {
                result += number;
            } else {
                result -= number;
            }
        }

        System.out.println(result);
    }
}
