import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
//        task4();

    } public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    } public static void task1() {
        int[ ] arr = generateRandomArray();
        int totalExpenses = 0;
        for (int expense : arr) {
            totalExpenses += expense;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей", totalExpenses);

    } public static void task2() {
        int[ ] arr = generateRandomArray();
        int minExpense = arr[0];
        int maxExpense = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minExpense) {
                minExpense = arr[i];
            }
            if (arr[i] > maxExpense) {
                maxExpense = arr[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей\n",minExpense);
        System.out.printf("Максимальная сумма трат за день составила %d рублей\n",maxExpense);

    } public static void task3() {
        int[ ] arr = generateRandomArray();
        double totalExpenses = 0;
        for (double expense : arr) {
            totalExpenses += expense;
        }
        double averageExpense = totalExpenses / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n",averageExpense);

    } public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        StringBuilder currentName = new StringBuilder();
        for (char c : reverseFullName) {
            if (c != ' ') {
                currentName.append(c);
            } else {
                System.out.print(currentName.reverse() + " ");
                currentName.setLength(0);
            }
        }
        System.out.print(currentName.reverse());
    }
}