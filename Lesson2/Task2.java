package Lesson2;

//Создайте переменную int со значение 127, преобразуйте ее к
//типу byte и выведите результат. Проделайте то же самое для
//значения 128.

public class Task2 {
    public static void main(String[] args) {
        int a = 127;
        byte b = (byte)a;  // преобразование типов: от типа int к типу byte
        System.out.println(b);
    }
}