import java.util.Scanner;
public class Matrixsum {
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

    public static int sumOfElements(int[][] matrix) {
        int sum = 0;

        // Проходим по каждой строке
        for (int i = 0; i < matrix.length; i++) {
            // Проходим по каждому элементу в строке
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j]; // Добавляем элемент к сумме
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // Чтение массива из консоли
        int[][] matrix = readMatrixFromConsole();

        // Вычисляем сумму всех элементов массива
        int result = sumOfElements(matrix);

        // Выводим результат
        System.out.println("Сумма всех элементов массива: " + result);
    }
}
