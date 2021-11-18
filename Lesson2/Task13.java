package Lesson2;

//Предложите пользователю ввести его имя и выведите
//на экран

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.println("Hello " + name);
    }
}
