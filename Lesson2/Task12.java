package Lesson2;

//Предложите пользователю ввести два числа типа int и
//выведите на экран их сумму.

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);

        System.out.print("Введите любое целое число от 1 до 10: \n");
            int a = m.nextInt();
            int b = m.nextInt();

        System.out.print(a + b);
    }
}
