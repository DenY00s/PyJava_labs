import java.util.Scanner;

public class LogisticMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roadCount = scanner.nextInt();
        int maxRoad = 0;
        int maxHeight = Integer.MIN_VALUE;

        for (int i = 1; i <= roadCount; i++) {
            int tunnelCount = scanner.nextInt();
            int minHeight = Integer.MAX_VALUE;

            for (int j = 0; j < tunnelCount; j++) {
                int height = scanner.nextInt();
                if (height < minHeight) {
                    minHeight = height;
                }
            }

            if (minHeight > maxHeight) {
                maxHeight = minHeight;
                maxRoad = i;
            }
        }

        System.out.println(maxRoad + " " + maxHeight);
    }
}
