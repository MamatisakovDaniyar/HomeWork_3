import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");

       double[] numbers = {0.5, 0.25, -0.5, -0.25, 0.125, 0.0625, -0.125, -0.0625, 0.03125, 0.015625, -0.03125, -0.015625, 0.0078125, 0.00390625, -0.0078125};

        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        // Ищем первое отрицательное число
        int firstNegativeIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        // Считаем среднее арифметическое положительных чисел после первого отрицательного числа
        double sumOfPositives = 0;
        int countOfPositives = 0;
        for (int i = firstNegativeIndex + 1; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sumOfPositives += numbers[i];
                countOfPositives++;
            }
        }
        if (countOfPositives > 0) {
            double mean = sumOfPositives / countOfPositives;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного числа: " + mean);
        }
    }
}




