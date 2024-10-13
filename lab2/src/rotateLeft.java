import java.util.Scanner;
import java.util.Arrays;
public class rotateLeft {
    // Метод для поворота матрицы на 90 градусов против часовой стрелки
    public static int[][] rotateMatrix90DegreesCounterClockwise(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] rotatedMatrix = new int[cols][rows];

        // Транспонируем матрицу (меняем местами строки и столбцы)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedMatrix[cols - 1 - j][i] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }

    // Метод для ввода двумерного массива из консоли
    public static int[][] readMatrixFromConsole() {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества строк и столбцов
        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();

        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        // Создаем двумерный массив
        int[][] matrix = new int[rows][cols];

        // Заполняем массив элементами, введенными с клавиатуры
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Элемент [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        // Чтение массива из консоли
        int[][] matrix = readMatrixFromConsole();

        // Поворачиваем матрицу на 90 градусов против часовой стрелки
        int[][] rotatedMatrix = rotateMatrix90DegreesCounterClockwise(matrix);

        // Выводим результат
        System.out.println("Повернутая матрица на 90 градусов против часовой стрелки:");
        for (int[] row : rotatedMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
