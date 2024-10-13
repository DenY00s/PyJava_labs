import java.util.HashSet;
import java.util.Scanner;

public class unicalstr {

    public static String longestUniqueSubstring(String s) {
        int maxLength = 0;
        int start = 0; // Начало текущего окна
        int end = 0;   // Конец текущего окна
        String longestSubstring = "";
        HashSet<Character> uniqueChars = new HashSet<>();

        while (end < s.length()) {
            char currentChar = s.charAt(end);

            // Если текущий символ уже в множестве, удаляем символы слева до тех пор, пока не удалим повторяющийся
            while (uniqueChars.contains(currentChar)) {
                uniqueChars.remove(s.charAt(start));
                start++;
            }

            // Добавляем текущий символ в множество
            uniqueChars.add(currentChar);

            // Обновляем наибольшую длину и саму подстроку
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                longestSubstring = s.substring(start, end + 1);
            }

            end++;
        }

        return longestSubstring;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод строки от пользователя
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Вывод результата
        String result = longestUniqueSubstring(input);
        System.out.println("Наибольшая подстрока без повторяющихся символов: " + result);
    }
}