import java.util.HashSet;
public class targetofsumm {
    public static int[] findPairWithSum(int[] arr, int target) {
        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int num : arr) {
            int complement = target - num; // Число, которое должно составить пару с текущим элементом

            // Проверяем, есть ли такое число в наборе
            if (seenNumbers.contains(complement)) {
                return new int[]{complement, num}; // Возвращаем пару
            }

            // Добавляем текущий элемент в набор
            seenNumbers.add(num);
        }

        // Если пара не найдена, возвращаем null
        return null;
    }

    public static void main(String[] args) {
        // Пример использования
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        // Поиск пары с заданной суммой
        int[] result = findPairWithSum(arr, target);

        // Вывод результата
        if (result != null) {
            System.out.println("Пара с суммой " + target + ": [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("Пара с суммой " + target + " не найдена.");
        }
    }
}
