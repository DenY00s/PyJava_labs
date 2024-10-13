import java.util.Arrays;
public class rotationmatrix {
    public static int[][] rotateMatrix90Degrees(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] rotatedMatrix = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedMatrix[j][rows - 1 - i] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }
    public static void main(String[] args) {
        // Пример исходной матрицы
        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        // Поворачиваем матрицу на 90 градусов
        int[][] rotatedMatrix = rotateMatrix90Degrees(matrix);

        // Выводим результат
        System.out.println("Повернутая матрица на 90 градусов:");
        for (int[] row : rotatedMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
