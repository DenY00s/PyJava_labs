import java.util.Arrays;

public class parsmass {

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] mergedArray = new int[length1 + length2]; // Новый массив для хранения результата
        int i = 0, j = 0, k = 0;

        // Слияние массивов до тех пор, пока не достигнем конца одного из них
        while (i < length1 && j < length2) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Добавляем оставшиеся элементы из первого массива (если есть)
        while (i < length1) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        // Добавляем оставшиеся элементы из второго массива (если есть)
        while (j < length2) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        // Пример использования
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 8};

        // Объединяем два отсортированных массива
        int[] result = mergeSortedArrays(arr1, arr2);

        // Выводим результат
        System.out.println("Объединенный отсортированный массив: " + Arrays.toString(result));
    }
}