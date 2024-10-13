import java.util.Arrays;
import java.util.Scanner;
public class MaxinAllRows {
    // Метод для нахождения максимального элемента в каждой строке
    public static int[] findMaxInEachRow(int[][] matrix) {
        int rows = matrix.length;
        int[] maxInRows = new int[rows];

        // Проходим по каждой строке массива
        for (int i = 0; i < rows; i++) {
            int max = matrix[i][0]; // Предполагаем, что первый элемент строки максимальный

            // Ищем максимальный элемент в текущей строке
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }

            // Сохраняем максимальный элемент строки в результирующий массив
            maxInRows[i] = max;
        }

        return maxInRows;
    }

    // Метод для ввода массива из консоли
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

        // Нахождение максимальных элементов в каждой строке
        int[] maxElements = findMaxInEachRow(matrix);

        // Вывод результата
        System.out.println("Максимальные элементы в каждой строке: " + Arrays.toString(maxElements));
    }
}
