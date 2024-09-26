import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetX = scanner.nextInt();
        int targetY = scanner.nextInt();
        scanner.nextLine(); // Пропустить перевод строки после чисел

        int currentX = 0, currentY = 0;
        int steps = 0;

        while (true) {
            String direction = scanner.nextLine();
            if (direction.equals("стоп")) {
                break;
            }

            int distance = scanner.nextInt();
            scanner.nextLine(); // Пропустить перевод строки

            switch (direction) {
                case "север":
                    currentY += distance;
                    break;
                case "юг":
                    currentY -= distance;
                    break;
                case "восток":
                    currentX += distance;
                    break;
                case "запад":
                    currentX -= distance;
                    break;
            }

            steps++;

            if (currentX == targetX && currentY == targetY) {
                break;
            }
        }

        System.out.println(steps);
    }
}
