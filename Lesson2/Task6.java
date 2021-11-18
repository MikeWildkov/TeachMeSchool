package Lesson2;

//Напишите программу, которая сравнивает два числа и
//выводит на экран сначала большее из них, а потом меньшее.

public class Task6 {
    public static void main(String[] args) {
        int a = 55;
        int b = 66;
        if (a > b)
            System.out.println(a + " " + b);
        else if (a < b)
            System.out.println(b + " " + a);
        else if (a == b)
            System.out.println("Values are equal");
    }
}