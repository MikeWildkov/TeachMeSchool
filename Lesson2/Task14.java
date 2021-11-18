package Lesson2;

//Найдите значение функции: ( (a - 3) * b / 2) + c.
//Значения a, b и c введите с клавиатуры.

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        int a = in.nextInt();
        System.out.print("Input a number 2: ");
        int b = in.nextInt();
        System.out.print("Input a number 3: ");
        int c = in.nextInt();

        int x = ((a - 3) * b / 2) + c;

        System.out.println(x);
    }
}