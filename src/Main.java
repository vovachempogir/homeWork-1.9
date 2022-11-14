import java.util.Arrays;
import java.util.Random;

public class Main {
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {

        System.out.println(" Задача 1 ");
        double allSpending = 0;
        for (int i = 0; i < arr.length; i++) {
            allSpending += arr[i];
            if (i == 29) {
                System.out.println(" Сумма всех трат за месяц составила " + allSpending + " рублей.");
            }
        }
        System.out.println(" Задача 2 ");
        int min = arr[0];
        int max = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > max) ;{
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(" Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

        System.out.println(" Задача 3 ");
        double averageAmount = allSpending / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей.");

        System.out.println(" Задача 4 ");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}