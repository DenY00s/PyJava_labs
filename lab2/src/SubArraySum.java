public class SubArraySum {
    public static int maxSubArraySum(int[] arr) {
        // Инициализируем текущую сумму и максимальную сумму
        int currentSum = arr[0];
        int maxSum = arr[0];

        // Проходим по массиву начиная со второго элемента
        for (int i = 1; i < arr.length; i++) {
            // Решаем, начинать новый подмассив или продолжать текущий
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            // Обновляем максимальную сумму
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // Пример использования
        int[] arr = {-2, 1, -3, -1, 6, 1, -2, -2, 4, -3, 2, 3, -2};

        // Находим максимальную сумму подмассива
        int result = maxSubArraySum(arr);

        // Выводим результат
        System.out.println("Максимальная сумма подмассива: " + result);
    }
}
