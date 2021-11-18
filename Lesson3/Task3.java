package Lesson3;

//Пользователь вводит два числа. Вывести все числа расположенные между ними.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);

        System.out.println("Введите первое число:");
            int num1 = m.nextInt();
        System.out.println("Введите второе число:");
            int num2 = m.nextInt();

        int min = Math.min(num1, num2);

        int x = Math.abs(Math.max(num1, num2) - Math.min(num1, num2));

        System.out.println("Массив чисел между значениями: ");
            if (x > 0){
                for (int i = 0; i < x - 1; i++) {
                    min += 1;
                    System.out.print(min + " ");
                }
            }
            else if (x == 0){                                   //не отрабатывает
                System.out.println("Не содержит значений");
            }
        }
}
