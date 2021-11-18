package Lesson3;

//Дан массив найти сумму всех положительных четных чисел в нем.

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Введи длину массива: ");
        int length = m.nextInt();
        int[] array = new int[length];

        for (int i = 0; i< length; i++) {
            System.out.print("Введите элемент массива #" + (i + 1) + ": ");
            array[i] = m.nextInt();
        }

        System.out.println("Ваш массив: " + Arrays.toString(array));

        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                sum += array[i];
            }
        }

        System.out.println("Сумма четных элементов массива равна " + sum + ";");
    }
}
