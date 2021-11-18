package Lesson2;

//Имеется N(тип int) копеек. Вывести на экран количество
//рублей и оставшихся копеек. Пример N = 223, вывод: 2
//рубля 23 копейки.

import java.math.RoundingMode;

public class Task8 {
    public static void main(String[] args) {
        int a = 10023;
        int b = a / 100;
        int rubli = (int)Math.floor(b);
        int kopeiki = a - rubli * 100;
                System.out.println(rubli + " рублей " + kopeiki + " копейки");
    }
}